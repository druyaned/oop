package druyaned.designpatterns.creational.abstractfactory.src.mercedes;

import druyaned.designpatterns.creational.abstractfactory.src.CarFactory;
import druyaned.designpatterns.creational.abstractfactory.src.EstateCar;
import druyaned.designpatterns.creational.abstractfactory.src.Hatchback;
import druyaned.designpatterns.creational.abstractfactory.src.Crossover;

public class MercedesFactory implements CarFactory {
    
    @Override public Crossover createCrossover() {
        return new MercedesCrossover();
    }
    
    @Override public EstateCar createEstate() {
        return new MercedesEstate();
    }
    
    @Override public Hatchback createHatchback() {
        return new MercedesHatchback();
    }
    
    @Override public String getName() {
        return "MercedesFactory";
    }
    
}
