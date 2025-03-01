package org.example;

import java.util.ArrayList;
import java.util.List;


class Dungeon {
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<NPC> npcs = new ArrayList<>();

    public void setName(String name) { this.name = name; }
    public void addRoom(Room room) { rooms.add(room); }
    public void addNPC(NPC npc) { npcs.add(npc); }

    @Override
    public String toString() {
        return "Dungeon: " + name + "\nRooms: " + rooms + "\nNPCs: " + npcs;
    }
}
