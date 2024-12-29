package druyaned.designpatterns.creational.builder;

import druyaned.designpatterns.creational.builder.src.House;
import druyaned.designpatterns.creational.builder.src.HouseBuildDirector;
import druyaned.designpatterns.creational.builder.src.HouseBuilder;

/**
 * Lets you construct complex objects step by step with different types
 * and representations of an object. Good example of the builder pattern
 * is {@link java.lang.StringBuilder}.
 * 
 * <P><i>Usage</i><br>
 * The clients work with {@link HouseBuildDirector}. The director
 * knows how to work with {@link HouseBuilder house builders}.
 * Each builder builds a house for a client and provides all necessary tools.
 * {@link House} has some additions. The builder and director helps to avoid
 * a huge and confusing constructors and to create several types of product
 * by constructing an object step by step.
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the Builder pattern to get rid of a "telescoping constructor".</li>
 *  <li>Use the Builder pattern when you want your code to be able to create
 *      different representations of some product (for example,
 *      simple and big houses).</li>
 * </ul>
 * 
 * @author  druyaned
 */
public class Builder {
    
    public static void main(String[] args) {
        HouseBuildDirector director = new HouseBuildDirector();
        House simpleHouse = director.newSimpleHouse();
        House bigHouse = director.newBigHouse();
        System.out.println("simpleHouse: " + simpleHouse);
        System.out.println("bigHouse: " + bigHouse);
    }
    
}
