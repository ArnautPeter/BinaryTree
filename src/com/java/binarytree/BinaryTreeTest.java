package com.java.binarytree;


public class BinaryTreeTest {

    public static void main(String[] args) {

        CustomBinaryTree tree = new CustomBinaryTree();
        tree.addNode(2, "Dog");
        tree.addNode(3, "Turtle");
        tree.addNode(1, "Cat");
        tree.addNode(5, "Duck");
        tree.addNode(12, "Cat");
        tree.addNode(7, "Cat");

        //String res = tree.findNode(4);
        //System.out.println(res);

        tree.printTree(tree.root);
    }
}
