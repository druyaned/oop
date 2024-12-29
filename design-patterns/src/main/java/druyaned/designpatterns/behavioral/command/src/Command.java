package druyaned.designpatterns.behavioral.command.src;

/**
 * The Command interface usually declares just a single method for executing the command.
 * 
 * <P>Concrete Commands implement various kinds of requests. A concrete command
 * isn’t supposed to perform the work on its own, but rather to pass the call to one
 * of the business logic objects. However, for the sake of simplifying the code,
 * these classes can be merged.
 * 
 * <P>Parameters required to execute a method on a receiving object can be declared
 * as fields in the concrete command. You can make command objects immutable by only
 * allowing the initialization of these fields via the constructor.
 * 
 * @author druyaned
 */
public abstract class Command {
    
    protected final Editor editor;
    
    public Command(Editor editor) {
        this.editor = editor;
    }
    
    public Editor getEditor() {
        return editor;
    }
    
    public abstract boolean execute();
    
}
