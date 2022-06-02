package Pepcoding;

public class SizeOfgenericTree {

//    Size =Total Number of Nodes
//    Take MaximumInGenericTree.Node=Node  (for future References)

    public static int size(ConstructorGenericTree.Node node){
        int count=0;

        for(ConstructorGenericTree.Node chile:node.children){
            count ++;
        }

        for(ConstructorGenericTree.Node n:node.children){
            count+=size(n);
        }
        return count;
    }


}
