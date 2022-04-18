package com.company;

public class Traversal {



// Traversal In Binary Tree:- Pre,In Post


    public static  void Traversal(aFullBinaryTree.Node node)
    {
        if(node==null){
            return ;
        }


        System.out.println("Pre ->" +node.data); //Pre  -> EULER LEFT
        Traversal(node.left);
        System.out.println("In ->" +node.data);  //In   -> EULER BETWEEN
        Traversal(node.right);
        System.out.println("Post ->" +node.data);  //Post  -> EULER RIGHT
    }




//   hshshhshshshshshhsjfahfdskhfadsj



}
