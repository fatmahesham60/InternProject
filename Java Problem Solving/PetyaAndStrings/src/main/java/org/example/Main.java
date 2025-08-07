package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                String s1 = sc.nextLine().toLowerCase();
                String s2 = sc.nextLine().toLowerCase();

                for (int i = 0; i < s1.length(); i++) {

                    if (s1.charAt(i) < s2.charAt(i))
                    {
                        System.out.println(-1);
                        return;

                    }
                    else if (s1.charAt(i) > s2.charAt(i))
                    {
                        System.out.println(1);
                        return;
                    }
                }

                System.out.println(0);
                sc.close();
            }
        }
