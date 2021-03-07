package com.company;

import java.util.Random;

public class Sportsmen {
    Random random = new Random();

    public int getAge() {
        return age;
    }

    public Sportsmen(int karma) {
        if (karma > 3) {
            this.strength = random.nextInt(3) + 3;
            this.endurance = random.nextInt(3) + 3;
            this.health = random.nextInt(3) + 3;
            this.charisma = random.nextInt(3) + 3;
        }
        else
        {
            this.strength = random.nextInt(3);
            this.endurance = random.nextInt(3);
            this.health = random.nextInt(3);
            this.charisma = random.nextInt(3);
        }
    }

    private int strength, endurance, health, charisma, age;
    public void setAge(int age)
    {
        this.age = age;
    }


    public int getStrength() {
        return strength;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getHealth() {
        return health;
    }

    public int getCharisma() {
        return charisma;
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