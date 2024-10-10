package com.github.druyaned.designpatterns.creational.builder.src;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * A house with {@link Dimensions dimensions} and additions.
 * House can have some additions (e.g. garage or garden) or no one.
 * 
 * @author druyaned
 */
public class House {
    
    private final Map<Class<? extends Addition>, Addition> classToAddition;
    
    House() {
        classToAddition = new HashMap<>();
    }
    
    public Set<Class<? extends Addition>> additionClasses() {
        return Collections.unmodifiableSet(classToAddition.keySet());
    }
    
    public Addition getAddition(Class<? extends Addition> cl) {
        return classToAddition.get(cl);
    }
    
    void putAddition(Class<? extends Addition> cl, Addition addition) {
        classToAddition.put(cl, addition);
    }
    
    void removeAddition(Class<? extends Addition> cl) {
        classToAddition.remove(cl);
    }
    
    @Override public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("House{classToAddition={");
        Iterator<Map.Entry<Class<? extends Addition>, Addition>>
                iter = classToAddition.entrySet().iterator();
        if (iter.hasNext()) {
            Map.Entry<Class<? extends Addition>, Addition> entry = iter.next();
            String className = entry.getKey().getSimpleName();
            Addition addition = entry.getValue();
            builder
                    .append(className)
                    .append(".class : ")
                    .append(addition);
        }
        while (iter.hasNext()) {
            Map.Entry<Class<? extends Addition>, Addition> entry = iter.next();
            String className = entry.getKey().getSimpleName();
            Addition addition = entry.getValue();
            builder
                    .append(", ")
                    .append(className)
                    .append(".class : ")
                    .append(addition);
        }
        builder.append('}');
        return builder.toString();
    }
    
}
