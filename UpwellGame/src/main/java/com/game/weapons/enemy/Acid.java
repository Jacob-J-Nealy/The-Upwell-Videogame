package com.game.weapons.enemy;

import com.game.ui.Colors;
import com.game.weapons.Weapon;

public class Acid extends Weapon {

    // Constructor
    public Acid(int attackPower, int defensePower) {
        super("Acid", attackPower, defensePower);
    }

    @Override
    public String toString() {
        return Colors.GREEN + "Acid" + Colors.RESET;
    }

    @Override
    public void mainAttack() {

    }

    @Override
    public void heavyAttack() {

    }

    @Override
    public void specialAttack() {

    }

    @Override
    public void defend() {

    }
}
