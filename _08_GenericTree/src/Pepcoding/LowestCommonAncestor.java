package Pepcoding;

import org.w3c.dom.Node;

import java.util.ArrayList;

public class LowestCommonAncestor {
    // Lowest Common Ancestor

//    In Lowest Commonn Ancestor we find both Node to Root path for both low ans high value
//    We get both ArrayList of both low,high value and then get the common from it
//    link:-https://www.youtube.com/watch?v=eDdPZ05y4Os&list=PL-Jc9J83PIiEmjuIVDrwR9h5i9TT2CEU_&index=17




    public static void main(String[] args) {

        ArrayList<AFullGenericTree.Node> low = new ArrayList<>();
        ArrayList<AFullGenericTree.Node> high = new ArrayList<>();

//        low=NodeToRootPath(head,110);
//        high=NodeToRootPath(head,120);
        int i= low.size()-1;int j=low.size()-1;
        while( i>=0 && j>=0 && low.get(i).data==high.get(j).data){
            i--;
            j--;
        }
        System.out.println(low.get(++i).data);

    }



    public static  ArrayList NodeToRootPath1(AFullGenericTree.Node node, int target){
        ArrayList<AFullGenericTree.Node> ans=new ArrayList<>();

        if(node.data==target){
            ans.add(node);
            return ans;
        }
        for(AFullGenericTree.Node child:node.children){
//            ans=NodeToRootPath(child,target);
            if(ans.size()>0){
                ans.add(node);
                return ans;
            }
        }

        return ans;
    }

}
