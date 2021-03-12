/* Copyright (c) 2021 oasomefun@futa.edu.ng. All Rights Reserved.
 * Redistribution of original or derived work requires permission.
 * Credits: MIT
 */
package turtle;

/**
 * An immutable point in floating-point pixel space.
 */
public class Point {

    private final double x;
    private final double y;

    /**
     * Construct a point at the given coordinates.
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return x-coordinate of the point
     */
    public double x() {
        return x;
    }

    /**
     * @return y-coordinate of the point
     */
    public double y() {
        return y;
    }
}
