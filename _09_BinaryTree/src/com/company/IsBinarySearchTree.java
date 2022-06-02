package com.company;

public class IsBinarySearchTree {


//     Tree Is Binary Search Tree

//     In Binary Search Tree every left sides node is smaller than parent node and for every right sides nodes is greater than parent node
//     In enery node we will return min,max for every parent node.
//      We Compare node bst and tree bst
//      youtube:-https://youtu.be/kMrbTnd5W9U

    public static class BST {
        boolean IsBst;
        int max;
        int min;
    }


    public static aFullBinaryTree.BST IsTreeBst(aFullBinaryTree.Node node) {
        if (node == null) {
            aFullBinaryTree.BST tr = new aFullBinaryTree.BST();
            tr.IsBst = true;
            tr.min = Integer.MIN_VALUE;
            tr.max = Integer.MAX_VALUE;
            return tr;
        }


        aFullBinaryTree.BST leftnode = IsTreeBst(node.left);
        aFullBinaryTree.BST rightnode = IsTreeBst(node.right);

        aFullBinaryTree.BST tr = new aFullBinaryTree.BST();
        tr.IsBst = leftnode.IsBst && rightnode.IsBst && leftnode.min < node.data && rightnode.max > node.data;

        tr.min = Math.min(node.data, rightnode.min);
        tr.max = Math.max(node.data, leftnode.max);

        return tr;


    }









}
