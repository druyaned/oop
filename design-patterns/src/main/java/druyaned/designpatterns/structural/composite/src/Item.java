package druyaned.designpatterns.structural.composite.src;

/**
 * A simple leaf of a {@link Unit component}.
 * @author druyaned
 */
public class Item implements Unit {
    
    private final String name;
    private final int weight;
    
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    @Override public String getName() {
        return name;
    }
    
    @Override public int getWeightG() {
        return weight;
    }
    
    @Override public String toString() {
        return "Item{name=" + name + ", weight=" + weight + "}";
    }
    
}
