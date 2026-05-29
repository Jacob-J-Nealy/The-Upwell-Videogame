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
    public void heavyAttack() {
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
        if (chance)

    }
    public void specialAttack() {

    }
    public void defend() {

    }
}
