package druyaned.designpatterns.behavioral.command;

import druyaned.designpatterns.behavioral.command.src.App;

/**
 * Turns a request into a stand-alone object that contains all information
 * about the request. This transformation lets you pass requests as
 * a method arguments, delay or queue a request’s execution, and support
 * undoable operations.
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the Command pattern when you want to parametrize objects
 *      with operations.</li>
 *  <li>Use the Command pattern when you want to queue operations,
 *      schedule their execution, or execute them remotely.</li>
 *  <li>Use the Command pattern when you want to implement reversible
 *      operations.</li>
 * </ul>
 * 
 * @author druyaned
 */
public class Command {
    
    public static void main(String[] args) {
        new App().run();
    }
    
}
