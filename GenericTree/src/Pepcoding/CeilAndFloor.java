package Pepcoding;

public class CeilAndFloor {

    static int floor=Integer.MAX_VALUE;    //Smalllest Among Largest
    static int ceil =Integer.MIN_VALUE;    //Greatest Among Smallest

    public  static  void CeilAndFLoor(AFullGenericTree.Node node, int data){
        if(node.data>data){
            if(floor>node.data){
                floor=node.data;
            }
        }else if(node.data<data){
            if(ceil< node.data){
                ceil=node.data;
            }
        }



        for(AFullGenericTree.Node child:node.children){
            CeilAndFLoor(child,data);
        }
    }



}
