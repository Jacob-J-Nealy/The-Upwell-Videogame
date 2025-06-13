package com.game.items;

public abstract class Items {

    // Item Attributes
    private String name;

    public Items(String name) {
        this.name = name;
    }

    // Methods
    public abstract void ability();
    public abstract void description();
}
