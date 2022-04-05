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

        Node(){

        }

        Node(int data){
            this.data=data;
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

        RemoveLeaveFromGenericTree(head);
display(head);


     }



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








    











}

