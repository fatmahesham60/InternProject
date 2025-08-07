package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String s = sc.next();
         int upperCount=0;
         int lowerCount=0;
         for( char c : s.toCharArray()){

             if(Character.isUpperCase(c)){
                 upperCount++;
             }
                 else{
                 lowerCount++;
             }
             }
                if(upperCount>lowerCount){
                    System.out.println(s.toUpperCase());
                }
                else{
                    System.out.println(s.toLowerCase());
                }
             }
         }
