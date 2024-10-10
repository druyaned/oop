package com.github.druyaned.designpatterns.structural.adapter.src;

/**
 * A simple class of a square peg with the only field - {@code width}.
 * @author druyaned
 */
public class SquarePeg {
    
    private final double width;
    
    public SquarePeg(double width) {
        this.width = width;
    }
    
    public double getWidth() {
        return width;
    }
    
}
