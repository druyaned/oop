package druyaned.designpatterns.creational.abstractfactory.src.audi;

import druyaned.designpatterns.creational.abstractfactory.src.Crossover;

public class AudiCrossover implements Crossover {
    
    @Override public int clearance() {
        return 200;
    }
    
    @Override public String clearanceDimension() {
        return "mm";
    }
    
    @Override public String getName() {
        return "Audi Q5";
    }
    
}
