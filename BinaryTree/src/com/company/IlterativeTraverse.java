package com.company;

import java.util.Stack;

public class IlterativeTraverse {


//    Ilterative Traversal :- pre,in,post
// In  this method we use Stack of Pair  then we check the state of pair and perform according to it
//    if(state==1)  -> then we take to left and increase the state and add tp pre
//    if(state==2)  -> then we take to right and increase the state and add tp in
//    if(state==3)  -> then we take to pop out and increase the state and add tp post




    private static class IlteraTraver{
        aFullBinaryTree.Node node;
        int state;

        IlteraTraver(aFullBinaryTree.Node node, int state){
            this.node=node;
            this.state=state;
        }
    }


//    public static  void IlterativeTraversal(aFullBinaryTree.Node node){
//        Stack<aFullBinaryTree.IlteraTraver> st=new Stack<>();
//        aFullBinaryTree.IlteraTraver ilte=new aFullBinaryTree.IlteraTraver(node,1);
//        st.push(ilte);
//
//        String pre="";
//        String in="";
//        String post="";
//
//
//        while(st.size()>0){
//            aFullBinaryTree.IlteraTraver top=st.peek();
//
//            if(top.state==1){
//                pre=pre+top.node.data+" ";
//                top.state++;
//                if(top.node.left!=null){
//                    aFullBinaryTree.IlteraTraver l=new aFullBinaryTree.IlteraTraver(top.node.left,1);
//                    st.push(l);
//                }
//
//            }else if(top.state==2){
//
//                in=in+top.node.data+" ";
//                top.state++;
//                if(top.node.right!=null){
//                    aFullBinaryTree.IlteraTraver r=new aFullBinaryTree.IlteraTraver(top.node.right,1);
//                    st.push(r);
//                }
//
//            }else{
//                post=post+top.node.data+" ";
//                top.state++;
//                st.pop();
//
//            }
//
//
//
//        }


//
//
//        System.out.println("PRE :- "+pre);
//        System.out.println("IN :- "+in);
//        System.out.println("Post :- "+post);
//
//
//
//    }







}
