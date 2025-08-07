package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.next();

        Set<Character> distinctCharacters= new HashSet<>();
        for(char c : s.toCharArray())
        {
            distinctCharacters.add(c);
        }

            if(distinctCharacters.size() % 2 ==0){
                System.out.println("CHAT WITH HER!" );}
                else{
                    System.out.println("IGNORE HIM!" );
                }
                sc.close();
            }
        }
