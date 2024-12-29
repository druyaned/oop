package druyaned.designpatterns.creational.builder.src.additions;

import druyaned.designpatterns.creational.builder.src.Addition;
import druyaned.designpatterns.creational.builder.src.House;

public class Garage implements Addition {
    
    private final House house;
    private final int doorCount;
    
    public Garage(House house, int doorCount) {
        this.house = house;
        this.doorCount = doorCount;
    }
    
    @Override public House house() {
        return house;
    }
    
    public int getDoorCount() {
        return doorCount;
    }
    
    @Override public String toString() {
        return "Garage{doorCount=" + doorCount + "}";
    }
    
}
