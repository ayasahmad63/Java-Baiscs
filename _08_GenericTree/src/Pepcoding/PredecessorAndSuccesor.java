package Pepcoding;

public class PredecessorAndSuccesor {



    //Predecessor and Successor
    static int state=0;
    static int Predecessor;
    static int Successor;


    public static void PredecessorAndSuccessor(AFullGenericTree.Node node , int data){
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


        for(AFullGenericTree.Node child:node.children){
            PredecessorAndSuccessor(child,data);
        }
    }



}
