package org.example;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        if (s.length() != t.length()) {
            System.out.println("NO");
            return;
        }
        if (t.equals(new StringBuilder(s).reverse().toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}