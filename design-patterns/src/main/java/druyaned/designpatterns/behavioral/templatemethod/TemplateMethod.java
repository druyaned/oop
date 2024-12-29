package druyaned.designpatterns.behavioral.templatemethod;

import druyaned.designpatterns.behavioral.templatemethod.src.FerrariTeam;
import druyaned.designpatterns.behavioral.templatemethod.src.RaceTeam;
import druyaned.designpatterns.behavioral.templatemethod.src.RedBullTeam;

/**
 * Defines the skeleton of an algorithm in the superclass but lets subclasses
 * override specific steps of the algorithm without changing its structure.
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the Template Method pattern when you want to let clients extend
 *      only particular steps of an algorithm, but not the whole algorithm or
 *      its structure.</li>
 *  <li>Use the pattern when you have several classes that contain almost
 *      identical algorithms with some minor differences. As a result,
 *      you might need to modify all classes when the algorithm changes.</li>
 * </ul>
 * 
 * @author druyaned
 */
public class TemplateMethod {
    
    public static void main(String[] args) {
        RaceTeam redBull = new RedBullTeam("RedBull");
        RaceTeam ferrari = new FerrariTeam("Ferrari");
        redBull.race();
        ferrari.race();
    }
    
}
