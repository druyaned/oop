package com.github.druyaned.solid.singleresponsibility.src;

public class Sedan implements Car {
    
    @Override public String getType() {
        return "sedan";
    }
    
    @Override public int getBasePrice() {
        return 1500;
    }
    
    @Override public int getPricePerHour() {
        return 300;
    }
    
    @Override public String toString() {
        return "Sedan{type=" + getType() +
                ", basePrice=" + getBasePrice() +
                ", pricePerHour=" + getPricePerHour() + "}";
    }
    
}
