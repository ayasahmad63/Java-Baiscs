package Pepcoding;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class ConstructorGenericTree {
    public  static class Node{
        int data;
        ArrayList<Node> children=new ArrayList<>();
    }
    public static void main(String[] args) {

        int[] arr={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
         Node root=null;
        Stack<Node> str=new Stack<>();

        for(int i=0;i<arr.length;i++){
           if(arr[i] == -1 ){
               str.pop();
           }
            else{
                Node node= new Node();
                node.data=arr[i];

                if(str.size()>0){
                    str.peek().children.add(node);
                }else{
                    root=node;
                }
             str.push(node);
            }



        }

//        display(root);

        System.out.println(size(root));
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



//    Size of Generic Tree
    public static int size(Node node){
        int count=0;

        for(Node chile:node.children){
            count ++;
        }

        for(Node n:node.children){
            count+=size(n);
        }
        return count;
    }






    public static void LevelOrderTraversal(Node node){

        Queue<Integer> que=new ArrayDeque<>();

        for(Node child:node.children){
           que.add(child.data);
        }



    }





}
