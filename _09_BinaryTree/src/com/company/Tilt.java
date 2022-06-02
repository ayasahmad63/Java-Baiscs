package com.company;

public class Tilt {


//   Tilt of Binary Tree
//   Insuch type of question we sent different thing in recursion and we change in  different value
//    In this question we return sum of the till node then we change thevalue in tilt variable

    static int tilt = 0;

    public static int Tilt(aFullBinaryTree.Node node) {

        if (node == null) {
            return 0;
        }

        int leftsum = Tilt(node.left);
        int rightsum = Tilt(node.right);

        tilt = Math.abs(leftsum - rightsum);

        int sum = leftsum + rightsum + node.data;
        return sum;
    }


}
