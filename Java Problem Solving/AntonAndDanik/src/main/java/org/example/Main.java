package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                String s = sc.next();

                int antonWins = 0;
                int danikWins = 0;

                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == 'A') {
                        antonWins++;
                    } else {
                        danikWins++;
                    }
                }

                if (antonWins > danikWins) {
                    System.out.println("Anton");
                }
                else if (danikWins > antonWins) {
                    System.out.println("Danik");
                }
                else {
                    System.out.println("Friendship");
                }

                sc.close();
            }
        }
