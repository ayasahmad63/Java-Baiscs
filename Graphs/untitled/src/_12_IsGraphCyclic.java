import java.io.*;
import java.util.*;

    public class _12_IsGraphCyclic {
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

            boolean[] visited=new boolean[vtces];

            for(int i=0;i<vtces;i++){
                if(visited[i]==false){
                    if(GraphCycle(graph,visited,i)){

                        System.out.println(true);
                        return;
                    }
                }
            }
            System.out.println(false);
        }



//        In this we check if any node is visited already then it will be cyclic graph after again traversing






        public static boolean GraphCycle(ArrayList<Edge>[] graph,boolean[] visited,int src){

            ArrayDeque<Integer> dq=new ArrayDeque<>();
            dq.add(src);


            while(dq.size()>0){
                int s=dq.remove();

                if(visited[s]==true){
                    return true;
                }
                visited[s]=true;
                for(Edge edge:graph[s]){
                    if(visited[edge.nbr]==false){
                        dq.add(edge.nbr);
                    }

                }

            }


            return false;

        }


    }















