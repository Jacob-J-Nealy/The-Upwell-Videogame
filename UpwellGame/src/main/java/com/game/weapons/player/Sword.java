package com.game.weapons.player;

import com.game.ui.Colors;
import com.game.weapons.Weapon;

public class Sword extends Weapon {

    // Constructor
    public Sword(String name, int attackPower, int defensePower) {
        super(name, attackPower, defensePower);
    }

    // toString
    @Override
    public String toString() {
        return Colors.PURPLE + "Sword" + Colors.RESET;
    }

    // Player Action Methods
    public int mainAttack() {
        return 0;
    }
    public int heavyAttack() {

        return 0;
    }
    public int specialAttack() {

        return 0;
    }
    public int defend() {

        return 0;
    }


}
