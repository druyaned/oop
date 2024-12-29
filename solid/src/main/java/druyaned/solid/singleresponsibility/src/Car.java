package druyaned.solid.singleresponsibility.src;

public interface Car {
    
    String getType();
    
    int getBasePrice();
    
    int getPricePerHour();
    
    default int getPrice(int hours) {
        return getBasePrice() + hours * getPricePerHour();
    }
    
}
