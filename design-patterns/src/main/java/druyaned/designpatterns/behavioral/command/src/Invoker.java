package druyaned.designpatterns.behavioral.command.src;

/**
 * The Sender class (aka Invoker) is responsible for initiating requests.
 * This class must have a field for storing a reference to a command object.
 * The sender triggers that command instead of sending the request directly
 * to the receiver. Note that the sender isn’t responsible for creating
 * the command object. Usually, it gets a pre-created command from
 * the client via the constructor.
 * 
 * @author druyaned
 */
public class Invoker {
    
    private final String name;
    protected final Command command;
    
    public Invoker(String name, Command command) {
        this.name = name;
        this.command = command;
    }
    
    public String getName() {
        return name;
    }
    
    public Command getCommand() {
        return command;
    }
    
    public boolean executeCommand() {
        return command.execute();
    }
    
}
