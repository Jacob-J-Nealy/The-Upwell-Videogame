package com.game.weapons;

public abstract class Weapon {

    // Attributes
    private String name;
    private int attackPower;
    private int defensePower;

    public Weapon(String name, int attackPower, int defensePower) {
        this.name = name;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    // Getters and Setters

        // Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
        // Attack Power
    public int getAttackPower() {
        return attackPower;
    }
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
        // Defense Power
    public int getDefensePower() {
        return defensePower;
    }
    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }

    // Abstract Methods
    public abstract int mainAttack();
    public abstract void heavyAttack();
    public abstract void specialAttack();
    public abstract void defend();
}


