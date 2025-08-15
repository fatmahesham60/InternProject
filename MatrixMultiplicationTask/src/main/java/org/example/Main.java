package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class Main {
    public static int[][] readMatrix(String filePath) throws IOException {
        List<int[]> rows = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");
                int[] row = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();
                rows.add(row);
            }
        }
        return rows.toArray(new int[0][]);
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        //  Read matrices A and B
        int[][] A = readMatrix("A.txt");
        int[][] B = readMatrix("B.txt");

        int N = A.length;
        int M = A[0].length;
        int P = B[0].length;

        // Validate if dimensions compatible for multiplication
        if (B.length != M) {
            System.out.println("Matrix dimensions not compatible for multiplication");
            return;
        }
        int[][] C = new int[N][P];

        //  Thread pool
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());


        //  Assign one row per thread
        for (int i = 0; i < N; i++) {
            final int row = i;
            executor.submit(() -> {
                for (int j = 0; j < P; j++) {
                    int sum = 0;
                    for (int k = 0; k < M; k++) {
                        sum += A[row][k] * B[k][j];
                    }
                    C[row][j] = sum;
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.MINUTES);

        // Print result
        System.out.println(" Matrix C:");
        for (int[] row : C) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

