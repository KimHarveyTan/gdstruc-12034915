package com.gdstruc.module2;

public class Main {

    public static void main(String[] args) {

        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon = new Player(2, "LethalBacon", 205);
        Player hpDeskJet = new Player(3, "HPDeskJet", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskJet);

        playerLinkedList.deleteFirstElement();

        playerLinkedList.printList();

        System.out.print("Linked list's size of elements: ");
        playerLinkedList.size();

        System.out.println("Contains: " + playerLinkedList.contains(1, "Asuna", 100));
        System.out.println("Index of: " + playerLinkedList.indexOf(1, "Asuna", 100));
    }
}
