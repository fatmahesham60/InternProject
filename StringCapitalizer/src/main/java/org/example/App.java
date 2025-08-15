package org.example;

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println("Enter a string in lowercase : " + s);

        System.out.println("Capitalized String: " + StringUtils.upperCase(s));
    }
}
