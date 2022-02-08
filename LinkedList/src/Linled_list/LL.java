package Linled_list;

public class LL {

    private  Node head;
    private  Node tail;
    private int size;

    public  LL(){
        this.size=0;
    }




    private  class Node{
        private int value;
        private  Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }







//    Insert At the start function

    public void insertval(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

         if(tail==null){
             tail=head;
         }

        size+=1;
    }



//    Insert in the last Index
    public void lastinsert(int val){

        if(tail==null){
            insertval(val);
             return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

//    Insert at position at any position

    public void insert(int val,int index){
        if(index==0){
            insertval(val);
            return;
        }
        if(index==size){
            lastinsert(val);
            return;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }

        Node node=new Node(val,temp.next);
        temp.next=node;


    }


//    Delete from first of linked list

    public void deletestart(){
        System.out.println(head.value);
        head=head.next;
        if(head==null){
            tail=null;
        }

    }

//     delete from  the end of  node
    public void deleteend(){
        Node node=head;
        if(size<=1){
            deletestart();
            return;
        }

        for(int i=0;i<size-2;i++){
            node=node.next;
        }
        System.out.println((node.next).value);
        node.next=null;


    }


//      Delete from any point of node

    public void delete(int index){
        if(index==1){
            deletestart();
            return ;
        }
        else if(index==size-1){
            deleteend();
            return;
        }
        Node node=head;
        for(int i=0;i<index-1;i++) {
            node=node.next;
        }
        System.out.println(node.next.value);
        node.next=node.next.next;


    }



//Display function


    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }


}

