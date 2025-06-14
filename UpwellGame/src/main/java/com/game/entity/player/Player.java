package com.game.entity.player;

import com.game.items.Item;
import com.game.weapons.Weapon;

import java.util.List;

public class Player {

    // Player Attributes
    private String name;
    private int healthpoints = 100;
    private int levelAddress;
    Weapon starterWeapon;
    List<Item> inventory;

    // Player Constructor
    public Player(String name, int levelAddress, Weapon starterWeapon, List<Item> inventory) {
        this.name = name;
        this.levelAddress = levelAddress;
        this.starterWeapon = starterWeapon;
        this.inventory = inventory;
    }

    // Getters and Setters

        // Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

        //HP
    public int getHealthpoints() {
        return healthpoints;
    }
    public void setHealthpoints(int healthpoints) {
        this.healthpoints = healthpoints;
    }

        //Level Location
    public int getLevelAddress() {
        return levelAddress;
    }
    public void setLevelAddress(int levelAddress) {
        this.levelAddress = levelAddress;
    }

        //Weapon
    public Weapon getStarterWeapon() {
        return starterWeapon;
    }
    public void setStarterWeapon(Weapon starterWeapon) {
        this.starterWeapon = starterWeapon;
    }

        //Inventory
    public List<Item> getInventory() {
        return inventory;
    }
    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }
}
