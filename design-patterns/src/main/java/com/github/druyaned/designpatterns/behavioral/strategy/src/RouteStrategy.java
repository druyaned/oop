package com.github.druyaned.designpatterns.behavioral.strategy.src;

/**
 * The Strategy interface is common to all concrete strategies.
 * It declares a method the context uses to execute a strategy.
 * 
 * <P>Concrete Strategies implement different variations of
 * an algorithm the context uses.
 * 
 * <P>The context calls the execution method on the linked strategy object
 * each time it needs to run the algorithm. The context doesn’t know
 * what type of strategy it works with or how the algorithm is executed.
 * 
 * @author druyaned
 */
public interface RouteStrategy {
    
    int routeTimeInSeconds(int lengthInMeters);
    
}
