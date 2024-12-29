package druyaned.designpatterns.structural.adapter.src;

/**
 * A simple class of a round peg with the only field - {@code radius}.
 * @author druyaned
 */
public class RoundPeg {
    
    private final double radius;
    
    public RoundPeg(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
}
