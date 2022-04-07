package Pepcoding;

import java.util.Stack;

public class IlterativePrePost {




//  Ilterative Pre and Post of Generic Tree


//    There are Implication of Stack pair with Three Conditions
//    Case 1:- if state=-1;then   state++,add pre
//    Case 2:-if state=node.children.size;then add post and stack.pop
//    Case 3;-else ;st.push(new Pair(pair.node.children.get(pair.data),-1));
//                state++;


    public  static  class Pair{
        AFullGenericTree.Node node;
        int data;

        Pair(AFullGenericTree.Node node, int data){
            this.node=node;
            this.data=data;
        }

    }


    public static  void IlterativePrePost(AFullGenericTree.Node nodee){
        Stack<AFullGenericTree.Pair> st=new Stack<>();
        st.push(new AFullGenericTree.Pair(nodee,-1));

        String pre="";
        String post="";
        while(st.size()>0){
            AFullGenericTree.Pair pair=st.peek();
            if(pair.data==-1){
                pair.data++;
                pre=pre+pair.node.data+",";
//                st.push(new Pair(pair.node.children.get(pair.data),-1));
            }else if(pair.data==pair.node.children.size()){
                post=post+pair.node.data+",";
                st.pop();
            }else{

//                post=post+ pair.node.data +",";
                st.push(new AFullGenericTree.Pair(pair.node.children.get(pair.data),-1));
                pair.data++;
            }

        }
        System.out.println(pre);
        System.out.println(post);

    }



//    https://www.youtube.com/watch?v=t4IKNhNBTdo&list=PL-Jc9J83PIiEmjuIVDrwR9h5i9TT2CEU_&index=52
// yet to study,Imp for interviw place of view



}
