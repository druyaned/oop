package com.github.druyaned.designpatterns.creational.abstractfactory.src.mercedes;

import com.github.druyaned.designpatterns.creational.abstractfactory.src.CarFactory;
import com.github.druyaned.designpatterns.creational.abstractfactory.src.EstateCar;
import com.github.druyaned.designpatterns.creational.abstractfactory.src.Hatchback;
import com.github.druyaned.designpatterns.creational.abstractfactory.src.Crossover;

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
