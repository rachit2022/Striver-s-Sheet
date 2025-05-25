package com.striver.java.tree;

public class Main {
    public static void main(String[] args) {
        // BinaryTree binaryTree=new BinaryTree();
        // Scanner scanner=new Scanner(System.in);
        // binaryTree.populate(scanner);
        // binaryTree.display();

        BST bst = new BST();
        int[] values = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
        // int[] sortedValues = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        bst.populate(values);
        // bst.display();
        // System.out.println("\nHeight of the tree: " + bst.height());
        // bst.populateSorted(sortedValues);
        // bst.display();
        // System.out.println("\nHeight of the tree after populating sorted values: " +
        // bst.height());
        bst.inOrder();
        bst.preOder();
        bst.postOrder();

    }
}
