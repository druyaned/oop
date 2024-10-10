package com.github.druyaned.designpatterns.structural.composite;

import com.github.druyaned.designpatterns.structural.composite.src.Box;
import com.github.druyaned.designpatterns.structural.composite.src.Item;
import com.github.druyaned.designpatterns.structural.composite.src.Unit;

/**
 * Lets you compose objects into tree structures and then work
 * with these structures as if they were individual objects.
 * Using the Composite pattern makes sense only when the core model
 * of your app can be represented as a tree. A great example of this
 * pattern is the {@code Red-Black Tree} which is implemented by me.
 * The main tool of the pattern usage is the {@code recursion}.
 * 
 * <P><i>Usage</i><br>
 * The client (this class) is a complex delivery package. It works with
 * the {@link Box}. Box is a {@link Unit} and also can have its
 * own units. {@link Item} is a leaf.
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the Composite pattern when you have to implement
 *      a tree-like object structure.</li>
 *  <li>Use the pattern when you want the client code to treat
 *      both simple and complex elements uniformly.</li>
 * </ul>
 * 
 * @author druyaned
 */
public class Composite {
    
    public static void main(String[] args) {
        System.out.println("Delivery package is a box.");
        // headphones box
        Item headphones = new Item("Headphones", 20);
        Box headphonesBox = new Box("HeadphonesBox", 40);
        headphonesBox.getUnits().add(headphones);
        // cable box
        Item cable = new Item("PowerCable", 125);
        Box cableBox = new Box("PowerCableBox", 15);
        cableBox.getUnits().add(cable);
        // phone box
        Item phone = new Item("Phone", 200);
        Item phoneCover = new Item("PhoneCover", 20);
        Box phoneBox = new Box("PhoneBox", 220);
        phoneBox.getUnits().add(cableBox);
        phoneBox.getUnits().add(phone);
        phoneBox.getUnits().add(phoneCover);
        // delivery package box
        Box packageBox = new Box("PackageBox", 300);
        packageBox.getUnits().add(headphonesBox);
        packageBox.getUnits().add(phoneBox);
        System.out.println(packageBox);
        System.out.println("Total weight: " + packageBox.getWeightG());
    }
    
}
