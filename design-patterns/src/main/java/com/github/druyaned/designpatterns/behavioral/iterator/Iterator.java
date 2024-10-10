package com.github.druyaned.designpatterns.behavioral.iterator;

import com.github.druyaned.designpatterns.behavioral.iterator.src.List;

/**
 * Lets you traverse elements of a collection without exposing its
 * underlying representation (list, stack, tree, etc.).
 * 
 * <P><i>Usage</i><br>
 * The Client works with both collections and iterators via their interfaces.
 * This way the client isn’t coupled to concrete classes, allowing you to use
 * various collections and iterators with the same client code.<br>
 * Typically, clients don’t create iterators on their own, but instead get
 * them from collections. Yet, in certain cases, the client can create one
 * directly; for example, when the client defines its own special iterator.
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the Iterator pattern when your collection has a complex
 *      data structure under the hood, but you want to hide its
 *      complexity from clients (either for convenience or security reasons).</li>
 *  <li>Use the pattern to reduce duplication of the traversal code
 *      across your app.</li>
 *  <li>Use the Iterator when you want your code to be able to traverse
 *      different data structures or when types of these structures are unknown beforehand.</li>
 * </ul>
 * 
 * @author druyaned
 */
public class Iterator {
    
    public static void main(String[] args) {
        List<Integer> list = new List<>(4);
        int[] values = { 1, 3, 5, 7, 9 };
        for (int i = 0; i < values.length; i++) {
            addAndPrintList(values[i], list);
        }
        com.github.druyaned.designpatterns.behavioral.iterator.src.Iterator<Integer>
                iter = list.iterator();
        System.out.println("Printing the list by the iterator...");
        if (iter.hasNext()) {
            System.out.print(iter.next());
        }
        while (iter.hasNext()) {
            System.out.print(" " + iter.next());
        }
        System.out.println();
        iter.reset();
    }
    
    private static void addAndPrintList(int value, List<Integer> list) {
        System.out.println("--------");
        System.out.println("Adding " + value + " to the list...");
        list.add(value);
        System.out.print("List:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
        System.out.println();
        System.out.println("Capacity: " + list.capacity());
        System.out.println("Size:     " + list.size());
        System.out.println("--------");
    }
    
}
