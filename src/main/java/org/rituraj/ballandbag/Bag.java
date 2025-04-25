package org.rituraj.ballandbag;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private List<Ball> balls;
    private final int MAX_SIZE = 12;

    public Bag() {
        balls = new ArrayList<>();
    }

    public void addBall(Ball ball) {
        String color = ball.getColor().toLowerCase();

        if (balls.size() >= MAX_SIZE) {
            System.out.println("Cannot add more balls. Bag is full.");
            return;
        }

        long redCount = countColor("red");
        long greenCount = countColor("green");
        long yellowCount = countColor("yellow");

        if (color.equals("red") && redCount >= greenCount) {
            System.out.println("Cannot add red ball. Red balls must be less than green balls.");
            return;
        }

        int currentSize = balls.size();
        int yellowLimit = (int) Math.floor(currentSize * 0.4); // allows 0 when empty

        if (color.equals("yellow") && yellowCount >= yellowLimit) {
            System.out.println("Cannot add yellow ball. Yellow balls must be less than or equal to 40% of total balls.");
            return;
        }

        balls.add(ball);
        System.out.println(color + " ball added to the bag.");
    }

    public void showAllBalls() {
        System.out.println("\nBalls in the bag:");
        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }

    private long countColor(String color) {
        return balls.stream()
                .filter(ball -> ball.getColor().equalsIgnoreCase(color))
                .count();
    }
}
