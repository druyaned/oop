package druyaned.designpatterns.structural.adapter.src;

/**
 * A simple class of a round hole to clarify does a {@link RoundPeg} fit.
 * @author druyaned
 */
public class RoundHole {
    
    private final double radius;
    
    public RoundHole(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public boolean fits(RoundPeg peg) {
        return radius >= peg.getRadius();
    }
    
}
