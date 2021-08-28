package com.kimtan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + "!");

        System.out.println("What is your age?");
        String age = scanner.nextLine();

        System.out.println("You are " + age + " years old!");

        //This is a change...
    }
}
