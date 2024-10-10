package com.github.druyaned.designpatterns.behavioral.memento.src;

import static com.github.druyaned.designpatterns.behavioral.memento.Memento.logger;

/**
 * The Originator class can produce snapshots of its own state.
 * @author druyaned
 */
public class Editor {
    
    private String text;
    private int cursor = 0;

    public Editor(String text) {
        this.text = text;
    }
    
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        logger.info("Setting Text");
        this.text = text;
    }
    
    public int getCursor() {
        return cursor;
    }
    
    public void setCursor(int cursor) {
        logger.info("Setting Cursor");
        this.cursor = cursor;
    }
    
    public EditorMemento save() {
        return new EditorMemento(this, text, cursor);
    }
    
}
