package com.game.entity.enemy;

import com.game.weapons.Weapon;
import com.game.weapons.enemy.Acid;

public class Slime extends Entity {


    // Slime Constructor
    public Slime(String name, int curentHealthpoints, int maxHealthpoints, int levelAddress, Weapon weapon, int damageReduction) {
        super("GREEN SLIME", 25, 25, 1, new Acid(8,2), 25);
    }
}
