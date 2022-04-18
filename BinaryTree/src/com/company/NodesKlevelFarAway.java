package com.company;

import java.util.ArrayList;

public class NodesKlevelFarAway {


    //*********
//    Print Nodes K Level Far Away

//    In this Question we use two question
//    node to root path and k level down question
//    Youtube link:- https://youtu.be/B89In5BctFA

//    Very Important Question

    public static void NodesKLevelFarAway(aFullBinaryTree.Node node, int data, int k) {

//        Array list for node to root path
        NodeToRoot(node, data);
//        Arraylist ans will have all the node tp root path init

        for (int i = 0; i < ans.size(); i++) {
//           System.out.print("->" +ans.get(i).data);
            KLevelDown2(ans.get(i), 2, i == 0 ? null : ans.get(i - 1));
        }


    }

    public static void KLevelDown2(aFullBinaryTree.Node node, int k, aFullBinaryTree.Node blocker) {
        if (node == null || k < 0 || node == blocker) {
            return;
        }
        if (k == 0) {
            System.out.println(node.data);

        }

        KLevelDown(node.left, k - 1);
        KLevelDown(node.right, k - 1);
    }






















    public static void KLevelDown(aFullBinaryTree.Node node, int k) {
        if (node == null || k < 0) {
            return;
        }
        if (k == 0) {
            System.out.println(node.data);

        }

        KLevelDown(node.left, k - 1);
        KLevelDown(node.right, k - 1);
    }




    static ArrayList<aFullBinaryTree.Node> ans=new ArrayList<>();
    public static boolean NodeToRoot(aFullBinaryTree.Node node, int target){

        if(node==null){
            return false;

        }

        if(node.data==target){
            ans.add(node);
            return true;
        }

        if(NodeToRoot(node.left,target)){
            ans.add(node);
            return true;
        }

        if(NodeToRoot(node.right,target)){
            ans.add(node);
            return true;
        }


        return false;
    }



}
