package com.github.druyaned.designpatterns.creational.abstractfactory.src.mercedes;

import com.github.druyaned.designpatterns.creational.abstractfactory.src.Crossover;

public class MercedesCrossover implements Crossover {
    
    @Override public int clearance() {
        return 215;
    }
    
    @Override public String clearanceDimension() {
        return "mm";
    }
    
    @Override public String getName() {
        return "Mercedes GLE";
    }
    
}
