package com.github.druyaned.solid.singleresponsibility.src;

import java.util.ArrayList;
import static java.util.Collections.unmodifiableList;
import java.util.List;

public class CarManager {
    
    private final List<Car> cars;
    
    public CarManager() {
        cars = new ArrayList();
        cars.add(new Sedan());
        cars.add(new Van());
    }
    
    public List<Car> getAvailableCars() {
        return unmodifiableList(cars);
    }
    
    public Car getCarByType(String type) {
        for (Car car : cars) {
            if (car.getType().equals(type)) {
                return car;
            }
        }
        return null;
    }
    
}
