package com.github.druyaned.designpatterns.creational.abstractfactory.src.bmw;

import com.github.druyaned.designpatterns.creational.abstractfactory.src.EstateCar;

public class BMWEstate implements EstateCar {
    
    @Override public int bootSize() {
        return 500;
    }
    
    @Override public String bootSizeDimension() {
        return "L";
    }
    
    @Override public String getName() {
        return "BMW 3 Series Touring";
    }
    
}
