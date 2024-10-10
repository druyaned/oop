package com.github.druyaned.designpatterns.behavioral.memento.src;

import static com.github.druyaned.designpatterns.behavioral.memento.Memento.logger;
import java.util.List;

public class Undo extends Command {
    
    public Undo(Editor editor, List<EditorMemento> history) {
        super(editor, history);
    }
    
    @Override public void execute() {
        logger.info("Executing Undo");
        if (!history.isEmpty()) {
            EditorMemento memento = history.removeLast();
            memento.restore();
        }
    }
    
}
