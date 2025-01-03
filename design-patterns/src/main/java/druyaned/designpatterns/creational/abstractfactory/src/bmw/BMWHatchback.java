package druyaned.designpatterns.creational.abstractfactory.src.bmw;

import druyaned.designpatterns.creational.abstractfactory.src.Hatchback;

public class BMWHatchback implements Hatchback {
    
    @Override public int horsepower() {
        return 174;
    }
    
    @Override public String getName() {
        return "BMW 1 Series";
    }
    
}
