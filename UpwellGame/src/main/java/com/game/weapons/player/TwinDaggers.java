package com.game.weapons.player;

import com.game.ui.Colors;
import com.game.weapons.Weapon;

public class TwinDaggers extends Weapon {

    // TwinDaggers Constructor
    public TwinDaggers(String name, int attackPower, int defensePower) {
        super(name, attackPower, defensePower);
    }

    // toString
    @Override
    public String toString() {
        return Colors.PURPLE + "Twin Daggers" + Colors.RESET;
    }

    // Player Action Methods
    public void mainAttack() {

    }
    public void heavyAttack() {

    }
    public void specialAttack() {

    }
    public void defend() {

    }
}
