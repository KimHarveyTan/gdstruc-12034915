package com.module5.hashtables;

public class Main {

    public static void main(String[] args) {

	    Player ploo = new Player(134, "Plooful", 135);
        Player wardell = new Player(536, "TSM Wardell", 640);
        Player deadlyJimmy = new Player(32, "DeadlyJimmy", 34);
        Player subroza = new Player(4931, "Subroza", 604);
        Player annieDro = new Player(6919, "C9 Annie1", 593);
        Player annieDro2 = new Player(6919, "C9 Annie2", 593);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(ploo.getUserName(), ploo);
        hashtable.put(wardell.getUserName(), wardell);
        hashtable.put(deadlyJimmy.getUserName(), deadlyJimmy);
        hashtable.put(subroza.getUserName(), subroza);
        hashtable.put(annieDro.getUserName(), annieDro);
        hashtable.put(annieDro2.getUserName(), annieDro2);

        System.out.println("Before remove function: ");
        hashtable.printHashtable();

        hashtable.remove("C9 Annie2");
        System.out.println("\nAfter remove function: ");
        hashtable.printHashtable();

//        System.out.println(hashtable.get("Subroza"));
    }
}
