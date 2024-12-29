package druyaned.designpatterns.behavioral.observer.src;

public class Save extends Command {
    
    public Save(Editor editor, EventManager events) {
        super(editor, events);
    }
    
    @Override public void execute() {
        System.out.println("File=\"" + editor.getFile() + "\" saves the text");
        System.out.println("----<BEGIN>----");
        System.out.print(editor.getText());
        System.out.println("----<END>----");
        manager.inform("save", editor.getFile());
    }
    
}
