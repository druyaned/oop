package com.github.druyaned.designpatterns.behavioral.mediator.src;

import static com.github.druyaned.designpatterns.behavioral.mediator.Mediator.logger;
import com.github.druyaned.designpatterns.behavioral.mediator.src.components.Button;
import com.github.druyaned.designpatterns.behavioral.mediator.src.components.Checkbox;
import com.github.druyaned.designpatterns.behavioral.mediator.src.components.Dialog;
import com.github.druyaned.designpatterns.behavioral.mediator.src.components.Textbox;
import java.util.logging.Level;

/**
 * Concrete Mediators encapsulate relations between various components.
 * Concrete mediators often keep references to all components they manage
 * and sometimes even manage their lifecycle.
 * 
 * @author druyaned
 */
public class DialogMediator implements Mediator {
    
    private Dialog dialog;
    private Button ok, cancel;
    private Textbox user, pass;
    private Checkbox stayIn;
    private DialogForm form = null;
    
    public void setDialog(Dialog dialog) {
        this.dialog = dialog;
    }
    
    public void setOk(Button ok) {
        this.ok = ok;
    }
    
    public void setCancel(Button cancel) {
        this.cancel = cancel;
    }
    
    public void setUser(Textbox user) {
        this.user = user;
    }
    
    public void setPass(Textbox pass) {
        this.pass = pass;
    }
    
    public void setStayIn(Checkbox stayIn) {
        this.stayIn = stayIn;
    }
    
    public DialogForm getForm() {
        return form;
    }
    
    @Override public void inform(Component component, Event event) {
        if (event == Event.BUTTON_PRESS) {
            logger.log(Level.INFO, "informed by button \"{0}\"", component.getId());
            if (component == ok && !user.isEmpty() && !pass.isEmpty()) {
                form = new DialogForm(user.getText(), pass.getText(), stayIn.isSelected());
                dialog.close();
            }
            if (component == cancel) {
                form = null;
                dialog.close();
            }
        }
        if (event == Event.CHECKBOX_SWITCH) {
            logger.log(Level.INFO, "informed by checkbox \"{0}\"", component.getId());
        }
        if (event == Event.DIALOG_OPEN) {
            logger.log(Level.INFO, "informed by dialog.open \"{0}\"", component.getId());
        }
        if (event == Event.DIALOG_CLOSE) {
            logger.log(Level.INFO, "informed by dialog.close \"{0}\"", component.getId());
            user.setText(null);
            pass.setText(null);
            if (stayIn.isSelected()) {
                stayIn.switchSelection();
            }
        }
        if (event == Event.TEXTBOX_SET) {
            logger.log(Level.INFO, "informed by textbox \"{0}\"", component.getId());
        }
    }
    
}
