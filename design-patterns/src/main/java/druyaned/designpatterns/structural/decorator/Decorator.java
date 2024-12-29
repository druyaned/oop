package druyaned.designpatterns.structural.decorator;

import druyaned.designpatterns.structural.decorator.src.CompressionDecorator;
import druyaned.designpatterns.structural.decorator.src.DataSource;
import druyaned.designpatterns.structural.decorator.src.DataSourceDecorator;
import druyaned.designpatterns.structural.decorator.src.EncryptionDecorator;
import druyaned.designpatterns.structural.decorator.src.FileDataSource;

/**
 * Lets you attach new behaviors to objects by placing these objects
 * inside special wrapper objects that contain the behaviors.
 * The main tool of the pattern usage is the {@code recursion}.
 * 
 * <P><i>Usage</i><br>
 * The client can wrap {@link DataSource components} in multiple layers
 * of {@link DataSourceDecorator decorators}, as long as it works with
 * all objects via the component interface.
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the Decorator pattern when you need to be able to assign
 *      extra behaviors to objects at runtime without breaking
 *      the code that uses these objects.</li>
 *  <li>Use the pattern when it’s awkward or not possible to extend
 *      an object’s behavior using inheritance.</li>
 * </ul>
 * 
 * @author druyaned
 */
public class Decorator {
    
    public static void main(String[] args) {
        DataSource source = new FileDataSource("file.txt");
        if (source instanceof FileDataSource s) {
            System.out.println("There is a source of the \"" + s.getFileName() + "\"");
        }
        source = new EncryptionDecorator(source);
        source = new CompressionDecorator(source);
        System.out.println("Writing a data...");
        source.writeData("some very important data");
        System.out.println("Reading the data...");
        System.out.println(source.readData());
    }
    
}
