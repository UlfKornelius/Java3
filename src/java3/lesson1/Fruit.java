package ru.bondarev.java3.lesson1.hw1;

abstract class Fruit {
    protected float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return Double.toString((double) (Math.ceil(weight * 100)/100));
    }
}
