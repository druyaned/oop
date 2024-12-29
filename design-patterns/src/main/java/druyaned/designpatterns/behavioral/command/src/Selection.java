package druyaned.designpatterns.behavioral.command.src;

public class Selection {
    
    private final Editor editor;
    private int begin;
    private int end; // exclusive
    
    public Selection(Editor editor) {
        this.editor = editor;
    }
    
    public Editor getEditor() {
        return editor;
    }
    
    public int getBegin() {
        return begin;
    }
    
    public int getEnd() {
        return end;
    }
    
    public void reset() {
        begin = 0;
        end = 0;
    }
    
    public boolean set(int begin, int end) {
        if (isValid(begin, end)) {
            this.begin = begin;
            this.end = end;
            return true;
        }
        return false;
    }
    
    public boolean isValid(int begin, int end) {
        return begin >= 0 && end <= editor.getText().length() && begin < end;
    }
    
    public boolean exists() {
        return isValid(begin, end);
    }
    
}
