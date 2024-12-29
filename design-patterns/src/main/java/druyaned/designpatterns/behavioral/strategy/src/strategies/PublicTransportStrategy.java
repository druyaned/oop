package druyaned.designpatterns.behavioral.strategy.src.strategies;

import druyaned.designpatterns.behavioral.strategy.src.RouteStrategy;

public class PublicTransportStrategy implements RouteStrategy {
    
    @Override public int routeTimeInSeconds(int lengthInMeters) {
        System.out.println("PublicTransportStrategy.routeTimeInSeconds");
        return lengthInMeters / 12;
    }
    
}
