package com.github.druyaned.designpatterns.creational.factorymethod;

import com.github.druyaned.designpatterns.creational.factorymethod.src.Logistics;
import com.github.druyaned.designpatterns.creational.factorymethod.src.RoadLogistics;
import com.github.druyaned.designpatterns.creational.factorymethod.src.SeaLogistics;
import com.github.druyaned.designpatterns.creational.factorymethod.src.Transport;

/**
 * Provides an interface for creating objects in a superclass,
 * but also allows subclasses to alter the type of objects that will be created.
 * 
 * <P><i>Usage</i><br>
 * The LogisticApp (client, this class) works with some {@link Logistics} classes (creators).
 * They in turn can create a new {@link Transport} (product) or return an existing one.
 * The client treats all the products and creators as abstractions that is good.
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the Factory Method when you don’t know beforehand the exact types and
 *      dependencies of the objects your code should work with.</li>
 *  <li>Use the Factory Method when you want to provide users of your library or
 *      framework with a way to extend its internal components.</li>
 *  <li>Use the Factory Method when you want to save system resources by
 *      reusing existing objects instead of rebuilding them each time.</li>
 * </ul>
 * 
 * @author druyaned
 */
public class FactoryMethod {
    
    public static void main(String[] args) {
        int cargoWeight = 25;
        {
            Logistics logistics = new RoadLogistics();
            logistics.getTransport("Truck#1");
            logistics.getTransport("Truck#2");
            showLogistics(logistics, cargoWeight);
        }
        {
            Logistics logistics = new SeaLogistics();
            logistics.getTransport("Ship#1");
            logistics.getTransport("Ship#2");
            showLogistics(logistics, cargoWeight);
        }
    }
    
    private static void showLogistics(Logistics logistics, int cargoWeightKg) {
        System.out.println("Logistics: " + logistics.getName());
        for (String id : logistics.getTransportIds()) {
            Transport transport = logistics.getTransport(id);
            System.out.print("  " + id + ": ");
            transport.deliver(cargoWeightKg);
        }
    }
    
}
