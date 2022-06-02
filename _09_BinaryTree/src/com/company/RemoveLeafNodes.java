package com.company;

public class RemoveLeafNodes {


//   Remove Leaf Nodes

    public static aFullBinaryTree.Node RemoveLeavesNode(aFullBinaryTree.Node node) {

        if (node == null) {
            return null;
        }
        if (node.left == null && node.right == null) {
            return null;
        }

        node.left = RemoveLeavesNode(node.left);
        node.right = RemoveLeavesNode(node.right);


        return node;
    }



}
