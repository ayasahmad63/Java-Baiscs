package Pepcoding;

import java.util.ArrayList;

public class NodeToRootPath {

    public static ArrayList NodeToRootPath(AFullGenericTree.Node node, int target){
        ArrayList<AFullGenericTree.Node> ans=new ArrayList<>();

        if(node.data==target){
            ans.add(node);
            return ans;
        }
        for(AFullGenericTree.Node child:node.children){
            ans=NodeToRootPath(child,target);
            if(ans.size()>0){
                ans.add(node);
                return ans;
            }
        }

        return ans;
    }




}
