package druyaned.designpatterns.behavioral.mediator.src.components;

import druyaned.designpatterns.behavioral.mediator.src.Component;
import druyaned.designpatterns.behavioral.mediator.src.Event;
import druyaned.designpatterns.behavioral.mediator.src.Mediator;

public class Textbox extends Component {
    
    private String text = "";
    
    public Textbox(String id, Mediator mediator) {
        super(id, mediator);
    }
    
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        if (text == null) {
            this.text = "";
        } else {
            this.text = text;
        }
        mediator.inform(this, Event.TEXTBOX_SET); // or mediator.informTextboxSet(this)
    }
    
    public boolean isEmpty() {
        return text.isEmpty();
    }
    
}
