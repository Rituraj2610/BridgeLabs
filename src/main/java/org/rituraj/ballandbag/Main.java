package org.rituraj.ballandbag;

public class Main {
    public static void main(String[] args) {
        Bag bag = new Bag();

        bag.addBall(new Ball("Green"));
        bag.addBall(new Ball("Red"));
        bag.addBall(new Ball("Red"));
        bag.addBall(new Ball("Yellow"));
        bag.addBall(new Ball("Yellow"));
        bag.addBall(new Ball("Blue"));

        bag.showAllBalls();
    }
}
