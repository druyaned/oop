package com.github.druyaned.solid.singleresponsibility;

import com.github.druyaned.solid.singleresponsibility.src.OrderPrinter;
import com.github.druyaned.solid.singleresponsibility.src.RentCarService;
import com.github.druyaned.solid.singleresponsibility.src.RentCarServiceBad;
import com.github.druyaned.solid.singleresponsibility.src.Order;

/**
 * The first principle of the Object Oriented Programming.
 * 
 * <P>Single Responsibility Principle (SPR) states:<br>
 * a class should have one and only one reason to change,
 * meaning that a class should have only one job.
 * 
 * @author druyaned
 * @see RentCarService
 * @see RentCarServiceBad
 */
public class SingleResponsibility {
    
    /**
     * To execute the practice implementation of the first OOP principle.
     * @param args  no arguments must be given
     */
    public static void main(String[] args) {
        RentCarService rentCarService = new RentCarService();
        Order order = rentCarService.makeOrder();
        OrderPrinter orderPrinter = new OrderPrinter();
        orderPrinter.print(order);
    }
    
}
