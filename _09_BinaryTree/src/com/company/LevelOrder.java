package com.company;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrder {

// Level Order

//    In Level Queue is Used  and in this Method  rpa We will print n.data and then we will left and right node to stack

    public static void LevelTraversal(aFullBinaryTree.Node node){
        Queue<aFullBinaryTree.Node> que=new ArrayDeque<>();
        que.add(node);

        while(que.size()>0){
            int j=que.size();
            for(int i=0;i<j;i++){
                aFullBinaryTree.Node n=que.remove();
                if(n.left!=null){
                    que.add(n.left);
                }
                if(n.right!=null){
                    que.add(n.right);
                }
                System.out.print(" "+n.data);

            }
            System.out.println();


        }



    }



}
