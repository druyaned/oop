package com.github.druyaned.designpatterns.behavioral.strategy.src.strategies;

import com.github.druyaned.designpatterns.behavioral.strategy.src.RouteStrategy;

public class RidingStrategy implements RouteStrategy {
    
    @Override public int routeTimeInSeconds(int lengthInMeters) {
        System.out.println("RidingStrategy.routeTimeInSeconds");
        return lengthInMeters / 16;
    }
    
}
