package org.rituraj.ballandbag;

public class Ball {
    private String color;

    public Ball(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ball{" + "color='" + color + '\'' + '}';
    }
}
