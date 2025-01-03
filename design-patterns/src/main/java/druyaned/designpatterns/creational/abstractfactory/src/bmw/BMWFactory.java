package druyaned.designpatterns.creational.abstractfactory.src.bmw;

import druyaned.designpatterns.creational.abstractfactory.src.CarFactory;
import druyaned.designpatterns.creational.abstractfactory.src.EstateCar;
import druyaned.designpatterns.creational.abstractfactory.src.Hatchback;
import druyaned.designpatterns.creational.abstractfactory.src.Crossover;

public class BMWFactory implements CarFactory {
    
    @Override public Crossover createCrossover() {
        return new BMWCrossover();
    }
    
    @Override public EstateCar createEstate() {
        return new BMWEstate();
    }
    
    @Override public Hatchback createHatchback() {
        return new BMWHatchback();
    }
    
    @Override public String getName() {
        return "BMWFactory";
    }
    
}
