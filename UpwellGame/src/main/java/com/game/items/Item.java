package com.game.items;

public abstract class Item {

    // Item Attributes
    private String name;

    public Item(String name) {
        this.name = name;
    }

    // Methods
    public abstract void ability();
    public abstract void description();
}
