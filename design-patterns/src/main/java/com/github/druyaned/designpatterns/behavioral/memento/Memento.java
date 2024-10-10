package com.github.druyaned.designpatterns.behavioral.memento;

import com.github.druyaned.designpatterns.behavioral.memento.src.Delete;
import com.github.druyaned.designpatterns.behavioral.memento.src.Editor;
import com.github.druyaned.designpatterns.behavioral.memento.src.EditorMemento;
import com.github.druyaned.designpatterns.behavioral.memento.src.Keypress;
import com.github.druyaned.designpatterns.behavioral.memento.src.Undo;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Lets you save and restore the previous state of an object without
 * revealing the details of its implementation.
 * 
 * <P><i>Notes</i><br>
 * This implementation allows having multiple types of originators and mementos.
 * Each originator works with a corresponding memento class. Neither originators
 * nor mementos expose their state to anyone.
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the Memento pattern when you want to produce snapshots of
 *      the object’s state to be able to restore a previous state of
 *      the object.</li>
 *  <li>Use the pattern when direct access to the object’s
 *      fields/getters/setters violates its encapsulation.</li>
 * </ul>
 * 
 * @author druyaned
 */
public class Memento {
    
    public static final Logger logger = Logger.getLogger(Memento.class.getName());
    
    public static void main(String[] args) {
        // initialization
        Editor editor = new Editor(
                """
                The text consists of 3 lines.
                That's the second one, which is a bit longer.
                The 3rd line is the shortest.
                """
        );
        List<EditorMemento> history = new LinkedList<>();
        Delete delete = new Delete(editor, history);
        Keypress keypress = new Keypress(editor, history, '5');
        Undo undo = new Undo(editor, history);
        // running
        printEditor(editor);
        editor.setCursor(22);
        delete.execute();
        printEditor(editor);
        keypress.execute();
        printEditor(editor);
        keypress.setKey('8');
        keypress.execute();
        printEditor(editor);
        undo.execute();
        printEditor(editor);
    }
    
    private static void printEditor(Editor editor) {
        System.out.println("----<BEGIN>----");
        System.out.print(editor.getText());
        System.out.println("----<END>----");
        System.out.println("text.length=" + editor.getText().length());
        System.out.println("text.cursor=" + editor.getCursor());
    }
    
}
