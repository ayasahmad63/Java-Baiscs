package Pepcoding;

import java.util.ArrayList;
import java.util.Stack;

public class GenericTree {

    public static class Node{
        int data ;
        ArrayList<Node> children=new ArrayList<>();
    }



    public static void main(String[] args) {

        int[] arr={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
         Node head=null;

        Stack<Node> str=new Stack<>();

        for( int i=0;i<arr.length;i++){

            if(arr[i]==-1){
                str.pop();
            }
            else{
                Node node=new Node();
                node.data=arr[i];

                if(str.size()>0){
                    str.peek().children.add(node);
                }
                else{
                    head=node;
                }

                str.push(node);
            }

        }



//display(head);
        System.out.println(Maxim(head));

    }

    public static void display(Node node)
    {
        System.out.print(node.data);
        System.out.print(" -> ");
       for(Node chile:node.children){
           System.out.print(chile.data+ ",");
       }
        System.out.println("");

       for(Node child:node.children){
           display(child);
       }


    }




    public static int Maxim(Node root){
        int max=root.data;

        for(Node child:root.children){
            int s=Maxim(child);
            if(max<s){
                max=s;
            }
        }


        return max;
    }

}
