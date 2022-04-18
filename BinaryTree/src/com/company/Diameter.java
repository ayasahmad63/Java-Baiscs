package com.company;

public class Diameter {


//     Diameter of Binary Tree
//    youtube:- https://youtu.be/S0Bwgtn32uI


//     In this question we consider three conditiion which are:-
//     1)Both deepest  nodes lies on left side tree
//     2)Both deepest  nodes lies on right side tree
//     3)One Deepest node lies on left and another lies on right
//      We find the heights of the  left node and righ node then compare it with left deepest and right deepest node


//    Method 1 :- Inefficient and it time complexity isi O(n2)
//


    public static int Diameter(aFullBinaryTree.Node node) {
        if (node == null) {
            return 0;
        }
        int leftDiameter = Diameter(node.left);
        int rightDiameter = Diameter(node.right);

        int leftandrightheight = Height1(node.left) + Height1(node.right) + 2;

        int dia = Math.max(leftandrightheight, Math.max(leftDiameter, rightDiameter));


        return dia;
    }

    public static int Height1(aFullBinaryTree.Node node) {
        int heights = 0;
        if (node == null) {
            return 0;
        }
        int left = Height1(node.left);
        int right = Height1(node.right);
        heights = Math.max(left, right);
        heights++;
        return heights;
    }


//    Method 2 ;- Efiiecient and time complexity is O(n)
//    In this mehod we donot call for hights in post call of the recursion but we sent both heghts and diameter in pair
//    And heights we icrement it by every sent


    public static class Pairs {
        int height;
        int diameter;
    }


    public static aFullBinaryTree.Pairs Diameter2(aFullBinaryTree.Node node) {

        if (node == null) {
            aFullBinaryTree.Pairs p = new aFullBinaryTree.Pairs();
            p.height = -1;
            p.diameter = 0;
            return p;
        }

        aFullBinaryTree.Pairs leftnode = Diameter2(node.left);
        aFullBinaryTree.Pairs rightnode = Diameter2(node.right);

        aFullBinaryTree.Pairs p = new aFullBinaryTree.Pairs();
        p.height = leftnode.height + rightnode.height + 1;

        p.diameter = Math.max(p.height + 2, Math.max(leftnode.diameter, rightnode.diameter));

        return p;
    }



}
