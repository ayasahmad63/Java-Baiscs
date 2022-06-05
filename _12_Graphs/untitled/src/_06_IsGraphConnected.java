import java.util.ArrayList;

public class _06_IsGraphConnected {


    public static class Edge {
        int sour;
        int neigh;
        int weight;


        Edge(int sour,int neigh,int weight){

            this.sour=sour;
            this.neigh=neigh;
            this.weight=weight;

        }

    }



    public static void main(String[] args) {

        int verti=7;
        ArrayList<Edge>[] graph=new ArrayList[verti];
        for(int i=0;i<verti;i++){
            graph[i]=new ArrayList<>();
        }

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

        boolean[] visited=new boolean[verti];



        for(int i=0;i<verti;i++){
            if(visited[i]==false);{
              ArrayList<Integer> p=new ArrayList<>();
              GraphConnected(graph,i,p,visited);
              ans.add(p);
            }

        }


    }

//



    public static void  GraphConnected(ArrayList<Edge>[] graph,int src,ArrayList ans,boolean[] visited){

        visited[src]=true;
        ans.add(src);
        for(Edge edge:graph[src]){
            if(visited[edge.neigh]) {
                GraphConnected(graph, edge.neigh, ans, visited);
            }
        }


    }

}
