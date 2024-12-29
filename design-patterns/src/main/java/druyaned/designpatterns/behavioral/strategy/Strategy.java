package druyaned.designpatterns.behavioral.strategy;

import druyaned.designpatterns.behavioral.strategy.src.Navigator;
import druyaned.designpatterns.behavioral.strategy.src.strategies.PublicTransportStrategy;
import druyaned.designpatterns.behavioral.strategy.src.strategies.WalkingStrategy;

/**
 * Lets you define a family of algorithms, put each of them into
 * a separate class, and make their objects interchangeable.
 * 
 * <P><i>Usage</i><br>
 * The Client creates a specific strategy object and passes it to the context.
 * The context exposes a setter which lets clients replace the strategy
 * associated with the context at runtime.
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the Strategy pattern when you want to use different variants of
 *      an algorithm within an object and be able to switch from one algorithm
 *      to another during runtime.</li>
 *  <li>Use the Strategy when you have a lot of similar classes that only differ
 *      in the way they execute some behavior.</li>
 *  <li>Use the pattern to isolate the business logic of a class from
 *      the implementation details of algorithms that may not be as important
 *      in the context of that logic.</li>
 *  <li>Use the pattern when your class has a massive conditional statement
 *      that switches between different variants of the same algorithm.</li>
 * </ul>
 * 
 */
public class Strategy {
    
    public static void main(String[] args) {
        Navigator navigator = new Navigator();
        int routeLengthInMeters = 1000;
        calculateAndPrint(navigator, routeLengthInMeters);
        navigator.setStrategy(new PublicTransportStrategy());
        calculateAndPrint(navigator, routeLengthInMeters);
        navigator.setStrategy(new WalkingStrategy());
        calculateAndPrint(navigator, routeLengthInMeters);
    }
    
    private static void calculateAndPrint(Navigator navigator, int routeLength) {
        int time = navigator.routeTimeInSeconds(routeLength);
        System.out.println("Time: " + time + " (sec)");
    }
    
}
