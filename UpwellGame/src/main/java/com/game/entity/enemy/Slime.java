package com.game.entity.enemy;

import com.game.weapons.Weapon;

public class Slime extends Entity {

    // Entity Attributes
    private String name = "GREEN SLIME";
    private int healthpoints = 25;
    private int levelAddress = 1;
    private Weapon acid;


    // Constructor
    public Slime(String name, Weapon weapon, int levelAddress, int healthpoints) {
        super(name, weapon, levelAddress, healthpoints);
    }

    // Empty Constructor
    public Slime() {
    }


    // Getters and Setters

        // Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

        // Weapon
    public Weapon getAcid() {
        return acid;
    }
    public void setAcid(Weapon acid) {
        this.acid = acid;
    }

        // Level Address
    public int getLevelAddress() {
        return levelAddress;
    }
    public void setLevelAddress(int levelAddress) {
        this.levelAddress = levelAddress;
    }

        // HP
    public int getHealthpoints() {
        return healthpoints;
    }
    public void setHealthpoints(int healthpoints) {
        this.healthpoints = healthpoints;
    }
}
