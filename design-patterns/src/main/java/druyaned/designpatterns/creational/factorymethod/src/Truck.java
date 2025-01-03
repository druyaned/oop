package druyaned.designpatterns.creational.factorymethod.src;

public class Truck extends Transport {
    
    public Truck(String id) {
        super(id);
    }
    
    @Override public void deliver(int weightKg) {
        System.out.printf(
                "Cargo weighing %d(kg) is delived by the truck with id=%s\n",
                weightKg, getId()
        );
    }
    
}
