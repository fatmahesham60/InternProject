package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();

        int antonwins = 0;
        int danikwins = 0;
        for (int i =0 ; i < n; i++) {
            if (s.charAt(i) == 'A') {
                antonwins++;
            } else {
                danikwins++;
            }
        }

        if (antonwins > danikwins) {
            System.out.println("Anton");
        }
        else if (danikwins > antonwins) {
            System.out.println("Danik");
        }
        else {
            System.out.println("Friendship");
        }
        sc.close();

    }
}
