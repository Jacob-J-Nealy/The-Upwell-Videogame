package com.game.weapons.player;

import com.game.ui.Colors;
import com.game.weapons.Weapon;

public class Bow extends Weapon {

    public Bow(String name, int attackPower, int defensePower) {
        super(name, attackPower, defensePower);
    }

    // toString
    @Override
    public String toString() {
        return Colors.PURPLE + "Bow" + Colors.RESET;
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
