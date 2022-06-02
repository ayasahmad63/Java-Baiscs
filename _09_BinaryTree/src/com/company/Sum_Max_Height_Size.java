package com.company;

public class Sum_Max_Height_Size {


// aFullBinaryTree.Node =Node

//    Height Of the Binary Tree

    public static int HeightBinaryTree(aFullBinaryTree.Node node){

        if(node==null){
            return 0;
        }
        int left=HeightBinaryTree(node.left);
        int right=HeightBinaryTree(node.right);
        int height=right>left?right:left;

        height++;
        return height;
    }




//Sum

    public static int Sum(aFullBinaryTree.Node node){


        if(node==null){
            return 0;
        }
        int leftsum=Sum(node.left);
        int rightsum=Sum(node.right);

        int totalsum =leftsum+rightsum+node.data;




        return totalsum;
    }


//    Max Of Binary Tree

    public static int Max(aFullBinaryTree.Node node){
        int ans=node.data;
        if(node==null){
            return Integer.MIN_VALUE;
        }

        int  leftMax=Max(node.left)>ans?Max(node.left):ans;
        int rightMax=Max(node.right)>ans?Max(node.right):ans;


        return ans;
    }




    //    Size of the Binary Tree
    public static int Size(aFullBinaryTree.Node node){
        int ans=0;
        if(node==null){
            return 0;
//            0 means height is in vertices
//            -1 means height is in edges
        }
        ans+=Size(node.left);


        ans+=Size(node.right);
        ans++;

        return ans;
    }










}
