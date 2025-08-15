package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final List<String> matrixList  = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            final int fileIndex = i;

            executor.submit(new FileReaderTask(fileIndex + ".txt"));
            System.out.println("Submitted file reader for " + fileIndex + ".txt");
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);

        Collections.sort(allNames);
        System.out.println("\nAll names sorted:");
        for (String fname : allNames) {
            System.out.println(fname);
        }
    }

    static class FileReaderTask implements Runnable {
        private final String filename;

        public FileReaderTask(String filename) {
            this.filename = filename;
        }

        @Override
        public void run() {
            File file = new File(filename);
            List<String> fileNames = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    fileNames.add(line.trim());

                }

                synchronized (allNames) {
                    allNames.addAll(fileNames);
                }
                System.out.println("Successfully read  " + fileNames.size() + " names from file" + fileNames );
            } catch (IOException e) {
                System.out.println("Error reading " + filename + ": " + e.getMessage());
            }
        }
    }
}
