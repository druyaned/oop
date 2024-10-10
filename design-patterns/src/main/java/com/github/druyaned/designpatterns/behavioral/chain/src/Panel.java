package com.github.druyaned.designpatterns.behavioral.chain.src;

public class Panel extends Container {
    
    private String manual;
    
    public Panel() {
        super("Panel");
    }
    
    public String getManual() {
        return manual;
    }
    
    public void setManual(String manual) {
        this.manual = manual;
    }
    
    @Override public void appendHelp(StringBuilder builder) {
        if (manual != null) {
            builder
                    .append("Manual \"")
                    .append(manual)
                    .append("\" of \"")
                    .append(super.getName())
                    .append("\"\n");
        }
        super.appendHelp(builder);
    }
    
}
