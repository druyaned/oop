package com.github.druyaned.designpatterns.structural.facade;

import com.github.druyaned.designpatterns.structural.facade.src.CheeseFinder;
import com.github.druyaned.designpatterns.structural.facade.src.CheeseStart;
import java.util.List;

/**
 * Provides a simplified interface to a library, a framework,
 * or any other complex set of classes. Having a facade is handy
 * when you need to integrate your app with a sophisticated library
 * that has dozens of features, but you just need a tiny bit of its functionality.
 * 
 * <P><i>Usage</i><br>
 * The Client uses the {@link CheeseFinder facade} instead of calling
 * the subsystem objects ({@link java.util.regex.Pattern Pattern},
 * {@link java.util.regex.Matcher Matcher}) directly.
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the Facade pattern when you need to have a limited
 *      but straightforward interface to a complex subsystem.</li>
 *  <li>Use the Facade when you want to structure a subsystem into layers.</li>
 * </ul>
 * 
 * @author druyaned
 */
public class Facade {
    
    public static void main(String[] args) {
        String text =
                """
                This text likes cheese
                which can be written in a different ways:
                cHeEsE, ChEeSe, chEEse, CHeeSE, cheESE, CHEese,
                cheese, CHEESE. Also the cheese is tasty and
                joyfully beautiful.
                """;
        System.out.println("Text:");
        System.out.print(text);
        System.out.println("----------------");
        CheeseFinder cheeseFinder = new CheeseFinder();
        List<CheeseStart> cheeseList = cheeseFinder.getCheeseListOf(text);
        System.out.println("Cheese list:");
        for (CheeseStart cheeseStart : cheeseList) {
            System.out.println("  " + cheeseStart);
        }
        System.out.println("Cheese list size: " + cheeseList.size());
    }
    
}
