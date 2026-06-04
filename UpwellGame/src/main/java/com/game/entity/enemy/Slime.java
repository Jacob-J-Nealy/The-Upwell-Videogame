package com.game.entity.enemy;

import com.game.weapons.Weapon;
import com.game.weapons.enemy.Acid;

public class Slime extends Entity {


    // Slime Constructor
    public Slime() {
        super("GREEN SLIME", 10000, 25, 1, new Acid(8,2), 25);
    }
}
