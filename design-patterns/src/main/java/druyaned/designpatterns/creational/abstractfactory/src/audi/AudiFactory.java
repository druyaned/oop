package druyaned.designpatterns.creational.abstractfactory.src.audi;

import druyaned.designpatterns.creational.abstractfactory.src.CarFactory;
import druyaned.designpatterns.creational.abstractfactory.src.EstateCar;
import druyaned.designpatterns.creational.abstractfactory.src.Hatchback;
import druyaned.designpatterns.creational.abstractfactory.src.Crossover;

public class AudiFactory implements CarFactory {
    
    @Override public Crossover createCrossover() {
        return new AudiCrossover();
    }
    
    @Override public EstateCar createEstate() {
        return new AudiEstate();
    }
    
    @Override public Hatchback createHatchback() {
        return new AudiHatchback();
    }
    
    @Override public String getName() {
        return "AudiFactory";
    }
    
}
