package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                int count = 0;

                for (int i = 0; i < n; i++) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();

                    if (a + b + c >= 2) {
                        count++;
                    }
                }

                System.out.println(count);
                sc.close();
            }
        }
