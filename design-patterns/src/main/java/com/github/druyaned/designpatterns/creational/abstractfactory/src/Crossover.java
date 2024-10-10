package com.github.druyaned.designpatterns.creational.abstractfactory.src;

/**
 * Car type with properties: clearance, clearance dimension, name.
 * @author druyaned
 * @see CarFactory
 */
public interface Crossover {
    
    int clearance();
    
    String clearanceDimension();
    
    String getName();
    
}
