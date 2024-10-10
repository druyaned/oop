package com.github.druyaned.designpatterns.structural.facade.src;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The {@code Facade} provides convenient access to a particular part of
 * the subsystem’s functionality. It knows where to direct
 * the client’s request and how to operate all the moving parts.
 * 
 * <P>Also an {@code Additional Facade} can be created to prevent polluting
 * a single facade with unrelated features that might make it yet
 * another complex structure.
 * 
 * @author druyaned
 */
public class CheeseFinder {
    
    private final Pattern pattern = Pattern.compile("[cC][hH][eE][eE][sS][eE]");
    
    public List<CheeseStart> getCheeseListOf(String text) {
        Matcher matcher = pattern.matcher(text);
        List<CheeseStart> cheeseList = new ArrayList<>();
        while (matcher.find()) {
            cheeseList.add(new CheeseStart(matcher.group(), matcher.start()));
        }
        return cheeseList;
    }
    
}
