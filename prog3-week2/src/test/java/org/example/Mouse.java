package org.example;

public class Mouse implements Cloneable {
    private double weight;
    private boolean isMale;

    public Mouse() {
    }

    public Mouse(double weight, boolean isMale) {
        this.weight = weight;
        this.isMale = isMale;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isMale() {
        return isMale;
    }

    @Override
    public Mouse clone() {
        Mouse mouse = new Mouse();
        mouse.weight = this.weight;
        mouse.isMale = this.isMale;
        return mouse;
    }
}
