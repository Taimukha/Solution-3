package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Builder Pattern ===");
        IDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon dungeon = builder.setDungeonName("Dark Cave")
                .addRoom(new Room("Entrance Hall", "A dark and spooky entrance."))
                .addNPC(new NPC("Goblin", "A small but aggressive creature."))
                .build();
        System.out.println(dungeon);
        System.out.println("\n=== Prototype Pattern ===");
        Room originalRoom = new Room("Treasure Chamber", "A room filled with gold and jewels.");
        Room clonedRoom = (Room) originalRoom.cloneEntity();

        System.out.println("Original: " + originalRoom);
        System.out.println("Cloned: " + clonedRoom);
    }
}
