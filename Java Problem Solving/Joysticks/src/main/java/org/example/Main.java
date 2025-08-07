package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int minutes = 0;

        while (a1 > 0 && a2 > 0) {
            if (a1 > a2) {
                int temp = a1;   // to swap two variable values
                a1 = a2;
                a2 = temp;
            }
            a1 += 1;
            a2 -= 2;
            minutes++;

            if (a1 == 0 || a2 == 0) break;

        }
        System.out.println(minutes);
        sc.close();
    }
}
