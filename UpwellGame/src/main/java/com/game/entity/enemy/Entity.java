package com.game.entity.enemy;

import com.game.weapons.Weapon;

public  abstract class Entity {

    // Entity Attributes
    private String name;
    private int curentHealthpoints;
    private int maxHealthpoints;
    private int levelAddress;
    private Weapon weapon;
    protected int damageReduction = 0;
    // Enemy Status Attributes
    private boolean stunned;
    private boolean poisoned;
    private boolean bleeding;
    private boolean ugly;

    public Entity(String name, int currentHealthpoints, int maxHealthpoints, int levelAddress, Weapon weapon, int damageReduction) {
        this.name = name;
        this.curentHealthpoints = currentHealthpoints;
        this.maxHealthpoints = maxHealthpoints;
        this.levelAddress = levelAddress;
        this.weapon = weapon;
        this.damageReduction = damageReduction;
    }

    // Empty Entity Constructor
    public Entity() {
    }

    // Entity toString
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", healthpoints=" + curentHealthpoints +
                ", levelAddress=" + levelAddress +
                ", weapon=" + weapon +
                '}';
    }

    // Action Methods
    public void takeDamage(int damage) {
        this.curentHealthpoints -= damage;

        if (this.curentHealthpoints < 0) {
            this.curentHealthpoints = 0;
        }
    }
    public boolean isAlive() {
        return this.curentHealthpoints > 0;
    }

    // Getters and Setters

        // Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
        //  Current HP
    public int getCurentHealthpoints() {
        return curentHealthpoints;
    }
    public void setCurentHealthpoints(int curentHealthpoints) {
        this.curentHealthpoints = curentHealthpoints;
    }

        // Max HP
    public int getMaxHealthpoints() {
        return maxHealthpoints;
    }
    public void setMaxHealthpoints(int maxHealthpoints) {
        this.maxHealthpoints = maxHealthpoints;
    }

    // Damage Reduction
    public int getDamageReduction() {
        return damageReduction;
    }
    public void setDamageReduction(int damageReduction) {
        this.damageReduction = damageReduction;
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

        // Stunned
    public boolean isStunned() {
        return stunned;
    }
    public void setStunned(boolean stunned) {
        this.stunned = stunned;
    }
}
