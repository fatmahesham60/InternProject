package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||s.charAt(i) == 'y' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'|| s.charAt(i) == 'y')
            {
                continue;
            }
            else {
                System.out.print("."+s.charAt(i));
            }

        }
        }
    }