package druyaned.designpatterns.behavioral.memento.src;

import java.util.List;

/**
 * The Caretaker knows not only “when” and “why” to capture
 * the originator’s state, but also when the state should be restored.
 * 
 * <P>Caretakers are explicitly restricted from changing the state
 * stored in mementos. Moreover, the caretaker class is independent
 * from the originator because the restoration method is defined
 * in the memento class.
 * 
 * @author druyaned
 */
public abstract class Command {
    
    protected final Editor editor;
    protected final List<EditorMemento> history;
    
    public Command(Editor editor, List<EditorMemento> history) {
        this.editor = editor;
        this.history = history;
    }
    
    public abstract void execute();
    
}
