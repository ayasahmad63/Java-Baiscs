package com.company;

public class RoottoLeafPath {




//
// Path to Leaf From Root
// In this Question we print root to leaf path for every if it lies between high and low value


    public static void RootToLeaf(aFullBinaryTree.Node node, String ans, int sum, int low, int high) {

        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            if (sum >= low && sum <= high) {
                System.out.println(ans);
            }
            return;
        }


        RootToLeaf(node.left, ans + node.data, sum + node.data, low, high);
        RootToLeaf(node.right, ans + node.data, sum + node.data, low, high);


    }











}
