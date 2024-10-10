package com.github.druyaned.designpatterns.behavioral.mediator;

import com.github.druyaned.designpatterns.behavioral.mediator.src.DialogMediator;
import com.github.druyaned.designpatterns.behavioral.mediator.src.DialogForm;
import com.github.druyaned.designpatterns.behavioral.mediator.src.components.Button;
import com.github.druyaned.designpatterns.behavioral.mediator.src.components.Checkbox;
import com.github.druyaned.designpatterns.behavioral.mediator.src.components.Dialog;
import com.github.druyaned.designpatterns.behavioral.mediator.src.components.Textbox;
import java.util.logging.Logger;

/**
 * Lets you reduce chaotic dependencies between objects. The pattern
 * restricts direct communications between the objects and forces them
 * to collaborate only via a mediator object.
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the Mediator pattern when it’s hard to change some of the classes
 *      because they are tightly coupled to a bunch of other classes.</li>
 *  <li>Use the pattern when you can’t reuse a component in a different program
 *      because it’s too dependent on other components.</li>
 *  <li>Use the Mediator when you find yourself creating tons of component
 *      subclasses just to reuse some basic behavior in various contexts.</li>
 * </ul>
 * 
 * @author druyaned
 */
public class Mediator {
    
    public static final Logger logger = Logger.getLogger(Mediator.class.getName());
    
    public static void main(String[] args) {
        // initialization
        DialogMediator mediator = new DialogMediator();
        Dialog dialog = new Dialog("AUTHENTICATION", mediator);
        Button ok = new Button("OK", mediator);
        Button cancel = new Button("CANCEL", mediator);
        Textbox user = new Textbox("USER", mediator);
        Textbox pass = new Textbox("PASS", mediator);
        Checkbox stayIn = new Checkbox("STAY_IN", mediator);
        mediator.setDialog(dialog);
        mediator.setOk(ok);
        mediator.setCancel(cancel);
        mediator.setUser(user);
        mediator.setPass(pass);
        mediator.setStayIn(stayIn);
        // round 1
        dialog.open();
        user.setText("best_user_01");
        pass.setText("1352");
        stayIn.switchSelection();
        ok.press();
        DialogForm form = mediator.getForm();
        printForm(form);
        // round 2
        dialog.open();
        user.setText("best_user_02");
        pass.setText("1353");
        stayIn.switchSelection();
        cancel.press();
        form = mediator.getForm();
        printForm(form);
    }
    
    private static void printForm(DialogForm form) {
        if (form == null) {
            System.out.println("The form is null");
        } else {
            System.out.println("----<BEGIN>----");
            System.out.println("User: " + form.getUser());
            System.out.println("Pass: " + form.getPass());
            System.out.println("StayIn: " + form.isStayedIn());
            System.out.println("----<END>----");
        }
    }
    
}
