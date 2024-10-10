package com.github.druyaned.designpatterns.structural.composite.bintree;

import java.util.ArrayDeque;

public class BinTree {
    
    public static void main(String[] args) {
        Node<Integer> root = new Node(5);
        // left
        Node<Integer> left = new Node(2).setParent(root);
        root.setLeft(left);
        Node<Integer> leftLeft = new Node(1).setParent(left);
        left.setLeft(leftLeft);
        Node<Integer> leftRight = new Node(4).setParent(left);
        left.setRight(leftRight);
        // right
        Node<Integer> right = new Node(7).setParent(root);
        root.setRight(right);
        Node<Integer> rightLeft = new Node(6).setParent(right);
        right.setLeft(rightLeft);
        // show
        showTree(root);
    }
    
    public static void showTree(Component<Integer> root) {
        ArrayDeque<Component<Integer>> deque = new ArrayDeque<>();
        deque.addLast(root);
        showTree(deque);
    }
    
    private static void showTree(ArrayDeque<Component<Integer>> deque) {
        if (deque.isEmpty()) {
            return;
        }
        Component<Integer> component = deque.removeFirst();
        System.out.print(component.value());
        if (component.hasChildren()) {
            Node<Integer> node = (Node<Integer>)component;
            if (node.left != null && node.right != null) {
                System.out.print(
                        ": left=" + node.left.value()
                        + ", right=" + node.right.value()
                );
                deque.addLast(node.left);
                deque.addLast(node.right);
            }
            if (node.left != null && node.right == null) {
                System.out.print(": left=" + node.left.value());
                deque.addLast(node.left);
            }
            if (node.left == null && node.right != null) {
                System.out.print(": right=" + node.right.value());
                deque.addLast(node.right);
            }
        }
        System.out.println();
        showTree(deque);
    }
    
}
