package druyaned.designpatterns.creational.abstractfactory.src.mercedes;

import druyaned.designpatterns.creational.abstractfactory.src.EstateCar;

public class MercedesEstate implements EstateCar {
    
    @Override public int bootSize() {
        return 490;
    }
    
    @Override public String bootSizeDimension() {
        return "L";
    }
    
    @Override public String getName() {
        return "Mercedes C Class Estate";
    }
    
}
