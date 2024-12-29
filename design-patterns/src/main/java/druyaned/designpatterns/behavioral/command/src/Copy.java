package druyaned.designpatterns.behavioral.command.src;

public class Copy extends Command {
    
    public Copy(Editor editor) {
        super(editor);
    }
    
    @Override public boolean execute() {
        final Selection selection = editor.getSelection();
        if (!selection.exists()) {
            editor.setClipboard(null);
            return false;
        }
        editor.setClipboard(
                editor.getText().substring(selection.getBegin(), selection.getEnd())
        );
        return true;
    }
    
}
