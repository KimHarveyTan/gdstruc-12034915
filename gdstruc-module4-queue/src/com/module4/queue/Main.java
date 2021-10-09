package com.module4.queue;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pause = new Scanner(System.in);
        Random rand = new Random();

        ArrayQueue playerList = new ArrayQueue(5);
        ArrayQueue queue = new ArrayQueue(5);

        playerList.add(new Player(1, "aceu", 100));
        playerList.add(new Player(2, "Sinatraa", 100));
        playerList.add(new Player(3, "Subroza", 95));
        playerList.add(new Player(4, "ploo", 90));
        playerList.add(new Player(5, "tenZ", 95));
        playerList.add(new Player(6, "Bob", 85));
        playerList.add(new Player(7, "Jennie", 65));
        playerList.add(new Player(8, "Felix", 92));
        playerList.add(new Player(9, "Arduin", 94));
        playerList.add(new Player(10, "Henry", 91));

        int gameCounter = 0;
        int turn = 0;

        while(gameCounter < 10){
            System.out.println("Turn: " + ++turn);

            randQueue(playerList, queue);
            System.out.println("Queued Players:");
            queue.printQueue();

            gameCounter = startGame(playerList, queue, gameCounter);

            System.out.println("\nGame Started: " + gameCounter);
            System.out.println("\nQueued Players Remaining:");
            queue.printQueue();

            pause.nextLine();
        }

        System.out.println("10 games has started.");
    }

    public static void randQueue (ArrayQueue playerList, ArrayQueue queue)
    {
        Random rand = new Random();
        int randNum = 1 + rand.nextInt(7);

        for(int i = 0; i < randNum; i++){
            if(playerList.size() > 0)
            {
                queue.add(playerList.remove());
            }
            else return;
        }
    }

    public static int startGame (ArrayQueue playerList, ArrayQueue queue, int gameCounter)
    {
        if (queue.size() >= 5)
        {
            for (int i = 0; i < 5; i++){
                playerList.add(queue.remove());
            }
            gameCounter++;
        }
        return gameCounter;
    }
}
