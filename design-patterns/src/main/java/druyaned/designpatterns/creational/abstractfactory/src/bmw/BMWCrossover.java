package druyaned.designpatterns.creational.abstractfactory.src.bmw;

import druyaned.designpatterns.creational.abstractfactory.src.Crossover;

public class BMWCrossover implements Crossover {
    
    @Override public int clearance() {
        return 212;
    }
    
    @Override public String clearanceDimension() {
        return "mm";
    }
    
    @Override public String getName() {
        return "BMW X5";
    }
    
}
