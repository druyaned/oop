package com.github.druyaned.designpatterns.structural.adapter;

import com.github.druyaned.designpatterns.structural.adapter.src.RoundHole;
import com.github.druyaned.designpatterns.structural.adapter.src.RoundPeg;
import com.github.druyaned.designpatterns.structural.adapter.src.SquarePeg;
import com.github.druyaned.designpatterns.structural.adapter.src.SquareToRoundPeg;

/**
 * Allows objects with incompatible interfaces to collaborate.
 * Typical usage example: a library works with XML-files, but
 * you've chosen the JSON format. So the Adapter provides the
 * conversion: JSON to XML. Can be implemented as a wrapper
 * or subclass.
 * 
 * <P><i>Usage</i><br>
 * The client (this class) works with the {@link RoundHole}.
 * To clarify does a {@link SquarePeg square peg} fit for a round hole
 * there is the {@link SquareToRoundPeg} adapter.
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the Adapter class when you want to use some existing class,
 *      but its interface is not compatible with the rest of your code.</li>
 *  <li>Use the pattern when you want to reuse several existing subclasses
 *      that lack some common functionality that can’t be added to the superclass.</li>
 * </ul>
 * 
 * @author druyaned
 */
public class Adapter {
    
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(4.5);
        SquarePeg squarePeg = new SquarePeg(6d);
        RoundPeg roundPeg = new SquareToRoundPeg(squarePeg);
        System.out.println("RoundHole: radius       =" + roundHole.getRadius());
        System.out.println("SquarePeg: width        =" + squarePeg.getWidth());
        System.out.println("SquareToRoundPeg: radius=" + roundPeg.getRadius());
        System.out.println("roundHole.fits(roundPeg)=" + roundHole.fits(roundPeg));
    }
    
}
