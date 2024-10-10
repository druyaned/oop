package com.github.druyaned.designpatterns.creational.singleton;

/**
 * Lets you ensure that a class has only one instance,
 * while providing a global access point to this instance.
 * 
 * <P><i>Usage</i><br>
 * The {@link DataBase} has the only instance which can be worked with
 * throughout the program. To reach that state the {@link DataBase#getInstance
 * getInstance method} is used.
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the Singleton pattern when a class in your program
 *      should have just a single instance available to all clients;
 *      for example, a single database object shared by different
 *      parts of the program.</li>
 *  <li>Use the Singleton pattern when you need stricter control over
 *      global variables.</li>
 * </ul>
 * 
 * @author druyaned
 */
public class Singleton {
    
    public static void main(String[] args) {
        DataBase database = DataBase.getInstance();
        System.out.printf("Database:     %s\n", database.getName());
        DataBase sameDatabase = DataBase.getInstance();
        System.out.printf("SameDatabase: %s\n", sameDatabase.getName());
        System.out.printf("(database == sameDatabase) = %b\n", database == sameDatabase);
    }
    
}
