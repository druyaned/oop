package com.github.druyaned.designpatterns.behavioral.command.src;

public class Button extends Invoker {
    
    private final String gui;
    
    public Button(String name, Command command, String gui) {
        super(name, command);
        this.gui = gui;
    }
    
    public String getGui() {
        return gui;
    }
    
}
