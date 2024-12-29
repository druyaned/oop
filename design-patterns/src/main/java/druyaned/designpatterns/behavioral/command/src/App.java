package druyaned.designpatterns.behavioral.command.src;

/**
 * The Client creates and configures concrete command objects. The client must
 * pass all of the request parameters, including a receiver instance,
 * into the command’s constructor. After that, the resulting command may be
 * associated with one or multiple senders.
 * 
 * @author druyaned
 */
public class App implements Runnable {
    
    private final Editor editor;
    private final Copy copy;
    private final Paste paste;
    
    public App() {
        editor = new Editor(
                """
                The text consists of 3 lines.
                That's the second one, which is a bit longer.
                The 3rd line is the shortest.
                """
        );
        copy = new Copy(editor);
        paste = new Paste(editor);
    }
    
    @Override public void run() {
        final String gui = "LocalGUI";
        final String keyboard = "LocalKeyboard";
        Button copyButton = new Button("CopyButton", copy, gui);
        Button pasteButton = new Button("PasteButton", paste, gui);
        Shortcut copyShortcut = new Shortcut("CopyShortcut", copy, keyboard);
        Shortcut pasteShortcut = new Shortcut("PasteShortcut", paste, keyboard);
        printEditor();
        // copy " longer"
        printAndSetSelection(2, 5);
        System.out.println("Pressing the \"" + copyButton.getName() + "\"...");
        copyButton.executeCommand();
        printEditor();
        printAndSetSelection(67, 74);
        System.out.println("Using the \"" + copyShortcut.getName() + "\"...");
        copyShortcut.executeCommand();
        printEditor();
        // paste in the "the shortest" and "3 lines"
        printAndSetSelection(91, 104);
        System.out.println("Pressing the \"" + pasteButton.getName() + "\"...");
        pasteButton.executeCommand();
        printEditor();
        printAndSetSelection(20, 28);
        System.out.println("Using the \"" + pasteShortcut.getName() + "\"...");
        pasteShortcut.executeCommand();
        printEditor();
    }
    
    private void printAndSetSelection(int begin, int end) {
        System.out.println("Setting the selection {begin=" + begin + ", end=" + end + "}...");
        editor.getSelection().set(begin, end);
    }
    
    private void printEditor() {
        System.out.println("--------");
        System.out.println("<TEXT_BEGIN>");
        System.out.print(editor.getText());
        System.out.println("<TEXT_END>");
        final String clipboard = editor.getClipboard();
        if (clipboard == null) {
            System.out.println("Clipboard: [NONE]");
        } else {
            System.out.println("Clipboard: \"" + clipboard + "\"");
        }
        final Selection selection = editor.getSelection();
        System.out.println(
                "Selection: begin=" + selection.getBegin() +
                ", end=" + selection.getEnd()
        );
        System.out.println("--------");
    }
    
}
