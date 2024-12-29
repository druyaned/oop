package druyaned.designpatterns.behavioral.chain;

import druyaned.designpatterns.behavioral.chain.src.Box;
import druyaned.designpatterns.behavioral.chain.src.Button;
import druyaned.designpatterns.behavioral.chain.src.Panel;

/**
 * Lets you pass requests along a chain of handlers. Upon receiving a request,
 * each handler decides either to process the request or to pass it to the next
 * handler in the chain.
 * 
 * <P><i>Usage</i><br>
 * The Client may compose chains just once or compose them dynamically,
 * depending on the application’s logic. Note that a request can be sent
 * to any handler in the chain - it doesn’t have to be the first one.
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the Chain of Responsibility pattern when your program is expected
 *      to process different kinds of requests in various ways, but the exact
 *      types of requests and their sequences are unknown beforehand.</li>
 *  <li>Use the pattern when it’s essential to execute several handlers
 *      in a particular order.</li>
 *  <li>Use the CoR pattern when the set of handlers and their order
 *      are supposed to change at runtime.</li>
 * </ul>
 * 
 * @author druyaned
 */
public class ChainOfResponsibility {
    
    public static void main(String[] args) {
        Panel panel = new Panel();
        Box box = new Box(panel);
        Button button = new Button(box);
        panel.setManual("ManPage");
        box.setWikiPage("WikiLink");
        StringBuilder builder = new StringBuilder();
        button.appendHelp(builder);
        System.out.print(builder.toString());
    }
    
}
