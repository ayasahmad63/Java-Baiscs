package com.company;

public class LargestBST {





//       Largest BST
//       In this question we use similar question but only we add some  more properties to add in them.
//       youtube:-https://youtu.be/UGsJz8fSYp0




    public static class BST1 {
        boolean IsBst;
        int max;
        int min;
        aFullBinaryTree.Node root;
        int size;
    }


    public static aFullBinaryTree.BST1 LargestBstTree(aFullBinaryTree.Node node) {
        if (node == null) {
            aFullBinaryTree.BST1 tr = new aFullBinaryTree.BST1();
            tr.IsBst = true;
            tr.min = Integer.MIN_VALUE;
            tr.max = Integer.MAX_VALUE;
            tr.root=null;
            tr.size=0;
            return tr;
        }


        aFullBinaryTree.BST1 leftnode = LargestBstTree(node.left);
        aFullBinaryTree.BST1 rightnode = LargestBstTree(node.right);

        aFullBinaryTree.BST1 tr = new aFullBinaryTree.BST1();
        tr.IsBst = leftnode.IsBst && rightnode.IsBst && leftnode.min < node.data && rightnode.max > node.data;

        tr.min = Math.min(node.data, rightnode.min);
        tr.max = Math.max(node.data, leftnode.max);

        if(tr.IsBst){
            tr.root=node;
            tr.size=leftnode.size + rightnode.size +1;
        }else if(leftnode.size >rightnode.size){
            tr.root=leftnode.root;
            tr.size=leftnode.size;
        }else{
            tr.root=rightnode.root;
            tr.size=rightnode.size;
        }



        return tr;


    }











}
