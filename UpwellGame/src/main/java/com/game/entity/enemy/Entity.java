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

}
