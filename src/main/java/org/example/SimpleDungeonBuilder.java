package org.example;

import java.util.ArrayList;
import java.util.List;


class SimpleDungeonBuilder implements IDungeonBuilder {
    private Dungeon dungeon;

    public SimpleDungeonBuilder() {
        dungeon = new Dungeon();
    }

    public IDungeonBuilder setDungeonName(String name) {
        dungeon.setName(name);
        return this;
    }

    public IDungeonBuilder addRoom(Room room) {
        dungeon.addRoom(room);
        return this;
    }

    public IDungeonBuilder addNPC(NPC npc) {
        dungeon.addNPC(npc);
        return this;
    }

    public Dungeon build() {
        return dungeon;
    }
}

