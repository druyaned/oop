package com.github.druyaned.designpatterns.structural.composite.src;

/**
 * A simple component of a complex delivery package (node in a tree model)
 * provides {@code name} and {@code weight}.
 * 
 * @author druyaned
 */
public interface Unit {
    
    String getName();
    
    /**
     * Returns weight in grams (g).
     * @return weight in grams (g)
     */
    int getWeightG();
    
}
