package com.github.druyaned.designpatterns.creational.prototype.src;

/**
 * A simple car class has a {@code name}, {@code wheelCount} and {@code doorCount}.
 * @author druyaned
 */
public class Car implements Cloneable {
    
    private final String name;
    private final int wheelCount, doorCount;
    
    public Car(String name, int wheelCount, int doorCount) {
        this.name = name;
        this.wheelCount = wheelCount;
        this.doorCount = doorCount;
    }
    
    /**
     * This constructor allows to make a clone.
     * @param car to be cloned
     */
    protected Car(Car car) {
        name = car.name;
        wheelCount = car.wheelCount;
        doorCount = car.doorCount;
    }
    
    public String getName() {
        return name;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public int getDoorCount() {
        return doorCount;
    }
    
    @Override public Object clone() throws CloneNotSupportedException {
        return new Car(this);
    }
    
    @Override public String toString() {
        return String.format(
                "Car{name=%s, wheelCount=%d, doorCount=%d}",
                name, wheelCount, doorCount
        );
    }
    
}
