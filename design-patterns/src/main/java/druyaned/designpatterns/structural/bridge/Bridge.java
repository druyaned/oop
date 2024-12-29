package druyaned.designpatterns.structural.bridge;

import druyaned.designpatterns.structural.bridge.src.AdvancedRemoteControl;
import druyaned.designpatterns.structural.bridge.src.Device;
import druyaned.designpatterns.structural.bridge.src.TV;
import druyaned.designpatterns.structural.bridge.src.RemoteControl;
import druyaned.designpatterns.structural.bridge.src.Radio;
import java.util.ArrayList;
import java.util.List;

/**
 * Lets you split a large class or a set of closely related classes into
 * two separate hierarchies - implementation and abstraction - which can be
 * developed independently of each other. Implementation is also called a
 * {@code platform}, abstraction is also called an {@code interface} in terms
 * of the design patterns.
 * 
 * <P><i>Usage</i><br>
 * The client (this class) works with {@link Device devices} (implementation)
 * and their {@link RemoteControl remote controls} (abstraction).
 * Devices are the {@link Radio} and {@link TV}. Remote controls has
 * a subclass - {@link AdvancedRemoteControl}.
 * 
 * <P><i>Pros and Cons</i><ul>
 *  <li>I can create platform-independent classes and apps.</li>
 *  <li>The client code works with high-level abstractions.
 *      It is not exposed to the platform details.</li>
 *  <li><i>Open/Closed Principle</i>. I can introduce new
 *      implementations and abstractions independently from each other.</li>
 *  <li><i>Single Responsibility Principle</i>.
 *      I can focus on high-level logic in the abstraction and
 *      on platform details in the implementation.</li>
 * </ul>
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the Bridge pattern when you want to divide and organize a
 *      monolithic class that has several variants of some functionality
 *      (for example, if the class can work with various database servers).</li>
 *  <li>Use the pattern when you need to extend a class in several
 *      orthogonal (independent) dimensions.</li>
 *  <li>Use the Bridge if you need to be able to switch implementations
 *      at runtime.</li>
 * </ul>
 * 
 * @author druyaned
 */
public class Bridge {
    
    private static final List<Command<RemoteControl>> radioCommands = new ArrayList<>();
    private static final List<Command<AdvancedRemoteControl>> tvCommands = new ArrayList<>();
    
    public static void main(String[] args) {
        Radio radio = new Radio();
        TV tv = new TV();
        RemoteControl radioRemote = new RemoteControl(radio);
        AdvancedRemoteControl tvRemote = new AdvancedRemoteControl(tv);
        System.out.println("There are 2 implementations: TV and Radio.");
        System.out.println("Also there are 2 abstractions: TVRemote and RadioRemote.");
        tvCommands.add(new Command<>("tvRemote.togglePower", x -> x.togglePower()));
        tvCommands.add(new Command<>("tvRemote.togglePower", x -> x.togglePower()));
        tvCommands.add(new Command<>("tvRemote.volumeUp", x -> x.volumeUp()));
        tvCommands.add(new Command<>("tvRemote.mute", x -> x.mute()));
        tvCommands.add(new Command<>("tvRemote.volumeUp", x -> x.volumeUp()));
        tvCommands.add(new Command<>("tvRemote.volumeUp", x -> x.volumeUp()));
        tvCommands.add(new Command<>("tvRemote.volumeDown", x -> x.volumeDown()));
        tvCommands.add(new Command<>("tvRemote.channelUp", x -> x.channelUp()));
        tvCommands.add(new Command<>("tvRemote.channelUp", x -> x.channelUp()));
        tvCommands.add(new Command<>("tvRemote.channelDown", x -> x.channelDown()));
        tvCommands.add(new Command<>("tvRemote.togglePower", x -> x.togglePower()));
        System.out.println("Executing some commands for the TVRemote...");
        for (Command<AdvancedRemoteControl> command : tvCommands) {
            command.getAction().accept(tvRemote);
            System.out.printf("  Command: %-21s | %s\n", command.getName(), tv);
        }
        radioCommands.add(new Command<>("radioRemote.togglePower", x -> x.togglePower()));
        radioCommands.add(new Command<>("radioRemote.volumeUp", x -> x.volumeUp()));
        radioCommands.add(new Command<>("radioRemote.volumeUp", x -> x.volumeUp()));
        radioCommands.add(new Command<>("radioRemote.volumeDown", x -> x.volumeDown()));
        radioCommands.add(new Command<>("radioRemote.channelUp", x -> x.channelUp()));
        radioCommands.add(new Command<>("radioRemote.channelUp", x -> x.channelUp()));
        radioCommands.add(new Command<>("radioRemote.channelDown", x -> x.channelDown()));
        radioCommands.add(new Command<>("radioRemote.togglePower", x -> x.togglePower()));
        System.out.println("Executing some commands for the RadioRemote...");
        for (Command<RemoteControl> command : radioCommands) {
            command.getAction().accept(radioRemote);
            System.out.printf("  Command: %-24s | %s\n", command.getName(), radio);
        }
    }
    
}
