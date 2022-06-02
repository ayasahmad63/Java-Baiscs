package Pepcoding;

import java.util.Stack;

public class ZIgZagLevelOrder {
//    In this we use two Stack for zigzag print of the tree
//    link:-https://www.youtube.com/watch?v=eDdPZ05y4Os&list=PL-Jc9J83PIiEmjuIVDrwR9h5i9TT2CEU_&index=17

//    AFullGeneriTree.Node=Node  (for future References)

    public static  void LinewiseZigZagLevelOrder(AFullGenericTree.Node node){
        Stack<AFullGenericTree.Node> Mainstack =new Stack<>();
        Stack<AFullGenericTree.Node>  SecondNode=new Stack<>();
        Mainstack.push(node);
        int length=0;


        while (Mainstack.size()>0) {
            AFullGenericTree.Node n=Mainstack.peek();

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





}
