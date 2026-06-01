package com.game.entity.enemy;

import com.game.weapons.Weapon;

public  abstract class Entity {

    // Entity Attributes
    private String name;
    private int cuurentHealthpoints;
    private int maxHealthpoints;
    private int levelAddress;
    private Weapon weapon;
    protected int damageReduction = 0;

    // Entity Constructor
    public Entity(String name, int damageReduction, Weapon weapon, int levelAddress, int maxHealthpoints, int cuurentHealthpoints) {
        this.name = name;
        this.damageReduction = damageReduction;
        this.weapon = weapon;
        this.levelAddress = levelAddress;
        this.maxHealthpoints = maxHealthpoints;
        this.cuurentHealthpoints = cuurentHealthpoints;
    }

    // Empty Entity Constructor
    public Entity() {
    }

    // Entity toString
    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", healthpoints=" + cuurentHealthpoints +
                ", levelAddress=" + levelAddress +
                ", weapon=" + weapon +
                '}';
    }

    // Action Methods
    public void takeDamage(int damage) {
        this.cuurentHealthpoints -= damage;

        if (this.cuurentHealthpoints < 0) {
            this.cuurentHealthpoints = 0;
        }
    }
    public boolean isAlive() {
        return this.cuurentHealthpoints > 0;
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
    public int getCuurentHealthpoints() {
        return cuurentHealthpoints;
    }
    public void setCuurentHealthpoints(int cuurentHealthpoints) {
        this.cuurentHealthpoints = cuurentHealthpoints;
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
