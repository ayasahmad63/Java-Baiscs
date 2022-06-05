import java.util.ArrayList;

public class _02_HasPath {

    public static void main(String[] args) {



    }



    static  int verti=6;
    static boolean[] visti=new boolean[verti];
    public static boolean hasPath(ArrayList<_01_RepresentationOfGraph.Edge>[] graph, int src, int dest){
        if(src==dest){
            return true;
        }
           visti[src]=false;
        for(_01_RepresentationOfGraph.Edge edge: graph[src]){
            if(!visti[edge.neigh]){
                if(hasPath(graph,edge.neigh,dest)){
                    return true;
                }
            }
        }


        return  false;
    }




}
