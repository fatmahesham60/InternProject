package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int X = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (s.contains("++")) {
                X++;

            }
            else if (s.contains("--")) X--;

            }

         System.out.println(X);

    }
}
