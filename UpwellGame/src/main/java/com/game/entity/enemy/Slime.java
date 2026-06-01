package com.game.entity.enemy;

import com.game.weapons.Weapon;
import com.game.weapons.enemy.Acid;

public class Slime extends Entity {


    // Slime Constructor 2
    public Slime() {
        super("GREEN SLIME",
                0,
                new Acid(8,2),
                1,
                25,
                25);
    }



}
