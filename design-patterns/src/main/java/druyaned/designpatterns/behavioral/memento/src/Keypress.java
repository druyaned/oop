package druyaned.designpatterns.behavioral.memento.src;

import static druyaned.designpatterns.behavioral.memento.Memento.logger;
import java.util.List;

public class Keypress extends Command {
    
    private char key;
    
    public Keypress(Editor editor, List<EditorMemento> history, char key) {
        super(editor, history);
        this.key = key;
    }
    
    public char getKey() {
        return key;
    }
    
    public void setKey(char key) {
        this.key = key;
    }
    
    @Override public void execute() {
        logger.info("Executing Keypress");
        history.add(editor.save());
        final int cursor = editor.getCursor();
        String leftText = editor.getText().substring(0, cursor);
        String rightText = editor.getText().substring(cursor);
        editor.setText(leftText + Character.toString(key) + rightText);
        editor.setCursor(cursor + 1);
    }
    
}
