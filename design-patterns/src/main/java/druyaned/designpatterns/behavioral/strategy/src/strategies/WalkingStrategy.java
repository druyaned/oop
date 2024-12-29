package druyaned.designpatterns.behavioral.strategy.src.strategies;

import druyaned.designpatterns.behavioral.strategy.src.RouteStrategy;

public class WalkingStrategy implements RouteStrategy {
    
    @Override public int routeTimeInSeconds(int lengthInMeters) {
        System.out.println("WalkingStrategy.routeTimeInSeconds");
        return lengthInMeters / 2;
    }
    
}
