package org.example;


public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room originalRoom = new Room("Treasure Chamber", "A room filled with gold and jewels.");
        Room clonedRoom = (Room) originalRoom.cloneEntity();

        System.out.println("Original: " + originalRoom);
        System.out.println("Cloned: " + clonedRoom);
    }
}
