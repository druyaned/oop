package com.github.druyaned.designpatterns.behavioral.mediator.src;

/**
 * Components are various classes that contain some business logic.
 * Each component has a reference to a mediator, declared with
 * the type of the mediator interface. The component isn’t aware of
 * the actual class of the mediator, so you can reuse the component
 * in other programs by linking it to a different mediator.
 * 
 * <P>Components must not be aware of other components. If something
 * important happens within or to a component, it must only notify
 * the mediator. When the mediator receives the notification, it can
 * easily identify the sender, which might be just enough to decide
 * what component should be triggered in return.
 * 
 * <P>From a component’s perspective, it all looks like a total
 * black box. The sender doesn’t know who’ll end up handling its
 * request, and the receiver doesn’t know who sent the request
 * in the first place.
 * 
 * @author druyaned
 */
public class Component {
    
    private final String id;
    protected final Mediator mediator;
    
    public Component(String id, Mediator mediator) {
        this.id = id;
        this.mediator = mediator;
    }
    
    public String getId() {
        return id;
    }
    
}
