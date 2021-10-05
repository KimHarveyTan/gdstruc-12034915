package com.gdstruc.module3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner pause = new Scanner(System.in);
        LinkedStack stack = new LinkedStack();

        stack.push(new Player(1, "aceu", 100));
        stack.push(new Player(2, "Sinatraa", 100));
        stack.push(new Player(3, "Subroza", 95));
        stack.push(new Player(4, "ploo", 90));

        stack.printStack();
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Peeking: " + stack.peek());

//        stack.printStack();
    }
}
