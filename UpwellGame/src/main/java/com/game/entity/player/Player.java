package com.game.entity.player;

import com.game.entity.enemy.Entity;
import com.game.items.Item;
import com.game.weapons.Weapon;
import java.util.List;

public class Player extends Entity {

    // Player Specific Attributes
    private List<Item> inventory;

    // Player Constructor


    public Player(String name, Weapon weapon, int levelAddress, int healthpoints, List<Item> inventory) {
        super(name, weapon, levelAddress, healthpoints);
        this.inventory = inventory;
    }

    public Player() {
        super("what is my name again?", null, 1, 100);
    }

    // Player Constructor (Empty)
    public Player(String name, Weapon weapon, int levelAddress, int healthpoints) {
        super(name, weapon, levelAddress, healthpoints);
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
