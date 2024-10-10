package com.github.druyaned.solid.singleresponsibility.src;

import com.github.druyaned.solid.singleresponsibility.SingleResponsibility;
import java.util.List;
import java.util.Random;

/**
 * Right class with one responsibility: {@link #makeOrder() making an order}.
 * @author  druyaned
 * @see RentCarServiceBad
 * @see SingleResponsibility
 */
public class RentCarService {
    
    /**
     * Makes an order by asking the client for the necessary input
     * in the command line.
     * @return  an order by a given info from the client
     */
    public Order makeOrder() {
        System.out.println("Choosing a car to rent...");
        CarManager carManager = new CarManager();
        List<Car> cars = carManager.getAvailableCars();
        System.out.println("Available cars:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.printf("  %d) %s\n", i + 1, cars.get(i).getType());
        }
        Random random = new Random();
        int choice = 1 + random.nextInt(cars.size());
        Car car = cars.get(choice);
        System.out.println("Chosen car: " + car.getType());
        int hours = 3 + random.nextInt(48);
        System.out.print("Car will be rented for " + hours + " hours");
        return new Order(car, hours);
    }
    
}
