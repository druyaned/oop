package com.github.druyaned.designpatterns.behavioral.memento.src;

import static com.github.druyaned.designpatterns.behavioral.memento.Memento.logger;
import java.util.List;

public class Delete extends Command {
    
    public Delete(Editor editor, List<EditorMemento> history) {
        super(editor, history);
    }
    
    @Override public void execute() {
        logger.info("Executing Delete");
        history.add(editor.save());
        final int cursor = editor.getCursor();
        String leftText;
        if (cursor == 0) {
            leftText = "";
        } else {
            leftText = editor.getText().substring(0, cursor - 1);
            editor.setCursor(cursor - 1);
        }
        String rightText = editor.getText().substring(cursor);
        editor.setText(leftText + rightText);
    }
    
}
