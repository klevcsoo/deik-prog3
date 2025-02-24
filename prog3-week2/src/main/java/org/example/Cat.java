package org.example;

public class Cat implements Cloneable {
    private String name;
    private int legCount;
    private String colour;
    private double hunger;

    public Cat() {

    }

    public Cat(String name, int legCount) {
        this.name = name;
        this.legCount = legCount;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegCount() {
        return this.legCount;
    }

    @Override
    public Cat clone() {
        Cat cat = new Cat();
        cat.name = this.name;
        cat.legCount = this.legCount;
        cat.colour = this.colour;
        cat.hunger = this.hunger;
        return cat;
    }
}
