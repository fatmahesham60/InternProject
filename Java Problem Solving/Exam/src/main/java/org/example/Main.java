package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> myNumbers = new ArrayList<Integer>();
        int lastOdd=0;
        int firstEven = 0;
        if (n == 1|| n==2) {
            System.out.println(1);
            System.out.println(1);
            return;
        }
        if (n == 3) {
            System.out.println(2);
            System.out.println("1 3");
            return;
        }
        if (n == 4) {
            System.out.println(4);
            System.out.println("3 1 4 2 ");
            return;
        }

        for (int i = 1; i <= n; i += 2) {
            myNumbers.add(i);
            lastOdd = myNumbers.getLast();
        }
        for (int i = 2; i <= n; i += 2) {
            myNumbers.add(i);
            firstEven = myNumbers.getFirst();
        }



        System.out.println(myNumbers.size());
        for (int i = 0; i < myNumbers.size(); i++) {
            System.out.print(myNumbers.get(i) + (i == myNumbers.size() - 1 ? "" : " "));
        }

        sc.close();
        }
    }






        


