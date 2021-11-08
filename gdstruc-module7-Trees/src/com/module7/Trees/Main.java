package com.module7.Trees;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(17);
        tree.insert(29);
        tree.insert(10);
        tree.insert(16);
        tree.insert(-5);
        tree.insert(60);
        tree.insert(55);

//        System.out.println(tree.get(55));

        System.out.println("Min: " + tree.getMin());
        System.out.println("Max: " + tree.getMax());

        System.out.println("\nAscending: ");
        tree.traverseInOrder();

        System.out.println("\nDescending: ");
        tree.traverseInOrderDescending();
    }
}
