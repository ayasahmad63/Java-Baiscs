package com.company;

import java.util.ArrayList;

public class NodeToRootPath {



    //    Node to Root Path
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
