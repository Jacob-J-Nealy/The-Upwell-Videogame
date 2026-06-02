package com.game.entity.player;

import com.game.entity.enemy.Entity;
import com.game.items.Item;
import com.game.weapons.Weapon;
import java.util.List;

public class Player extends Entity {

    // Player Specific Attributes
    private List<Item> inventory;

    // Player Constructor
    public Player() {
        super("what is my name!???",
                100,
                100,
                1,
                null,
                0);
    }


    // Getters and Setters

        //Inventory
    public List<Item> getInventory() {
        return inventory;
    }
    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }
}
