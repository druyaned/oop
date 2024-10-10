package com.github.druyaned.designpatterns.creational.abstractfactory.src;

/**
 * Car type with properties: boot size, boot size dimension, name.
 * @author druyaned
 * @see CarFactory
 */
public interface EstateCar {
    
    int bootSize();
    
    String bootSizeDimension();
    
    String getName();
    
}
