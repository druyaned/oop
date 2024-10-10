package com.github.druyaned.designpatterns.creational.abstractfactory.src.audi;

import com.github.druyaned.designpatterns.creational.abstractfactory.src.EstateCar;

public class AudiEstate implements EstateCar {
    
    @Override public int bootSize() {
        return 505;
    }
    
    @Override public String bootSizeDimension() {
        return "L";
    }
    
    @Override public String getName() {
        return "Audi A4 Avant";
    }
    
}
