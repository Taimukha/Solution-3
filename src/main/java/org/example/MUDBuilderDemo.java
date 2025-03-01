package org.example;


public class MUDBuilderDemo {
    public static void main(String[] args) {
        IDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon dungeon = builder.setDungeonName("Dark Cave")
                .addRoom(new Room("Entrance Hall", "A dark and spooky entrance."))
                .addNPC(new NPC("Goblin", "A small but aggressive creature."))
                .build();

        System.out.println(dungeon);
    }
}
