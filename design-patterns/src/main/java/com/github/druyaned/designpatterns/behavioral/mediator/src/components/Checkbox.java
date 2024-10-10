package com.github.druyaned.designpatterns.behavioral.mediator.src.components;

import com.github.druyaned.designpatterns.behavioral.mediator.src.Component;
import com.github.druyaned.designpatterns.behavioral.mediator.src.Event;
import com.github.druyaned.designpatterns.behavioral.mediator.src.Mediator;

public class Checkbox extends Component {
    
    private boolean selected;
    
    public Checkbox(String id, Mediator mediator) {
        super(id, mediator);
    }
    
    public boolean isSelected() {
        return selected;
    }
    
    public void switchSelection() {
        selected = !selected;
        mediator.inform(this, Event.CHECKBOX_SWITCH); // or mediator.informCheckboxSwitch(this)
    }
    
}
