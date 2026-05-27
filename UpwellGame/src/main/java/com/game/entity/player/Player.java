package com.game.entity.player;

import com.game.entity.enemy.Entity;
import com.game.items.Item;
import com.game.weapons.Weapon;

import java.util.List;

public class Player extends Entity {

    // Player Attributes
    private String name;
    private int healthpoints = 100;
    private int levelAddress;
    Weapon starterWeapon;
    List<Item> inventory;

    // Player Constructor


    public Player(String name, Weapon weapon, int levelAddress, int healthpoints, String name1, List<Item> inventory, Weapon starterWeapon, int levelAddress1, int healthpoints1) {
        super(name, weapon, levelAddress, healthpoints);
        this.name = name1;
        this.inventory = inventory;
        this.starterWeapon = starterWeapon;
        this.levelAddress = levelAddress1;
        this.healthpoints = healthpoints1;
    }

    // Player Constructor (Empty)
    public Player(String name, Weapon weapon, int levelAddress, int healthpoints) {
        super(name, weapon, levelAddress, healthpoints);
    }

    public Player() {
        super();
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
