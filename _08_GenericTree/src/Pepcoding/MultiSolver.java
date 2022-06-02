package Pepcoding;

public class MultiSolver {

    // MultiSolver
// In MultiSolver we Heap data variable and  every ilteration we change the heap varaible value type



    static int size;
    static  int height;
    static int MAX;
    static int MIN;

    public static  void MultiSolvers(AFullGenericTree.Node node , int depth){

        size++;
        height=Math.max(depth,height);
        MIN=Math.max(MAX,node.data);
        MAX=Math.min(MIN,node.data);

        for(AFullGenericTree.Node child:node.children){
            MultiSolvers(child,depth+1);
        }



    }



}
