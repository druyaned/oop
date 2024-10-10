package com.github.druyaned.solid.singleresponsibility.src;

import java.time.LocalDateTime;

public class Order {
    
    private final Car car;
    private final int hours;
    private final int price;
    private final LocalDateTime start;
    private final LocalDateTime finish;
    
    public Order(Car car, int hours) {
        this.car = car;
        this.hours = hours;
        price = car.getPrice(hours);
        start = LocalDateTime.now();
        finish = start.plusHours(hours);
    }
    
    public Car getCar() {
        return car;
    }
    
    public int getHours() {
        return hours;
    }
    
    public int getPrice() {
        return price;
    }
    
    public LocalDateTime getStart() {
        return start;
    }
    
    public LocalDateTime getFinish() {
        return finish;
    }
    
    @Override public String toString() {
        return "Order{car=" + car +
                ", hours=" + hours +
                ", price=" + price +
                ", start=" + start +
                ", finish=" + finish + "}";
    }
    
}
