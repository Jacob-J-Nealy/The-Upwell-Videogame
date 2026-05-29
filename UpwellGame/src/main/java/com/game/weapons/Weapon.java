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

    // Abstract Action Methods
    public abstract int mainAttack();
    public abstract int heavyAttack();
    public abstract int specialAttack();
    public abstract int defend();

    // Protected Methods
    protected int applyVariance(int base, int variance) {
        int min = base - variance;
        int max = base + variance;

        return min + (int)(Math.random() * (max - min + 1));
    }
}


