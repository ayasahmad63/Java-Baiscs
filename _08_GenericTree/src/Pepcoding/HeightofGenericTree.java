package Pepcoding;

public class HeightofGenericTree {

    public static int height(AFullGenericTree.Node root){

        int size=0;
        for(AFullGenericTree.Node child:root.children){
            int ch=height(child);
            size=Math.max(ch,size);
        }
        size++;
        return size;
    }


}
