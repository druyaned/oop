package com.github.druyaned.designpatterns.behavioral.mediator.src.components;

import com.github.druyaned.designpatterns.behavioral.mediator.src.Component;
import com.github.druyaned.designpatterns.behavioral.mediator.src.Event;
import com.github.druyaned.designpatterns.behavioral.mediator.src.Mediator;

public class Dialog extends Component {
    
    private boolean opened = false;
    
    public Dialog(String id, Mediator mediator) {
        super(id, mediator);
    }
    
    public boolean isOpened() {
        return opened;
    }
    
    public void open() {
        if (!opened) {
            opened = true;
            mediator.inform(this, Event.DIALOG_OPEN); // or mediator.informDialogOpen(this)
        }
    }
    
    public void close() {
        if (opened) {
            opened = false;
            mediator.inform(this, Event.DIALOG_CLOSE);// or mediator.informDialogClose(this)
        }
    }
    
}
