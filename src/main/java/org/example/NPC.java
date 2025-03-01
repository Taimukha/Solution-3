package org.example;


class NPC implements CloneableGameEntity {
    private String name;
    private String role;

    public NPC(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public CloneableGameEntity cloneEntity() {
        return new NPC(name, role);
    }

    @Override
    public String toString() {
        return "NPC{name='" + name + "', role='" + role + "'}";
    }
}
