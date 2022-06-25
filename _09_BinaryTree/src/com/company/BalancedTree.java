//package com.company;
//
//public class BalancedTree {
//
//
//
//
//
//    //  Balanced Tree :- A Balanced tree whose left tree height - right tree height should not exceed 1
////  youtube link:- https://youtu.be/lUDgp2D6sf8
////     Method 1
//    static boolean f=true;
//    public static int BalancedTree(aFullBinaryTree.Node node){
//        if(node == null){
//            return 0;
//        }
//        int leftheight=BalancedTree(node.left);
//        int rightheight=BalancedTree(node.right);
//
//        if(Math.abs(leftheight-rightheight)>1){
//            f=false;
//        }
//        int height=Math.max(leftheight,rightheight)+1;
//        return  height;
//    }
//
//
//
//    //     Method 2
//    public static  class BalTree{
//        boolean ans;
//        int height;
//    }
//
//    public static aFullBinaryTree.BalTree BalancedTree(aFullBinaryTree.Node node){
//        if(node==null){
//            aFullBinaryTree.BalTree br=new aFullBinaryTree.BalTree();
//            br.ans=true;
//            br.height=0;
//            return br;
//        }
//
//
////        aFullBinaryTree.BalTree left=BalancedTree(node.left);
////        aFullBinaryTree.BalTree right=BalancedTree(node.right);
//
//        aFullBinaryTree.BalTree br=new aFullBinaryTree.BalTree();
//        br.ans=left.ans && right.ans && Math.abs(left.height-right.height)>1;
//        br.height=Math.max(left.height,right.height)+1;
//
//        return br;
//    }



































