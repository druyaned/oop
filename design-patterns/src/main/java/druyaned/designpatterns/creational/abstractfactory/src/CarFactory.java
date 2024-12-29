package druyaned.designpatterns.creational.abstractfactory.src;

/**
 * Representation of a car family with 3 types of cars:
 * {@link Crossover}, {@link EstateCar}, {@link Hatchback}.
 * 
 * @author druyaned
 */
public interface CarFactory {
    
    Crossover createCrossover();
    
    EstateCar createEstate();
    
    Hatchback createHatchback();
    
    String getName();
    
}
