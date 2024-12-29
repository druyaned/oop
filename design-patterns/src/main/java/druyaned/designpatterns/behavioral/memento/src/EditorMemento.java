package druyaned.designpatterns.behavioral.memento.src;

/**
 * The Memento is a value object that acts as a snapshot of the originator’s
 * state. It’s a common practice to make the memento immutable and pass it
 * the data only once, via the constructor.
 * 
 * <P>Memento becomes linked to the originator that produced it.
 * The originator passes itself to the memento’s constructor, along with
 * the values of its state. Thanks to the close relationship between
 * these classes, a memento can restore the state of its originator,
 * given that the latter has defined the appropriate setters.
 * 
 * @author druyaned
 */
public class EditorMemento {
    
    private final Editor editor;
    private final String text;
    private final int cursor;
    
    public EditorMemento(Editor editor, String text, int cursor) {
        this.editor = editor;
        this.text = text;
        this.cursor = cursor;
    }
    
    public void restore() {
        editor.setText(text);
        editor.setCursor(cursor);
    }
    
}
