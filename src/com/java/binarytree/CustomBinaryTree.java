package com.java.binarytree;

public class CustomBinaryTree {

    Node root;

    public void addNode(int key, String value) {

        Node node = new Node(key, value);

        if (root == null) {
            root = node;
            return;
        }

        Node currentNode = root;

        while (true) {
            Node parent = currentNode;
            if (key < currentNode.key) {
                currentNode = currentNode.leftChild;
                if (currentNode == null) {
                    parent.leftChild = node;
                    return;
                }
            } else {
                currentNode = currentNode.rightChild;
                if (currentNode == null) {
                    parent.rightChild = node;
                    return;
                }
            }
        }
    }


    public String findNode(int key) {
        Node currentNode = root;

        while (true) {
            if (currentNode == null) return "null";
            if (key == currentNode.key)
                return currentNode.value;
            if (key > currentNode.key)
                currentNode = currentNode.rightChild;
            else currentNode = currentNode.leftChild;
        }
    }

    public void printTree() {

        while (true) {

        }
    }

    class Node {
        int key;
        String value;

        Node leftChild;
        Node rightChild;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
