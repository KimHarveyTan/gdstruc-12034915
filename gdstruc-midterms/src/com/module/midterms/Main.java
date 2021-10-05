package com.module.midterms;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner pause = new Scanner(System.in);
        Random rand = new Random();

        CardStack playerDeck = new CardStack();
        CardStack hand = new CardStack();
        CardStack pile = new CardStack();

        playerDeck.push(new Card(1, "Adrian"));
        playerDeck.push(new Card(2, "Ben"));
        playerDeck.push(new Card(3, "Catherine"));
        playerDeck.push(new Card(4, "Douglas"));
        playerDeck.push(new Card(5, "Elaine"));
        playerDeck.push(new Card(6, "Felix"));
        playerDeck.push(new Card(7, "George"));
        playerDeck.push(new Card(8, "Henry"));
        playerDeck.push(new Card(9, "Ilene"));
        playerDeck.push(new Card(10, "James"));
        playerDeck.push(new Card(11, "Kendrick"));
        playerDeck.push(new Card(12, "Leonard"));
        playerDeck.push(new Card(13, "Mimi"));
        playerDeck.push(new Card(14, "Nino"));
        playerDeck.push(new Card(15, "Ophelia"));
        playerDeck.push(new Card(16, "Pam"));
        playerDeck.push(new Card(17, "Qeline"));
        playerDeck.push(new Card(18, "Ronald"));
        playerDeck.push(new Card(19, "Shamiere"));
        playerDeck.push(new Card(20, "Timmy"));
        playerDeck.push(new Card(21, "Unie"));
        playerDeck.push(new Card(22, "Veronica"));
        playerDeck.push(new Card(23, "Walter"));
        playerDeck.push(new Card(24, "Xero"));
        playerDeck.push(new Card(25, "Yondu"));
        playerDeck.push(new Card(26, "Zidan"));
        playerDeck.push(new Card(27, "Adam"));
        playerDeck.push(new Card(28, "Ben"));
        playerDeck.push(new Card(29, "Celine"));
        playerDeck.push(new Card(30, "Dan"));

        int turn = 0;

        while (!playerDeck.isEmpty()){
            System.out.println("Turn: " + ++turn);

            randCommand(playerDeck, hand, pile);

            System.out.println("Player List of Cards: Numbered = " + hand.size());
            hand.printStack();
            System.out.println("Player Deck Number of Cards: " + playerDeck.size());
            System.out.println("Discarded Pile Number of Cards: " + pile.size());

            pause.nextLine();
        }

        System.out.println("Player Deck is Empty!");
    }

    public static void drawCard (CardStack playerDeck, CardStack hand) {
        Random rand = new Random();
        int randNum = 1 + rand.nextInt(5);

        for(int i = 0; i < randNum; i++){
            if(!playerDeck.isEmpty())
                hand.push(playerDeck.pop());
            else return;
        }
    }

    public static void discardCard (CardStack hand, CardStack pile) {
        Random rand = new Random();
        int randNum = 1 + rand.nextInt(5);

        for(int i = 0; i < randNum; i++){
            if(!hand.isEmpty())
                pile.push(hand.pop());
            else return;
        }
    }

    public static void getCard (CardStack pile, CardStack hand) {
        Random rand = new Random();
        int randNum = 1 + rand.nextInt(5);

        for(int i = 0; i < randNum; i++){
            if(!pile.isEmpty())
                hand.push(pile.pop());
            else return;
        }
    }

    public static void randCommand (CardStack playerDeck, CardStack hand, CardStack pile) {
        Random rand = new Random();
        int randNum = 1 + rand.nextInt(3);

        if (randNum == 1) drawCard(playerDeck, hand);
        if (randNum == 2) discardCard(hand, pile);
        if (randNum == 3) getCard(pile, hand);
    }
}
