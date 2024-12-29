package druyaned.designpatterns.creational.prototype.src;

/**
 * A simple hatchback class has an additional field: {@code horsepower}.
 * @author druyaned
 */
public class Hatchback extends Car {
    
    private final int horsepower;
    
    public Hatchback(String name, int wheelCount, int doorCount, int horsepower) {
        super(name, wheelCount, doorCount);
        this.horsepower = horsepower;
    }
    
    /**
     * {@link Car#Car(Car) As in the superclass} allows to make a clone.
     * @param hatchback to be cloned
     */
    protected Hatchback(Hatchback hatchback) {
        super(hatchback);
        horsepower = hatchback.horsepower;
    }
    
    public int getHorsepower() {
        return horsepower;
    }
    
    @Override public Object clone() throws CloneNotSupportedException {
        return new Hatchback(this);
    }
    
    @Override public String toString() {
        return String.format(
                "Hatchback{%s, horsepower=%d}",
                super.toString(), horsepower
        );
    }
    
}
