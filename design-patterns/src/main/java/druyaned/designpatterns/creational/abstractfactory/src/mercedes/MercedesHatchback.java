package druyaned.designpatterns.creational.abstractfactory.src.mercedes;

import druyaned.designpatterns.creational.abstractfactory.src.Hatchback;

public class MercedesHatchback implements Hatchback {
    
    @Override public int horsepower() {
        return 188;
    }
    
    @Override public String getName() {
        return "Mercedes A Class";
    }
    
}
