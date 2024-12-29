package druyaned.designpatterns.behavioral.observer.src;

public class Editor {
    
    private String file;
    private String text;
    private int cursor = 0;

    public Editor(String file, String text) {
        this.file = file;
        this.text = text;
    }
    
    public String getFile() {
        return file;
    }
    
    public void setFile(String file) {
        this.file = file;
    }
    
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    public int getCursor() {
        return cursor;
    }
    
    public void setCursor(int cursor) {
        this.cursor = cursor;
    }
    
}
