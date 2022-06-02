import java.io.*;
import java.util.*;

    public class  _16_PrismsAlgorithm{
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

            PriorityQueue<Pair> pq=new PriorityQueue<>();
            pq.add(new Pair(0,"",-1));

            while(pq.size()>0){

                Pair pa=pq.remove();

                if(visited[pa.val]==true){
                    continue;
                }
                visited[pa.val]=true;

                if(pa.weight!=-1){
                    System.out.println("["+pa.str+ "@" +pa.weight+"]");
                }
                for(Edge edge:graph[pa.val]){
                    if(visited[edge.nbr]==false){
                        pq.add(new Pair(edge.nbr,edge.nbr+"-"+pa.val,edge.wt));
                    }
                }


            }




        }

        public static class Pair implements Comparable<Pair>{
            int val;
            String str;
            int weight;


            Pair(int val,String str,int weight){
                this.val=val;
                this.str=str;
                this.weight=weight;
            }



            public int compareTo(Pair o){
                return this.weight-o.weight;
            }


        }
    }

































