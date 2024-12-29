package druyaned.solid.singleresponsibility.src;

public class Van implements Car {
    
    @Override public String getType() {
        return "van";
    }
    
    @Override public int getBasePrice() {
        return 2000;
    }
    
    @Override public int getPricePerHour() {
        return 400;
    }
    
    @Override public String toString() {
        return "Sedan{type=" + getType() +
                ", basePrice=" + getBasePrice() +
                ", pricePerHour=" + getPricePerHour() + "}";
    }
    
}
