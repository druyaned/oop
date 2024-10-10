package com.github.druyaned.designpatterns.structural.facade.src;

/**
 * Spelling variant of the "cheese" and its start index in a text
 * (an auxiliary pair for the {@link CheeseFinder}).
 * 
 * @author druyaned
 */
public class CheeseStart {
    
    private final String cheese;
    private final int start;
    
    public CheeseStart(String cheese, int start) {
        this.cheese = cheese;
        this.start = start;
    }
    
    public String getCheese() {
        return cheese;
    }
    
    public int getStart() {
        return start;
    }
    
    @Override public String toString() {
        return "CheeseStart{cheese=" + cheese + ", start=" + start + "}";
    }
    
}
