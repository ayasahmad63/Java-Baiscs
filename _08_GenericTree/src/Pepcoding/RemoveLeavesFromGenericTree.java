package Pepcoding;

public class RemoveLeavesFromGenericTree {

// Link :-

    public static  void RemoveLeaveFromGenericTree(AFullGenericTree.Node node){

        for(int i=node.children.size()-1;i>=0;i--){
            AFullGenericTree.Node child=node.children.get(i);
            if(child.children.size()==0){
                node.children.remove(child);
            }

        }

        for(AFullGenericTree.Node child:node.children)
        {
            RemoveLeaveFromGenericTree(child);
        }

    }




}
