package druyaned.designpatterns.creational.factorymethod.src;

/**
 * A simple transport class has an {@code id} and provides {@code delivery} method.
 * @author druyaned
 */
public abstract class Transport {
    
    private final String id;
    
    public Transport(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
    
    public abstract void deliver(int weightKg);
    
}
