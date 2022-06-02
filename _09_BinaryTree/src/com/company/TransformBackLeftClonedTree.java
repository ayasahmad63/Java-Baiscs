package com.company;

public class TransformBackLeftClonedTree {


//    Transform back from left cloned tree

    public static aFullBinaryTree.Node TransformBackLeftClonedTree(aFullBinaryTree.Node node) {

        if (node == null) {
            return null;
        }


        aFullBinaryTree.Node LeftBackNode = TransformBackLeftClonedTree(node.left.left);
        aFullBinaryTree.Node RightBackNode = TransformBackLeftClonedTree(node.left.left);

        node.left = LeftBackNode;
        node.right = RightBackNode;

        return node;
    }


}
