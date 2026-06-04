package com.game.weapons.player;

import com.game.ui.Colors;
import com.game.weapons.Weapon;

public class Sword extends Weapon {

    //  Sword Constructor
    public Sword(String name, int attackPower, int defensePower) {
        super(name, attackPower, defensePower);
    }

    // toString
    @Override
    public String toString() {
        return Colors.PURPLE + "Sword" + Colors.RESET;
    }

    // Player Action Methods
    @Override
    public int mainAttack() {
        /**
         * Functionality Explained:
         *      -> 5% Chance of Missing
         *      -> 25% Chance of Low Damage
         *      -> 70% Chance of Average Damage
         *      (All Damage variates +5 and -5 of base value)
         */

        double chance = Math.random();
        if (chance <= 0.05) {
            return 0; // missed
        }
        else if (chance > 0.05 && chance <= 0.30) {
            return applyVariance((int)(getAttackPower() * 0.7), 5); // low damage
        }
        else {
            return applyVariance(getAttackPower(),5); // average damage
        }
    }
    @Override
    public int heavyAttack() {
        /**
         * Functionality Explained:
         *      -> 10% Chance of Missing
         *      -> 25% Chance of Low Damage
         *      -> 25% Chance of Average Damage
         *      -> 35% Chance of High Damage
         *      -> 5% Insanely High Damage
         *      (All Damage variates +5 and -5 of base value)
         */

        double chance = Math.random();

        if (chance < 0.10) {
            return 0; // missed
        } else if (chance < 0.35) {
            return applyVariance((int)(getAttackPower() * 0.6), 5); // low damage
        } else if (chance < 0.60) {
            return applyVariance((getAttackPower()),5); // average damage
        } else if (chance < 0.95) {
            return applyVariance((int)(getAttackPower() * 1.4),5); // high damage
        } else {
            return applyVariance((int)(getAttackPower() * 2.0),10);
        }

    }
    @Override
    public int specialAttack() {
        /**
         * Functionality Explained:
         *      -> 50% Chance of Missing
         *      -> If hits, deals 5 damage and stuns enemy
         */

        double chance = Math.random();
        int hit = 5;

        if (chance >= 0.5) {
            return 0;
        } else {
            return hit;
        }
    }
    @Override
    public int defend() {

        return 0;
    }


}
