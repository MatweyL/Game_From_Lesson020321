package com.company;

public class Enemy {
    private int strength, endurance, health, charisma;

    public Enemy(int strength, int endurance, int health, int charisma) {
        this.strength = strength;
        this.endurance = endurance;
        this.health = health;
        this.charisma = charisma;
    }

    public int getHealth() {
        return health;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getStrength() {
        return strength;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }
}
