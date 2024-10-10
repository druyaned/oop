package com.github.druyaned.designpatterns.behavioral.visitor;

import com.github.druyaned.designpatterns.behavioral.visitor.src.Town;
import com.github.druyaned.designpatterns.behavioral.visitor.src.TributeCollector;
import com.github.druyaned.designpatterns.behavioral.visitor.src.Village;

/**
 * Lets you separate algorithms from the objects on which they operate.
 * 
 * <P><i>Usage</i><br>
 * The Client usually represents a collection or some other complex object
 * (for example, a Composite tree). Usually, clients aren’t aware of all
 * the concrete element classes because they work with objects from
 * that collection via some abstract interface.
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the Visitor when you need to perform an operation on
 *      all elements of a complex object structure (for example,
 *      an object tree).</li>
 *  <li>Use the Visitor to clean up the business logic of auxiliary behaviors.</li>
 *  <li>Use the pattern when a behavior makes sense only in some classes of
 *      a class hierarchy, but not in others.</li>
 * </ul>
 * 
 * @author druyaned
 */
public class Visitor {
    
    public static void main(String[] args) {
        Village village = new Village("EastVillage");
        Town town = new Town("EastTown");
        TributeCollector collector = new TributeCollector();
        collector.visit(village);
        collector.visit(town);
        System.out.println("Total tribution: " + collector.getTotal());
    }
    
}
