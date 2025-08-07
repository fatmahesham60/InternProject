package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int row = 0;
                int col = 0;

                for (int i = 1; i <= 5; i++) {

                    for (int j = 1; j <= 5; j++) {

                        int value = sc.nextInt();
                        if (value == 1) {
                            row = i;
                            col = j;
                        }
                    }
                }

                int moves = Math.abs(row - 3) + Math.abs(col - 3);
                System.out.println(moves);

                sc.close();
            }
        }
