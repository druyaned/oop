package com.github.druyaned.designpatterns.creational.abstractfactory;

import com.github.druyaned.designpatterns.creational.abstractfactory.src.mercedes.MercedesFactory;
import com.github.druyaned.designpatterns.creational.abstractfactory.src.EstateCar;
import com.github.druyaned.designpatterns.creational.abstractfactory.src.audi.AudiFactory;
import com.github.druyaned.designpatterns.creational.abstractfactory.src.Hatchback;
import com.github.druyaned.designpatterns.creational.abstractfactory.src.bmw.BMWFactory;
import com.github.druyaned.designpatterns.creational.abstractfactory.src.CarFactory;
import java.util.ArrayList;
import java.util.List;
import com.github.druyaned.designpatterns.creational.abstractfactory.src.Crossover;

/**
 * Allows to produce families of related objects without specifying their concrete classes.
 * 
 * <P><i>Usage</i><br>
 * Client (this class) works with all {@link CarFactory car factories}.
 * Each factory has create-methods for all car types.
 * The client works with abstractions, not concrete classes and that's good.
 * Also it's easy to add another implementations of a factory and cars.
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the Abstract Factory when your code needs to work with
 *      various families of related products, but you don’t want it
 *      to depend on the concrete classes of those products—they
 *      might be unknown beforehand or you simply want to allow
 *      for future extensibility.</li>
 *  <li>Consider implementing the Abstract Factory when you have a class
 *      with a set of Factory Methods that blur its primary responsibility.</li>
 * </ul>
 * 
 * @author druayned
 */
public class AbstractFactory {
    
    public static void main(String[] args) {
        List<CarFactory> carFactories = new ArrayList<>();
        carFactories.add(new AudiFactory());
        carFactories.add(new BMWFactory());
        carFactories.add(new MercedesFactory());
        for (CarFactory carFactory : carFactories) {
            System.out.println("CarFactoryName=\"" + carFactory.getName() + "\"");
            Crossover crossover = carFactory.createCrossover();
            EstateCar estateCar = carFactory.createEstate();
            Hatchback hatchback = carFactory.createHatchback();
            System.out.println("  Crossover {");
            System.out.printf( "    name=\"%s\"\n", crossover.getName());
            System.out.printf(
                    "    clearance=%d(%s)\n",
                    crossover.clearance(), crossover.clearanceDimension()
            );
            System.out.println("  }");
            System.out.println("  EstateCar {");
            System.out.printf( "    name=\"%s\"\n", estateCar.getName());
            System.out.printf(
                    "    bootSize=%d(%s)\n",
                    estateCar.bootSize(), estateCar.bootSizeDimension()
            );
            System.out.println("  }");
            System.out.println("  Hatchback {");
            System.out.printf( "    name=\"%s\"\n", hatchback.getName());
            System.out.printf( "    horsepower=%d\n", hatchback.horsepower());
            System.out.println("  }");
        }
    }
    
}
