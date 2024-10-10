package com.github.druyaned.designpatterns.structural.adapter.src;

/**
 * Subclass implementation of the adapter: square to round peg.
 * @author druyaned
 */
public class SquareToRoundPeg extends RoundPeg {
    
    public SquareToRoundPeg(SquarePeg squarePeg) {
        super(squarePeg.getWidth() / Math.sqrt(2));
    }
    
}
