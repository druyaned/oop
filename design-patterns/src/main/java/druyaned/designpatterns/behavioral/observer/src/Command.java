package druyaned.designpatterns.behavioral.observer.src;

public abstract class Command {
    
    protected final Editor editor;
    protected final EventManager manager;
    
    public Command(Editor editor, EventManager events) {
        this.editor = editor;
        this.manager = events;
    }
    
    public abstract void execute();
    
}
