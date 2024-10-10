package com.github.druyaned.designpatterns.creational.abstractfactory.src.mercedes;

import com.github.druyaned.designpatterns.creational.abstractfactory.src.Hatchback;

public class MercedesHatchback implements Hatchback {
    
    @Override public int horsepower() {
        return 188;
    }
    
    @Override public String getName() {
        return "Mercedes A Class";
    }
    
}
