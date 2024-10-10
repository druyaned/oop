package com.github.druyaned.designpatterns.creational.factorymethod.src;

public class Ship extends Transport {
    
    public Ship(String id) {
        super(id);
    }
    
    @Override public void deliver(int weightKg) {
        System.out.printf(
                "Cargo weighing %d(kg) is delived by the ship with id=%s\n",
                weightKg, getId()
        );
    }
    
}
