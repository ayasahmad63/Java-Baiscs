import java.lang.reflect.Constructor;

public class aBinarySearchTree {

    public static  class Node{
        int val;
        Node left;
        Node right;

        Node(){}

        Node(int val,Node left,Node right){
            this.val=val;
            this.left=left;
            this.right=right;
        }

    }

    public static Node Constructor(int[] arr,int low,int high){
        if(low>high)
        {
            return null;
        }
        int mid=(low+high)/2;
        Node left=Constructor(arr,low,mid-1);
        Node right=Constructor(arr,mid+1,high);

        Node node=new Node(arr[mid],left,right);
        return node;

    }



    public static void main(String[] args) {

        int[] arr={12,25,37,50,62,75,87};
        Node root= Constructor(arr,0,arr.length-1);


//       Display
        display(root);








    }




//    Display of the BinarySearchtree

    public static void display(Node node) {

        if (node == null) {
            return;
        }

        String ans = "";
        ans += node.left == null ? "." : node.left.val + " ";
        ans += "<-" + node.val + "->";
        ans += node.right == null ? "." : node.right.val + "";

        System.out.println(ans);

        display(node.left);
        display(node.right);


    }






//   Sum ,Size,Max , Min

//    Sum:- Similar as Binary tree refer to that
//    Size:- Similar as Binary tree refer to that

//    Max,Min :- These two things are different as we use some property of the  Bst

    public static int Max(Node node){
        if(node.right!=null){
            return Max(node.right);
        }else{
            return  node.val;
        }
    }

    public static int Min(Node node){
        if(node.left!=null){
            return Min(node.left);
        }else{
            return node.val;
        }
    }

    public static  boolean Find(Node node,int data){
      if(node==null){
          return false;
      }
       if(data>node.val){
           return Find(node.right,data);
       }else if(data<node.val)
        {
            return Find(node.left,data);
        }else{
           return true;
       }

    }





//    Add Notes in BST


    public static  Node AddNodes(Node node,int data){
          if(node==null){
              return  new Node(data,null,null);
          }
          if(node.val<data){
              node.right=AddNodes(node.right,data);
          }else if(node.val>data){
              node.left=AddNodes(node.left,data);
          }


        return node;
    }







//    How To Remove in BST
//    0 child=
//    1 child=
//    2 child=













}
