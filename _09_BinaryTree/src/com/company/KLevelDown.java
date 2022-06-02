package com.company;

public class KLevelDown {



//    Print K Level Down


    public static void KLevelDown(aFullBinaryTree.Node node, int k){
        if(node==null || k<0){
            return ;
        }
        if(k==0){
            System.out.println(node.data);

        }

        KLevelDown(node.left,k-1);
        KLevelDown(node.right,k-1);
    }








}
