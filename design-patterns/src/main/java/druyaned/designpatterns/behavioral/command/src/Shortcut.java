package druyaned.designpatterns.behavioral.command.src;

public class Shortcut extends Invoker {
    
    private final String keyboard;
    
    public Shortcut(String name, Command command, String keyboard) {
        super(name, command);
        this.keyboard = keyboard;
    }
    
    public String getKeyboard() {
        return keyboard;
    }
    
}
