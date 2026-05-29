package com.game.entity.enemy;

import com.game.weapons.Weapon;

public  abstract class Entity {

    // Entity Attributes
    private String name;
    private int healthpoints;
    private int levelAddress;
    private Weapon weapon;

    // Entity Constructor
    public Entity(String name, Weapon weapon, int levelAddress, int healthpoints) {
        this.name = name;
        this.weapon = weapon;
        this.levelAddress = levelAddress;
        this.healthpoints = healthpoints;
    }

    // Empty Entity Constructor
    public Entity() {
    }

    // Entity toString
    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", healthpoints=" + healthpoints +
                ", levelAddress=" + levelAddress +
                ", weapon=" + weapon +
                '}';
    }

    // Action Methods
    public void takeDamage(int damage) {
        this.healthpoints -= damage;

        if (this.healthpoints < 0) {
            this.healthpoints = 0;
        }
    }
    public boolean isAlive() {
        return this.healthpoints > 0;
    }

    // Getters and Setters

        // Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
        // HP
    public int getHealthpoints() {
        return healthpoints;
    }
    public void setHealthpoints(int healthpoints) {
        this.healthpoints = healthpoints;
    }

        // Level Address
    public int getLevelAddress() {
        return levelAddress;
    }
    public void setLevelAddress(int levelAddress) {
        this.levelAddress = levelAddress;
    }

        // Weapon
    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
