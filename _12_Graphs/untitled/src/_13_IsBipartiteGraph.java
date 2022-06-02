
//    Method 1 :- Level Approach
//    Bipartite Graph:- a graph in which its node is divided into two sets such in everynode there is vertices to the another set
//                             and there  are no vertices between same set's node

//    Coditions for Bipartite:
//       1) If a graph is acyclic :- Bipartite Graph
//       2) If a graph is cyclic and even:- Bipartite Graph
//       3) If a graph is cyclic and odd:- Non-Bipartite Graph



//    In this solution we two node have different level then it will be non bipartite



    import java.io.*;
import java.util.*;

    public class _13_IsBipartiteGraph  {
        static class Edge {
            int src;
            int nbr;
            int wt;

            Edge(int src, int nbr, int wt) {
                this.src = src;
                this.nbr = nbr;
                this.wt = wt;
            }
        }

        public static class Pair{
            int val;
            int level;

            Pair(int val,int level){
                this.val=val;
                this.level=level;
            }
        }

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int vtces = Integer.parseInt(br.readLine());
            ArrayList<Edge>[] graph = new ArrayList[vtces];
            for (int i = 0; i < vtces; i++) {
                graph[i] = new ArrayList<>();
            }

            int edges = Integer.parseInt(br.readLine());
            for (int i = 0; i < edges; i++) {
                String[] parts = br.readLine().split(" ");
                int v1 = Integer.parseInt(parts[0]);
                int v2 = Integer.parseInt(parts[1]);
                int wt = Integer.parseInt(parts[2]);
                graph[v1].add(new Edge(v1, v2, wt));
                graph[v2].add(new Edge(v2, v1, wt));
            }

            // write your code here

            int[] visited=new int[vtces];
            for(int i=0;i<vtces;i++){
                if(visited[i]==0){
                    if(!(Bipartite(graph,i,visited))){
                        System.out.println(false);
                        return;
                    }
                }
            }


            System.out.println(true);


        }

        public static boolean Bipartite(ArrayList<Edge>[] graph,int src,int[] visited){

            ArrayDeque<Pair> dq=new ArrayDeque<>();
            dq.add(new Pair(src,1));

            while(dq.size()>0){

                Pair pa=dq.remove();

                if(visited[pa.val] !=0){
                    if(pa.level !=visited[pa.val]){
                        return false;
                    }
                }
                else{
                    visited[pa.val]=pa.level;
                }


                for(Edge edge:graph[pa.val]){
                    if(visited[edge.nbr]==0){
                        dq.add(new Pair(edge.nbr,pa.level+1));
                    }
                }


            }


            return true;
        }











//        Method 2:- Coloring:- Two adjacent nodes have always different colors for bipartite grap


        class Solution {
            public boolean isBipartite(int[][] graph) {

                int[] color=new int[graph.length];
                for(int i=0;i<graph.length;i++){
                    if(color[i]==0){
                        if(!(Bipartite(graph,i,color))){
                            return false;
                        }
                    }
                }

                return true;
            }
            public boolean Bipartite(int[][] graph,int src,int[] color){
                ArrayDeque<Integer> dq=new ArrayDeque<>();
                dq.add(src);

                color[src]=1;
                while(dq.size()>0){

                    int pa=dq.remove();



                    for(int k:graph[pa]){
                        if(color[k]==0){
                            color[k]=3-color[pa];
                            dq.add(k);
                        }else{
                            if(color[k]==color[pa]){
                                return false;
                            }
                        }
                    }

                }
                return true;
            }

        }




    }









