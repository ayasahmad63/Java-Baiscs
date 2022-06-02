package com.company;

public class LeftClonedTree {


//    Transform to left cloned tree
//    youtube- https://youtu.be/TO7trQloRXc

    public static aFullBinaryTree.Node TransformToLeftClonedTree(aFullBinaryTree.Node node) {
        if (node == null) {
            return null;
        }

        aFullBinaryTree.Node leftnode = TransformToLeftClonedTree(node.left);
        aFullBinaryTree.Node rightnode = TransformToLeftClonedTree(node.right);

        aFullBinaryTree.Node newnode = new aFullBinaryTree.Node(node.data, leftnode, null);
        node.left = newnode;

        node.right = rightnode;

        return node;
    }




}
