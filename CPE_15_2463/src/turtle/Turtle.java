/* Copyright (c) 2021 oasomefun@futa.edu.ng. All Rights Reserved.
 * Redistribution of original or derived work requires permission.
 * Credits: MIT
 */
package turtle;

/**
 * Turtle interface.
 * 
 * Defines the interface that any turtle must implement. Note that the
 * standard directions/rotations use Logo semantics: initial heading
 * of zero is 'up', and positive angles rotate the turtle clockwise.
 * 
 * You may not modify this interface.
 */
public interface Turtle {

    /**
     * Move the turtle forward a number of steps.
     * 
     * @param units number of steps to move in the current direction; must be positive
     */
    public void forward(int units);

    /**
     * Change the turtle's heading by a number of degrees clockwise.
     * 
     * @param degrees amount of change in angle, in degrees, with positive being clockwise
     */
    public void turn(double degrees);

    /**
     * Change the turtle's current pen color.
     * 
     * @param color new pen color
     */
    public void color(PenColor color);

    /**
     * Draw the image created by this turtle.
     */
    public void draw();

}
