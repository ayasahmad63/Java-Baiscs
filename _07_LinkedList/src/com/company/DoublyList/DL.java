package com.company.DoublyList;

public class DL {
   Node head;


//   Node Onject is Created
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }



//    Insertion from front start
      public void insertfromfront(int val){
        Node node =new Node(val);
          if(head==null){
            head=node;
           return;
          }
        node.next=head;
        head.prev=node;
        head=node;


      }




//      Insertion from end

     public void insertfromend(int val){
       Node node=new Node(val);
        if(head==null){
            head=node;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        node.prev=temp;
        temp.next=node;
     }


//     Insert from any position
    public void insert(int val,int index){
        Node node=new Node(val);
        if(head==null){
            head=node;
            return;
        }

        Node temp=head;
        for(int i=1;i<index-1;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next.prev=node;
        node.prev=temp;
        temp.next=node;

    }




//    Display
     public void display(){
        Node temp=head;
    while(temp != null){
        System.out.print(" " +temp.val+ "->");
        temp=temp.next;
    }
    }



}
