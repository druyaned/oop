package druyaned.designpatterns.behavioral.command.src;

public class Paste extends Command {
    
    public Paste(Editor editor) {
        super(editor);
    }
    
    @Override public boolean execute() {
        final Selection selection = editor.getSelection();
        final String clipboard = editor.getClipboard();
        if (!selection.exists() || clipboard == null) {
            return false;
        }
        final String text = editor.getText();
        editor.setText(
                text.substring(0, selection.getBegin()) +
                clipboard +
                text.substring(selection.getEnd())
        );
        return true;
    }
    
}
