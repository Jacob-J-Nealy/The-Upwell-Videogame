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

    // Entity Constructor
    public Entity(String name, int damageReduction, Weapon weapon, int levelAddress, int maxHealthpoints, int cuurentHealthpoints) {
        this.name = name;
        this.damageReduction = damageReduction;
        this.weapon = weapon;
        this.levelAddress = levelAddress;
        this.maxHealthpoints = maxHealthpoints;
        this.curentHealthpoints = cuurentHealthpoints;
    }

    // Empty Entity Constructor
    public Entity() {
    }

    // Entity toString
    @Override
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
    public String makeHealthBar(Entity entity) {

        int maxHealth = entity.getMaxHealthpoints();
        int currentaHealth = entity.getCurentHealthpoints();
        String healthBar ="null";

        switch (currentaHealth = maxHealth) {
            case 1 -> {

            }

        }
        return healthBar;
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
}
