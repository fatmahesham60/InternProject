package org.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String word= sc.next();
           char firstChar = word.charAt(0);

        if (Character.isUpperCase(firstChar)){
            System.out.println(word);
        }
        else{
            System.out.println(Character.toUpperCase(firstChar)+ word.substring(1));
        }
        sc.close();
        }
}
