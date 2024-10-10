package com.github.druyaned.designpatterns.creational.builder.src.additions;

import com.github.druyaned.designpatterns.creational.builder.src.Addition;
import com.github.druyaned.designpatterns.creational.builder.src.House;

public class SwimmingPool implements Addition {
    
    private final House house;
    private final boolean lighting;
    
    public SwimmingPool(House house, boolean lighting) {
        this.house = house;
        this.lighting = lighting;
    }
    
    @Override public House house() {
        return house;
    }
    
    public boolean hasLighting() {
        return lighting;
    }
    
    @Override public String toString() {
        return "SwimmingPool{lighting=" + lighting + "}";
    }
    
}
