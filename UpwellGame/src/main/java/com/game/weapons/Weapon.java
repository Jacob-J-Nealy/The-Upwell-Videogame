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

    public abstract void mainAttack();
    public abstract void heavyAttack();
    public abstract void specialAttack();
    public abstract void defend();
}
