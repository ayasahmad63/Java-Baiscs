package Pepcoding;

public class FindingElementInGenericTree {
//    link:-https://www.youtube.com/watch?v=eDdPZ05y4Os&list=PL-Jc9J83PIiEmjuIVDrwR9h5i9TT2CEU_&index=17

//    AFullGeneriTree.Node=Node  (for future References)


    public static boolean FindElementInGenericTree(AFullGenericTree.Node node, int target){

        if(node.data==target){
            return true;

        }
        boolean ans=false;
        for(AFullGenericTree.Node child:node.children){


            if(FindElementInGenericTree(child,target)){
                ans=true;
                break;
            }
        }



        return ans;
    }




}
