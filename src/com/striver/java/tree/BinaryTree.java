package com.striver.java.tree;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree() {

    }

    private static class Node {
        private final int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner scanner) {
        System.out.print("Enter the value of root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.print("Enter the value of left node: ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.print("Enter the value of right node: ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        display(root);
    }

    private void display(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " -> ");
        display(node.left);
        display(node.right);
        System.out.println("null");
    }

}
