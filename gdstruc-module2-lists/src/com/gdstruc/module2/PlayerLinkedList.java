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

    public void  size() {
        PlayerNode current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.getNextPlayer();
        }
        System.out.println(count);
    }

    public boolean contains(int id, String name, int level) {
        PlayerNode current = head;
        boolean contain = false;
        while (current != null) {
            if (id == current.getPlayer().getId() && name == current.getPlayer().getName() && level == current.getPlayer().getLevel()) {
                contain = true;
            }
            current = current.getNextPlayer();
        }
        return contain;
    }

    public int indexOf(int id, String name, int level) {
        PlayerNode current = head;
        int currentIndex = 0;
        while (current != null) {
            if (id == current.getPlayer().getId() && name == current.getPlayer().getName() && level == current.getPlayer().getLevel()) {
                return currentIndex;
            }
            current = current.getNextPlayer();
            currentIndex++;
        }
        return -1;
    }
}
