package com.module6.SearchAlgorithms;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int numbers[] = {60, 33, 12, 64, 17, 105, -53};

        System.out.println(fourCloversWagerSearch(numbers, 17));
    }

    public static int fourCloversWagerSearch(int[] input, int value)
    {
        boolean oneDone = false;
        boolean twoDone = false;
        boolean threeDone = false;
        boolean fourDone = false;

        while (!oneDone || !twoDone || !threeDone || !fourDone)
        {
            Random rand = new Random();
            int randNum = 1 + rand.nextInt(4);

            if(randNum == 2 && twoDone) randNum++;
            if(randNum == 3 && threeDone) randNum++;
            if(randNum == 4 && fourDone) randNum = 1;

            if (randNum == 4 && !fourDone)
            {
                for (int i = 0; i < input.length; i += 4)
                {
                    if (input[i] == value)
                    {
                        return i;
                    }
                }
                fourDone = true;
            }
            if (randNum == 3 && !threeDone)
            {
                for (int i = 0; i < input.length; i += 3)
                {
                    if (input[i] == value)
                    {
                        return i;
                    }
                }
                threeDone = true;
            }
            if (randNum == 2 && !twoDone)
            {
                for (int i = 0; i < input.length; i += 2)
                {
                    if (input[i] == value)
                    {
                        return i;
                    }
                }
                twoDone = true;
            }
            if (randNum == 1 && !oneDone)
            {
                for (int i = 0; i < input.length; i++)
                {
                    if (input[i] == value)
                    {
                        return i;
                    }
                }
                oneDone = true;
            }
            if (oneDone) return -1;
        }
        return -1;
    }

    public static int linearSearch(int[] input, int value)
    {
        for (int i = 0; i < input.length; i++)
        {
            if (input[i] == value)
            {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] input, int value)
    {
        int start = 0;
        int end = input.length - 1;

        while (start <= end)
        {
            int middle = (start + end) / 2;

            if (input[middle] == value)
            {
                return middle;
            }
            else if (value < input[middle]) // value might be at left half
            {
                end = middle - 1;
            }
            else if (value > input[middle]) // value might be at right half
            {
                start = middle + 1;
            }
        }

        return -1;
    }
}
