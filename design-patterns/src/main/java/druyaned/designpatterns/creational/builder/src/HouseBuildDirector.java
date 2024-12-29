package druyaned.designpatterns.creational.builder.src;

/**
 * Provides a creation of different types of {@link House houses}
 * working with {@link HouseBuilder builders}.
 * 
 * @author druyaned
 */
public class HouseBuildDirector {
    
    private final HouseBuilder builder = new HouseBuilder();
    
    public House newSimpleHouse() {
        builder.newHouse();
        builder.putGarage(builder.getResult(), 1);
        return builder.getResult();
    }
    
    public House newBigHouse() {
        builder.newHouse();
        builder.putGarage(builder.getResult(), 2);
        builder.putGarden(builder.getResult(), 12);
        builder.putSwimminPool(builder.getResult(), true);
        return builder.getResult();
    }
    
}
