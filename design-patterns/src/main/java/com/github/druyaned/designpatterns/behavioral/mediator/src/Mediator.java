package com.github.druyaned.designpatterns.behavioral.mediator.src;

/**
 * The Mediator interface declares methods of communication with components,
 * which usually include just a single notification method. Components may pass
 * any context as arguments of this method, including their own objects,
 * but only in such a way that no coupling occurs between a receiving component
 * and the sender’s class.
 * 
 * @author druyaned
 */
public interface Mediator {
    
    /**
     * This method can be split into several parts depending on events:
     * <ul>
     *  <li>informButtonPress</li>
     *  <li>informCheckboxSwitch</li>
     *  <li>informDialogOpen</li>
     *  <li>informDialogClose</li>
     *  <li>informTextboxSet</li>
     * </ul>
     * 
     * @param component event invoker
     * @param event provides what happened
     */
    void inform(Component component, Event event);
    
}
