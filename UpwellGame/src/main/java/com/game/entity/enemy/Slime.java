package com.game.entity.enemy;

import com.game.weapons.Weapon;
import com.game.weapons.enemy.Acid;

public class Slime extends Entity {

    // Constructor
    public Slime() {
        super("GREEN SLIME", new Acid(8, 2), 1, 25);
    }



}
