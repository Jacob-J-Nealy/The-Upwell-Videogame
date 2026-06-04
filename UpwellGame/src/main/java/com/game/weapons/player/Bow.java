package com.game.weapons.player;

import com.game.ui.Colors;
import com.game.weapons.Weapon;

public class Bow extends Weapon {

    public Bow(String name, int attackPower, int defensePower) {
        super(name, attackPower, defensePower);
    }

    // Attributes
    private boolean shotArrow = false;
    private int turnsTillImpact = 2;

    // toString
    @Override
    public String toString() {
        return Colors.PURPLE + "Bow" + Colors.RESET;
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
         *      -> Shoots arrow super high
         *      -> takes two turns to come down and hit the enemy for guaranteed extremely high damage
         *      -> 30% chance of hitting
         *      -> 70% chance of missing and doing no damage
         */

        if (shotArrow) {
            turnsTillImpact--;
        } else {
            shotArrow = true;
        }

        if (turnsTillImpact == 0) {
            double chance = Math.random();
            shotArrow = false;
            turnsTillImpact = 2;

            while (chance >= 0.5) {
                return 50;
            }
        }

        return 0;
    }
    @Override
    public int defend() {

        return 0;
    }


}
