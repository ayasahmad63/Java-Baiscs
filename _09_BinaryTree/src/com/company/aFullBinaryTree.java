package com.company;

import com.sun.source.tree.NewArrayTree;

import java.util.*;

// In Construction of Binary We take stack of Pair and in this we push element and perform  according to the conditions

//  Conditions:-
//  If state==1 then  add on left
//  If state==2 then  add on right
//  other pop out from the stack


public class aFullBinaryTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }


    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }

    }

    public static void main(String[] args) {

        Integer arr[] = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};

        Stack<Pair> stk = new Stack<>();
        Node head = new Node(50, null, null);
        Pair pa = new Pair(head, 1);
        stk.push(pa);

        int i = 0;
        while (stk.size() > 0) {
            Pair bs = stk.peek();
            if (bs.state == 1) {
                i++;
                if (arr[i] != null) {
                    bs.node.left = new Node(arr[i], null, null);

                    Pair lp = new Pair(bs.node.left, 1);
                    stk.push(lp);
                } else {
                    bs.node.left = null;
                }
                bs.state++;
            } else if (bs.state == 2) {
                i++;
                if (arr[i] != null) {
                    bs.node.right = new Node(arr[i], null, null);

                    Pair lp = new Pair(bs.node.right, 1);
                    stk.push(lp);
                } else {
                    bs.node.right = null;
                }
                bs.state++;
            } else {
                stk.pop();

            }
        }


//        display(head);


//        Height
//        System.out.println(HeightBinaryTree(head));


//        Sum
//        System.out.println(Sum(head));


//        Max
//        System.out.println(Max(head));


//        Size
//        System.out.println(Size(head))


//        Traversal :- Pre,Post,In
//          Traversal(head);


//        Level Order Traversal
//        LevelTraversal(head);


//        Ilterative
//        IlterativeTraversal(head);


//      Root to Node Path
//        System.out.println(NodeToRoot(head,62));
//        for(int m=0;m<ans.size();m++){
//            System.out.println(ans.get(m));
//        }


//        Print K Level Dowm

//        KLevelDown(head,2);


//        Print K Level Far Nodes
        NodesKLevelFarAway(head, 25, 2);


    }


//  In this We use alse conditon for node is null

    public static void display(Node node) {

        if (node == null) {
            return;
        }

        String ans = "";
        ans += node.left == null ? "." : node.left.data + " ";
        ans += "<-" + node.data + "->";
        ans += node.right == null ? "." : node.right.data + "";

        System.out.println(ans);

        display(node.left);
        display(node.right);


    }


//    Height Of the Binary Tree

    public static int HeightBinaryTree(Node node) {

        if (node == null) {
            return 0;
        }
        int left = HeightBinaryTree(node.left);
        int right = HeightBinaryTree(node.right);
        int height = right > left ? right : left;

        height++;
        return height;
    }


//Sum

    public static int Sum(Node node) {


        if (node == null) {
            return 0;
        }
        int leftsum = Sum(node.left);
        int rightsum = Sum(node.right);

        int totalsum = leftsum + rightsum + node.data;


        return totalsum;
    }


//    Max Of Binary Tree

    public static int Max(Node node) {
        int ans = node.data;
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = Max(node.left) > ans ? Max(node.left) : ans;
        int rightMax = Max(node.right) > ans ? Max(node.right) : ans;


        return ans;
    }


    //    Size of the Binary Tree
    public static int Size(Node node) {
        int ans = 0;
        if (node == null) {
            return 0;
//            0 means height is in vertices
//            -1 means height is in edges
        }
        ans += Size(node.left);


        ans += Size(node.right);
        ans++;

        return ans;
    }


// Traversal In Binary Tree:- Pre,In Post


    public static void Traversal(Node node) {
        if (node == null) {
            return;
        }


        System.out.println("Pre ->" + node.data); //Pre  -> EULER LEFT
        Traversal(node.left);
        System.out.println("In ->" + node.data);  //In   -> EULER BETWEEN
        Traversal(node.right);
        System.out.println("Post ->" + node.data);  //Post  -> EULER RIGHT
    }


// Level Order

//    In Level Queue is Used  and in this Method  rpa We will print n.data and then we will left and right node to stack


    public static void LevelTraversal(Node node) {
        Queue<Node> que = new ArrayDeque<>();
        que.add(node);

        while (que.size() > 0) {
            int j = que.size();
            for (int i = 0; i < j; i++) {
                Node n = que.remove();
                System.out.print(" " + n.data);
                if (n.left != null) {
                    que.add(n.left);
                }
                if (n.right != null) {
                    que.add(n.right);
                }

            }
            System.out.println();


        }


    }


//    Ilterative Traversal :- pre,in,post
// In  this method we use Stack of Pair  then we check the state of pair and perform according to it
//    if(state==1)  -> then we take to left and increase the state and add tp pre
//    if(state==2)  -> then we take to right and increase the state and add tp in
//    if(state==3)  -> then we take to pop out and increase the state and add tp post


    private static class IlteraTraver {
        Node node;
        int state;

        IlteraTraver(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }


    public static void IlterativeTraversal(Node node) {
        Stack<IlteraTraver> st = new Stack<>();
        IlteraTraver ilte = new IlteraTraver(node, 1);
        st.push(ilte);

        String pre = "";
        String in = "";
        String post = "";


        while (st.size() > 0) {
            IlteraTraver top = st.peek();

            if (top.state == 1) {
                pre = pre + top.node.data + " ";
                top.state++;
                if (top.node.left != null) {
                    IlteraTraver l = new IlteraTraver(top.node.left, 1);
                    st.push(l);
                }

            } else if (top.state == 2) {

                in = in + top.node.data + " ";
                top.state++;
                if (top.node.right != null) {
                    IlteraTraver r = new IlteraTraver(top.node.right, 1);
                    st.push(r);
                }

            } else {
                post = post + top.node.data + " ";
                top.state++;
                st.pop();

            }


        }


        System.out.println("PRE :- " + pre);
        System.out.println("IN :- " + in);
        System.out.println("Post :- " + post);


    }


    //    Node to Root Path
    static ArrayList<Node> ans = new ArrayList<>();

    public static boolean NodeToRoot(Node node, int target) {

        if (node == null) {
            return false;

        }

        if (node.data == target) {
            ans.add(node);
            return true;
        }

        if (NodeToRoot(node.left, target)) {
            ans.add(node);
            return true;
        }

        if (NodeToRoot(node.right, target)) {
            ans.add(node);
            return true;
        }


        return false;
    }


//    Print K Level Down


    public static void KLevelDown(Node node, int k) {
        if (node == null || k < 0) {
            return;
        }
        if (k == 0) {
            System.out.println(node.data);

        }

        KLevelDown(node.left, k - 1);
        KLevelDown(node.right, k - 1);
    }


//*********
//    Print Nodes K Level Far Away

//    In this Question we use two question
//    node to root path and k level down question
//    Youtube link:- https://youtu.be/B89In5BctFA

//    Very Important Question

    public static void NodesKLevelFarAway(Node node, int data, int k) {

//        Array list for node to root path
        NodeToRoot(node, data);
//        Arraylist ans will have all the node tp root path init

        for (int i = 0; i < ans.size(); i++) {
//           System.out.print("->" +ans.get(i).data);
            KLevelDown2(ans.get(i), 2, i == 0 ? null : ans.get(i - 1));
        }


    }

    public static void KLevelDown2(Node node, int k, Node blocker) {
        if (node == null || k < 0 || node == blocker) {
            return;
        }
        if (k == 0) {
            System.out.println(node.data);

        }

        KLevelDown(node.left, k - 1);
        KLevelDown(node.right, k - 1);
    }


//
// Path to Leaf From Root
// In this Question we print root to leaf path for every if it lies between high and low value


    public static void RootToLeaf(Node node, String ans, int sum, int low, int high) {

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


//    Transform to left cloned tree
//    youtube- https://youtu.be/TO7trQloRXc

    public static Node TransformToLeftClonedTree(Node node) {
        if (node == null) {
            return null;
        }

        Node leftnode = TransformToLeftClonedTree(node.left);
        Node rightnode = TransformToLeftClonedTree(node.right);

        Node newnode = new Node(node.data, leftnode, null);
        node.left = newnode;

        node.right = rightnode;

        return node;
    }


//    Transform back from left cloned tree

    public static Node TransformBackLeftClonedTree(Node node) {

        if (node == null) {
            return null;
        }


        Node LeftBackNode = TransformBackLeftClonedTree(node.left.left);
        Node RightBackNode = TransformBackLeftClonedTree(node.left.left);

        node.left = LeftBackNode;
        node.right = RightBackNode;

        return node;
    }


//   Remove Leaf Nodes

    public static Node RemoveLeavesNode(Node node) {

        if (node == null) {
            return null;
        }
        if (node.left == null && node.right == null) {
            return null;
        }

        node.left = RemoveLeavesNode(node.left);
        node.right = RemoveLeavesNode(node.right);


        return node;
    }


//  Imporatnt Questipn Now Mostly Asked in Interview


//     Diameter of Binary Tree
//    youtube:- https://youtu.be/S0Bwgtn32uI


//     In this question we consider three conditiion which are:-
//     1)Both deepest  nodes lies on left side tree
//     2)Both deepest  nodes lies on right side tree
//     3)One Deepest node lies on left and another lies on right
//      We find the heights of the  left node and righ node then compare it with left deepest and right deepest node


//    Method 1 :- Inefficient and it time complexity isi O(n2)
//


    public static int Diameter(Node node) {
        if (node == null) {
            return 0;
        }
        int leftDiameter = Diameter(node.left);
        int rightDiameter = Diameter(node.right);

        int leftandrightheight = Height1(node.left) + Height1(node.right) + 2;

        int dia = Math.max(leftandrightheight, Math.max(leftDiameter, rightDiameter));


        return dia;
    }

    public static int Height1(Node node) {
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


    public static Pairs Diameter2(Node node) {

        if (node == null) {
            Pairs p = new Pairs();
            p.height = -1;
            p.diameter = 0;
            return p;
        }

        Pairs leftnode = Diameter2(node.left);
        Pairs rightnode = Diameter2(node.right);

        Pairs p = new Pairs();
        p.height = leftnode.height + rightnode.height + 1;

        p.diameter = Math.max(p.height + 2, Math.max(leftnode.diameter, rightnode.diameter));

        return p;
    }


//   Tilt of Binary Tree
//   Insuch type of question we sent different thing in recursion and we change in  different value
//    In this question we return sum of the till node then we change thevalue in tilt variable

    static int tilt = 0;

    public static int Tilt(Node node) {

        if (node == null) {
            return 0;
        }

        int leftsum = Tilt(node.left);
        int rightsum = Tilt(node.right);

        tilt = Math.abs(leftsum - rightsum);

        int sum = leftsum + rightsum + node.data;
        return sum;
    }


//     Tree Is Binary Search Tree

//     In Binary Search Tree every left sides node is smaller than parent node and for every right sides nodes is greater than parent node
//     In enery node we will return min,max for every parent node.
//      We Compare node bst and tree bst
//      youtube:-https://youtu.be/kMrbTnd5W9U

    public static class BST {
        boolean IsBst;
        int max;
        int min;
    }


    public static BST IsTreeBst(Node node) {
        if (node == null) {
            BST tr = new BST();
            tr.IsBst = true;
            tr.min = Integer.MIN_VALUE;
            tr.max = Integer.MAX_VALUE;
            return tr;
        }


        BST leftnode = IsTreeBst(node.left);
        BST rightnode = IsTreeBst(node.right);

        BST tr = new BST();
        tr.IsBst = leftnode.IsBst && rightnode.IsBst && leftnode.min < node.data && rightnode.max > node.data;

        tr.min = Math.min(node.data, rightnode.min);
        tr.max = Math.max(node.data, leftnode.max);

        return tr;


    }













//  Balanced Tree :- A Balanced tree whose left tree height - right tree height should not exceed 1
//  youtube link:- https://youtu.be/lUDgp2D6sf8
//     Method 1
      static boolean f=true;
      public static int BalancedTree(Node node){
          if(node == null){
              return 0;
          }
          int leftheight=BalancedTree(node.left);
          int rightheight=BalancedTree(node.right);

          if(Math.abs(leftheight-rightheight)>1){
              f=false;
          }
          int height=Math.max(leftheight,rightheight)+1;
          return  height;
      }



//     Method 2
      public static  class BalTree{
      boolean ans;
      int height;
      }

      public static  BalTree  BalancedTree(Node node){
          if(node==null){
             BalTree br=new BalTree();
             br.ans=true;
             br.height=0;
             return br;
          }


          BalTree left=BalancedTree(node.left);
          BalTree right=BalancedTree(node.right);

          BalTree br=new BalTree();
          br.ans=left.ans && right.ans && Math.abs(left.height-right.height)>1;
          br.height=Math.max(left.height,right.height)+1;

          return br;
      }




































//       Largest BST
//       In this question we use similar question but only we add some  more properties to add in them.
//       youtube:-https://youtu.be/UGsJz8fSYp0




    public static class BST1 {
        boolean IsBst;
        int max;
        int min;
        Node root;
        int size;
    }


    public static BST1 LargestBstTree(Node node) {
        if (node == null) {
            BST1 tr = new BST1();
            tr.IsBst = true;
            tr.min = Integer.MIN_VALUE;
            tr.max = Integer.MAX_VALUE;
            tr.root=null;
            tr.size=0;
            return tr;
        }


        BST1 leftnode = LargestBstTree(node.left);
        BST1 rightnode = LargestBstTree(node.right);

        BST1 tr = new BST1();
        tr.IsBst = leftnode.IsBst && rightnode.IsBst && leftnode.min < node.data && rightnode.max > node.data;

        tr.min = Math.min(node.data, rightnode.min);
        tr.max = Math.max(node.data, leftnode.max);

        if(tr.IsBst){
            tr.root=node;
            tr.size=leftnode.size + rightnode.size +1;
        }else if(leftnode.size >rightnode.size){
            tr.root=leftnode.root;
            tr.size=leftnode.size;
        }else{
            tr.root=rightnode.root;
            tr.size=rightnode.size;
        }



        return tr;


    }































}

















