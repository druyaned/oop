package com.github.druyaned.designpatterns.creational.builder.src;

import com.github.druyaned.designpatterns.creational.builder.src.additions.Garage;
import com.github.druyaned.designpatterns.creational.builder.src.additions.Garden;
import com.github.druyaned.designpatterns.creational.builder.src.additions.SwimmingPool;

/**
 * Provides all tools for the {@link House house} creation.
 * @author druyaned
 */
public class HouseBuilder {
    
    private House house;
    
    public HouseBuilder() {
        house = null;
    }
    
    public void newHouse() {
        house = new House();
    }
    
    public void putGarage(House house, int doorCount) {
        house.putAddition(Garage.class, new Garage(house, doorCount));
    }
    
    public void putGarden(House house, int treeCount) {
        house.putAddition(Garden.class, new Garden(house, treeCount));
    }
    
    public void putSwimminPool(House house, boolean lighting) {
        house.putAddition(SwimmingPool.class,new SwimmingPool(house, lighting));
    }
    
    public void removeGarage() {
        house.removeAddition(Garage.class);
    }
    
    public void removeGarden() {
        house.removeAddition(Garden.class);
    }
    
    public void removeSwimminPool() {
        house.removeAddition(SwimmingPool.class);
    }
    
    public House getResult() {
        return house;
    }
    
}
