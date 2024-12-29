package druyaned.designpatterns.behavioral.strategy.src;

import druyaned.designpatterns.behavioral.strategy.src.strategies.RidingStrategy;

/**
 * The Context maintains a reference to one of the concrete strategies and
 * communicates with this object only via the strategy interface.
 * 
 * @author druyaned
 */
public class Navigator {
    
    private RouteStrategy strategy;
    
    public Navigator() {
        strategy = new RidingStrategy();
    }
    
    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }
    
    public int routeTimeInSeconds(int lengthInMeters) {
        return strategy.routeTimeInSeconds(lengthInMeters);
    }
    
}
