package com.game.entity.player;

import com.game.entity.enemy.Entity;
import com.game.items.Item;
import com.game.weapons.Weapon;
import java.util.List;

public class Player extends Entity {

    // Player Specific Attributes
    private List<Item> inventory;

    // Player Constructor
    public Player(String name, int curentHealthpoints, int maxHealthpoints, int levelAddress, Weapon weapon, int damageReduction, List<Item> inventory) {
        super(name, curentHealthpoints, maxHealthpoints, levelAddress, weapon, damageReduction);
        this.inventory = inventory;
    }

    public Player() {
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
