import java.util.ArrayList;

public class _3_FindAllPathInGraph {
    public static void main(String[] args) {



    }
    static int verti=7;

    static  boolean visited[]=new boolean[verti];

    public static void FindAllPath(ArrayList<_01_RepresentationOfGraph.Edge>[] graph, int sour, int desti, String str){
        if(sour==desti){
            System.out.println(str);
            return;
        }

        visited[sour]=true;
        for(_01_RepresentationOfGraph.Edge edde:graph[sour]) {
//            if (!visited[edge.neigh]) {
//                FindAllPath(graph, edde.neigh, desti, str + sour);
//            }
        }

        visited[sour]=false;


    }
}
