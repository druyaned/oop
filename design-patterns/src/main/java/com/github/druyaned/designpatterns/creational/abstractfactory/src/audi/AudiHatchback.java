package com.github.druyaned.designpatterns.creational.abstractfactory.src.audi;

import com.github.druyaned.designpatterns.creational.abstractfactory.src.Hatchback;

public class AudiHatchback implements Hatchback {
    
    @Override public int horsepower() {
        return 201;
    }
    
    @Override public String getName() {
        return "Audi A3";
    }
    
}
