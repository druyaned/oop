package com.github.druyaned.solid.dependencyinversion;

import com.github.druyaned.solid.dependencyinversion.src.CashPayment;
import com.github.druyaned.solid.dependencyinversion.src.Shop;
import com.github.druyaned.solid.dependencyinversion.src.ShopBad;
import com.github.druyaned.solid.dependencyinversion.src.WebPayment;

/**
 * The fifth principle of the Object Oriented Programming.
 * 
 * <P>Dependency Inversion Principle (DIP) states:<br>
 * depend upon abstractions, not concretes.
 * 
 * @author  druyaned
 */
public class DependencyInversion {
    
    /**
     * To execute the practice implementation of the fifth OOP principle.
     * @param args no arguments must be given
     */
    public static void main(String[] args) {
        ShopBad badShop = new ShopBad();
        System.out.println("BadShop:");
        badShop.doPayment(9400);
        Shop goodShop = new Shop(new CashPayment());
        System.out.println("GoodShop:");
        goodShop.doPayment(9200);
        goodShop.setPayment(new WebPayment());
        goodShop.doPayment(8500);
    }
    
}
