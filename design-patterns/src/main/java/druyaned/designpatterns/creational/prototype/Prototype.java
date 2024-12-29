package druyaned.designpatterns.creational.prototype;

import druyaned.designpatterns.creational.prototype.src.Car;
import druyaned.designpatterns.creational.prototype.src.Hatchback;

/**
 * Lets you copy existing objects without making your code dependent on their classes.
 * 
 * <P><i>Usage</i><br>
 * Java language provides {@link java.lang.Cloneable Cloneable interface}.
 * The {@link Car} (superclass) has a {@link Car#Car(Car) constructor} with
 * a car argument that allows to make a clone. The same approach is applied
 * in the {@link Hatchback} (subclass).
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the Prototype pattern when your code should not depend
 *      on the concrete classes of objects that you need to copy.</li>
 *  <li>Use the pattern when you want to reduce the number of subclasses
 *      that only differ in the way they initialize their respective objects.</li>
 * </ul>
 * 
 * @author druyaned
 */
public class Prototype {
    
    public static void main(String[] args) {
        Car car = new Car("Mercedes GLE", 4, 5);
        Hatchback hatch = new Hatchback("Audi A3", 4, 5, 215);
        System.out.printf("Car:   %s\n", car);
        System.out.printf("Hatch: %s\n", hatch);
        Car carClone;
        Hatchback hatchClone;
        System.out.println("Cloning...");
        try {
            carClone = (Car)car.clone();
            hatchClone = (Hatchback)hatch.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
            return;
        }
        System.out.printf("CarClone:   %s\n", carClone);
        System.out.printf("HatchClone: %s\n", hatchClone);
        System.out.printf("(car == car)          = %b\n", car == car);
        System.out.printf("(car == carClone)     = %b\n", car == carClone);
        System.out.printf("(hatch == hatchClone) = %b\n", hatch == hatchClone);
    }
    
}
