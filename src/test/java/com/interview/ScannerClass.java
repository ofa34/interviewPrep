package com.interview;

import java.util.Scanner;

public class ScannerClass {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("Enter your age");
        scanner.nextLine();
        int age = scanner.nextByte();

        System.out.println("enter your adress: ");
        scanner.nextLine();
        String adress = scanner.nextLine();

        System.out.println(name+" "+age+" "+adress);

    }
}
