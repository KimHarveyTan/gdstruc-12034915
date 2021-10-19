package com.gdstruc.module2;

public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;

        if(head.getNextPlayer() != null)
        head.getNextPlayer().setPreviousPlayer(head);
    }

    public void  printList() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while(current != null){
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    public void deleteFirstElement(){
        head = head.getNextPlayer();
        head.setPreviousPlayer(null);
    }

    public int size() {
        PlayerNode current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.getNextPlayer();
        }
        return count;
    }
    public boolean contains(Player player) {
        PlayerNode current = head;
        boolean contain = false;
        while (current != null) {
            if (player.equals(current.getPlayer())){
                contain = true;
            }
            current = current.getNextPlayer();
        }
        return contain;
    }
    public int indexOf(Player player) {
        PlayerNode current = head;
        int currentIndex = 0;
        while (current != null) {
            if (player.equals(current.getPlayer())){
                return currentIndex;
            }
            current = current.getNextPlayer();
            currentIndex++;
        }
        return -1;
    }
}
