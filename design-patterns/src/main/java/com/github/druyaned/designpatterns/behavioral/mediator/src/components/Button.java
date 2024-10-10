package com.github.druyaned.designpatterns.behavioral.mediator.src.components;

import com.github.druyaned.designpatterns.behavioral.mediator.src.Component;
import com.github.druyaned.designpatterns.behavioral.mediator.src.Event;
import com.github.druyaned.designpatterns.behavioral.mediator.src.Mediator;

public class Button extends Component {
    
    public Button(String id, Mediator mediator) {
        super(id, mediator);
    }
    
    public void press() {
        mediator.inform(this, Event.BUTTON_PRESS); // or mediator.informButtonPress(this)
    }
    
}
