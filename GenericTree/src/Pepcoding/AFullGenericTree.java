package Pepcoding;

// Link-https://youtu.be/eDdPZ05y4Os


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class AFullGenericTree {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node() {

        }

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Node head = null;

        Stack<Node> str = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == -1) {
                str.pop();
            } else {
                Node node = new Node();
                node.data = arr[i];

                if (str.size() > 0) {
                    str.peek().children.add(node);
                } else {
                    head = node;
                }

                str.push(node);
            }

        }

//        System.out.println(Maxim(head));
//        System.out.println(height(head));

//        Traversal(head);

//        LevelOrder(head);

//    LinewiseLevelOrder(head);


//    LinewiseZigZagLevelOrder(head);

//        LineWiseLevelOrder2(head);

//      LineWiseLevelOrder3(head);

//        RemoveLeaveFromGenericTree(head);
//display(head);


//        System.out.println(FindElementInGenericTree(head,30));
//
//


//        Node to Root path
//        ArrayList<Node> ans=new ArrayList<>();
//        ans=NodeToRootPath(head,70);
//
//        for(Node node:ans) {
//            System.out.println(node.data);
//        }


//Lowest Common Ancestor

//    ArrayList<Node> low = new ArrayList<>();
//    ArrayList<Node> high = new ArrayList<>();
//
//    low=NodeToRootPath(head,110);
//    high=NodeToRootPath(head,120);
//    int i= low.size()-1;int j=low.size()-1;
//    while( i>=0 && j>=0 && low.get(i).data==high.get(j).data){
//        i--;
//        j--;
//    }
//        System.out.println(low.get(++i).data);


// Distance Between Two Nodes


//       j)); ArrayList<Node> low = new ArrayList<>();
//        ArrayList<Node> high = new ArrayList<>();
//
//        low=NodeToRootPath(head,70);
//        high=NodeToRootPath(head,120);
//        int i= low.size()-1;int j=low.size()-1;
//        while( i>=0 && j>=0 && low.get(i).data==high.get(j).data){
//            i--;
//            j--;
//        }
//
//        System.out.println((i)+(


//        Tree Similar In Tree


//        System.out.println(TreeSimilarInShape(head,head));


//        MultiSolver

//        height=0;
//        size=0;
//        MAX=Integer.MAX_VALUE;
//        MIN=Integer.MIN_VALUE;
//
//        MultiSolvers(head,0);
//        System.out.println(height);
//        System.out.println(size);
//        System.out.println(MAX);
//        System.out.println(MIN);
//






//        Predessor and Succesor


//        PredecessorAndSuccessor(head,110);
//        System.out.println(Predecessor);
//        System.out.println(Successor);






//Ceil And Floor

//        Floor :- Largest Among Smallest
//        Ceil  :- Smallest Among Largest

//        CeilAndFLoor(head,55);
//        System.out.println(ceil);
//        System.out.println(floor);;




// In Kth largest Number we get floor of +infintirt then floor of that number till kth times
//  in this way we get the kth largest number
//        int k=3;
//        int KthLargest=Integer.MAX_VALUE;
//        ceil=Integer.MIN_VALUE;
//        for(int i=0;i<k;i++){
//            CeilAndFLoor(head,KthLargest);
//            KthLargest=ceil;
//            ceil=Integer.MIN_VALUE;
//
//        }





//        Maximum Subtree
//        int sa=Maixmum_Subtree(head);
//        System.out.println(weight);
//        System.out.println(Max_Node);





//        Diameter of the tree
//        int d=Diameter(head);
//        System.out.println(dia);
//
//






//        ilterative Pre and Post

        IlterativePrePost(head);


    }
//









    public static void display(Node node)
    {
        String str=node.data + " -> ";
        for(Node child:node.children){
            str+=child.data+",";
        }
        System.out.println(str);

        for(Node child:node.children){
            display(child);
        }

    }











//    Maxim Element in Generic Tree

    public static int Maxim(Node root) {
        int max = root.data;

        for (Node child : root.children) {
            int s = Maxim(child);
            if (max < s) {
                max = s;
            }
        }


        return max;
    }

//    Height of the Tree

    public static int height(Node root) {

        int size = 0;
        for (Node child : root.children) {
            int ch = height(child);
            size = Math.max(ch, size);
        }
        size++;
        return size;
    }




//    Traversal :-Pre,In,Post

    public static void Traversal(Node node) {

        for (Node child : node.children) {

            System.out.println("Pre" + child.data);
            Traversal(child);
            System.out.println("In" + child.data);
            Traversal(child);
            System.out.println("Post" + child.data);

        }
    }


//    Level order Traversal

    public static void LevelOrder(Node node) {

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);


        while (queue.size() > 0) {

            System.out.print(queue.peek().data+",");


            for (Node child : queue.peek().children) {
                queue.add(child);
            }
            queue.remove();
        }


    }



    //Line Wise Level Order

//    Method 1:- We Use Two Queue in this method
    public static void LinewiseLevelOrder(Node node){

        Queue<Node> MainQueue=new ArrayDeque<>();
        MainQueue.add(node);

        Queue<Node>  secQueue=new ArrayDeque<>();
        while (MainQueue.size()>0) {
            System.out.print(" " + MainQueue.peek().data);
            for (Node child : MainQueue.peek().children) {
                secQueue.add(child);
            }
            MainQueue.remove();

            if (MainQueue.size() == 0) {
                System.out.println("");
                MainQueue = secQueue;
                secQueue = new ArrayDeque<>();
            }

        }
    }

//   Method 2 :- In this We only Use 1 Queue and one Flag data to refer to change the line
//    We Use

    public static  void LineWiseLevelOrder2(Node node){
        Queue<Node> queue=new ArrayDeque<>();
        queue.add(node);
        queue.add( new Node(-1));

        while(queue.size()>0) {
            Node n=queue.remove();
            if (n.data!= -1) {

                System.out.print(" " +n.data);

                for (Node child:n.children){
                    queue.add(child);
                }

            }else{
                if(queue.size()>0){
                    System.out.println("");
                    queue.add(new Node(-1));
                }
            }

        }

    }

//Method 3 :- In This Method we used to ilterate through the size of the queue and add child

    public  static  void LineWiseLevelOrder3(Node node){
        Queue<Node> queue=new ArrayDeque<>();
        queue.add(node);

        while(queue.size()>0){
            int size=queue.size();

            for(int i=0;i<size;i++){
                Node n=queue.remove();
                System.out.print(" " +n.data);

                for(Node child:n.children){
                    queue.add(child);
                }

            }
            System.out.println("");

        }





    }








//Line Wise ZigZag Level Order Tree

    public static  void LinewiseZigZagLevelOrder(Node node){
        Stack<Node> Mainstack =new Stack<>();
        Stack<Node>  SecondNode=new Stack<>();
        Mainstack.push(node);
        int length=0;


        while (Mainstack.size()>0) {
            Node n=Mainstack.peek();

            if(length%2==0){
            for (int i=0;i<n.children.size();i++) {
               SecondNode.push(n.children.get(i));
            }}
            else{

                for (int i=n.children.size()-1;i>=0;i--) {
                    SecondNode.push(n.children.get(i));
                }
            }

            length++;
            System.out.print(" " +Mainstack.pop().data);

            if(Mainstack.size()==0){
                Mainstack=SecondNode;
                SecondNode=new Stack<>();
                System.out.println();
            }

        }

    }







//   Remove Leaves From Generic Tree

    public static  void RemoveLeaveFromGenericTree(Node node){

        for(int i=node.children.size()-1;i>=0;i--){
            Node child=node.children.get(i);
            if(child.children.size()==0){
                node.children.remove(child);
            }

        }

        for(Node child:node.children)
        {
            RemoveLeaveFromGenericTree(child);
        }

    }








//    Linearize A Generic tree

//    Not Properly unerstand Will be done lateron

    public static void LinearizeGenerictree(Node node){

        for(Node child:node.children){
            LinearizeGenerictree(child);
        }

        while (node.children.size()>1){
            Node last=node.children.remove(node.children.size()-1);
            Node seclast=node.children.get(node.children.size()-1);
            Node Tailseclast=Tail(seclast);

            Tailseclast.children.add(last);
        }

    }
    private static  Node Tail(Node node){

        while(node.children.size()==1){
            node=node.children.get(0);
        }

        return node;
    }










//    Finding Element in Generic tree


    public static boolean FindElementInGenericTree(Node node,int target){

        if(node.data==target){
            return true;

        }
        boolean ans=false;
        for(Node child:node.children){


                    if(FindElementInGenericTree(child,target)){
                     ans=true;
                     break;
                    }
        }



        return ans;
    }










//    Node to Root Path

    public static  ArrayList NodeToRootPath(Node node,int target){
        ArrayList<Node> ans=new ArrayList<>();

        if(node.data==target){
        ans.add(node);
        return ans;
      }
        for(Node child:node.children){
            ans=NodeToRootPath(child,target);
            if(ans.size()>0){
                ans.add(node);
                return ans;
            }
        }

        return ans;
    }

















// Lowest Common Ancestor

//    In Lowest Commonn Ancestor we find both Node to Root path for both low ans high value
//    We get both ArrayList of both low,high value and then get the common from it



    public static  ArrayList NodeToRootPath1(Node node,int target){
        ArrayList<Node> ans=new ArrayList<>();

        if(node.data==target){
            ans.add(node);
            return ans;
        }
        for(Node child:node.children){
            ans=NodeToRootPath(child,target);
            if(ans.size()>0){
                ans.add(node);
                return ans;
            }
        }

        return ans;
    }








//    Distance Between Nodes

//    In This we found both of Node to Root path for both numbers
//    Then both Arraylist we found and i+j


























//Are Trees Similar in Shape


    public static  boolean TreeSimilarInShape(Node n1,Node n2){
        if(n1.children.size()!=n2.children.size()){
            return false;
        }
        for(int i=0;i<n1.children.size();i++){
            if(!TreeSimilarInShape(n1.children.get(i),n2.children.get(i))){
                return false;
            }
        }


        return true;
    }





















//    Generic Tree is Symmetrical


    public static boolean SymmetricTree(Node n1,Node n2){

        if(n1.children.size()!=n2.children.size()){
            return false;
        }

        for(int i=0,j=n2.children.size()-1;i<n1.children.size();i++){

            if(!SymmetricTree(n1.children.get(i),n2.children.get(j-1))){
                return false;
            }
        }

        return true;
    }



















// MultiSolver

    static int size;
    static  int height;
    static int MAX;
    static int MIN;

    public static  void MultiSolvers(Node node ,int depth){

        size++;
        height=Math.max(depth,height);
        MIN=Math.max(MAX,node.data);
        MAX=Math.min(MIN,node.data);

        for(Node child:node.children){
            MultiSolvers(child,depth+1);
        }



    }












//Predecessor and Successor
    static int state=0;
    static int Predecessor;
    static int Successor;


    public static void PredecessorAndSuccessor(Node node ,int data){
        if(state==0){
            if(node.data==data){
                state=1;
            }else{
                Predecessor=node.data;
            }
        }else if(state==1){
            Successor=node.data;
            state=2;
        }


        for(Node child:node.children){
            PredecessorAndSuccessor(child,data);
        }
    }





//     Ceil and Floor

    static int floor=Integer.MAX_VALUE;    //Smalllest Among Largest
    static int ceil =Integer.MIN_VALUE;    //Greatest Among Smallest

    public  static  void CeilAndFLoor(Node node,int data){
      if(node.data>data){
          if(floor>node.data){
              floor=node.data;
          }
      }else if(node.data<data){
          if(ceil< node.data){
              ceil=node.data;
          }
      }



        for(Node child:node.children){
            CeilAndFLoor(child,data);
        }
    }










//   Maximum Subtree


    static  int weight=0;
    static  int Max_Node=0;

    public  static  int Maixmum_Subtree(Node node){
        int sum=0;


        for(Node child:node.children){
            int temp=Maixmum_Subtree(child);
            sum+=temp;
        }
        sum+=node.data;
        if(weight<sum){
            weight=sum;
            Max_Node=node.data;
        }



        return sum;
    }












//    Diameter Of the node In
//     link:-https://www.youtube.com/watch?v=GIA2cZgOdwg&list=PL-Jc9J83PIiEmjuIVDrwR9h5i9TT2CEU_&index=49
//     in Diameter we use to find largest distance from a child and Second Largest distance then diameter=ld+sld+2

    static int dia=0;
    public static int Diameter(Node node){
        int ld=-1;
        int sld=-1;


        for(Node child:node.children){
            int ch=Diameter(child);
            if(ch>ld){
                sld=ld;
                ld=ch;
            }else if(ch>sld){
                sld=ch;
            }
        }
        if(ld+sld+2>dia){
            dia=ld+sld+2;
        }

        ld++;
        return ld;
    }








//  Ilterative Pre and Post of Generic Tree


//    There are Implication of Stack pair with Three Conditions
//    Case 1:- if state=-1;then   state++,add pre
//    Case 2:-if state=node.children.size;then add post and stack.pop
//    Case 3;-else ;st.push(new Pair(pair.node.children.get(pair.data),-1));
//                state++;


    public  static  class Pair{
        Node node;
        int data;

        Pair(Node node,int data){
            this.node=node;
            this.data=data;
        }

    }


   public static  void IlterativePrePost(Node nodee){
        Stack<Pair> st=new Stack<>();
        st.push(new Pair(nodee,-1));

         String pre="";
         String post="";
        while(st.size()>0){
            Pair pair=st.peek();
            if(pair.data==-1){
                pair.data++;
                pre=pre+pair.node.data+",";
//                st.push(new Pair(pair.node.children.get(pair.data),-1));
            }else if(pair.data==pair.node.children.size()){
                post=post+pair.node.data+",";
                st.pop();
            }else{

//                post=post+ pair.node.data +",";
                st.push(new Pair(pair.node.children.get(pair.data),-1));
                pair.data++;
            }

        }
       System.out.println(pre);
       System.out.println(post);

   }












}

