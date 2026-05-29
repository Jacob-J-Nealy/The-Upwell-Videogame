package com.game.weapons.player;

import com.game.ui.Colors;
import com.game.weapons.Weapon;

public class TwinDaggers extends Weapon {

    // TwinDaggers Constructor
    public TwinDaggers(String name, int attackPower, int defensePower) {
        super(name, attackPower, defensePower);
    }

    // Attributes
    private boolean isCharged = false;

    // toString
    @Override
    public String toString() {
        return Colors.PURPLE + "Twin Daggers" + Colors.RESET;
    }

    // Player Attack Methods
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
         *      -> Uses 1 Turn to charge Special Attack
         *      -> Does Heavy Hit with 50% chance to chain another attack infinitely
         *      (All Damage variates +4 and -4 of base value)
         */
        if (!isCharged) {
            charge(); // skip turn
            return 0;
        }

        isCharged = false; // uses charge
        int totalDamage = 0;
        boolean continueChain = true;

        while (continueChain) {
            int hit = applyVariance((int)(getAttackPower() * 0.8), 4);
            totalDamage += hit;

            double chance = Math.random();

            if (chance >= 0.5) {
                continueChain = false;
            }
        }

        return totalDamage;
    }


    // Player Other Methods
    public void defend() {

    }
    public void charge() {
        isCharged = true;
    }
}
