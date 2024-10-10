package com.github.druyaned.solid.singleresponsibility.src;

import com.github.druyaned.solid.singleresponsibility.SingleResponsibility;

/**
 * This is a bad implementation of the {@link RentCarService} class.
 * The problem is in the wrong methods: {@link #chooseCar(java.lang.String)} and
 * {@link #printOrder(Order)}.
 * @author  druyaned
 * @see RentCarService
 * @see SingleResponsibility
 */
public class RentCarServiceBad {
    
    /**
     * <i>Wrong method</i>. This responsibility must be taken by the {@link CarManager}.
     * @param type  car's type: sedan or van
     * @return  a car according to the given type
     */
    public Car chooseCar(String type) {
        switch (type) {
            case "sedan" -> { return new Sedan(); }
            case "van" -> { return new Van(); }
            default -> { return null; }
        }
    }
    
    /**
     * The only right method.
     * Makes an order by asking the client for the necessary input
     * in the command line.
     * @return  an order by a given info from the client
     */
    public Order makeOrder() {
        return new RentCarService().makeOrder();
    }
    
    /**
     * <b>Wrong method</b>. This responsibility must be taken by the {@link OrderPrinter}.
     * @param order to be printed in the command line
     */
    public void printOrder(Order order) {
        System.out.println(order);
    }
    
}
