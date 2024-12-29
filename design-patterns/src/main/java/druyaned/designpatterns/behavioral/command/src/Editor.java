package druyaned.designpatterns.behavioral.command.src;

/**
 * The Receiver class contains some business logic. Almost any object
 * may act as a receiver. Most commands only handle the details of
 * how a request is passed to the receiver, while the receiver itself
 * does the actual work.
 * 
 * @author druyaned
 */
public class Editor {
    
    private String text;
    private String clipboard;
    private final Selection selection;
    
    public Editor(String text) {
        this.text = text;
        this.selection = new Selection(this);
    }
    
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
        selection.reset();
    }
    
    public String getClipboard() {
        return clipboard;
    }
    
    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }
    
    public Selection getSelection() {
        return selection;
    }
    
}
