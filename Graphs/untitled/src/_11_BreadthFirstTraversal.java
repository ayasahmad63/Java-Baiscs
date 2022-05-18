
    import java.io.*;
import java.util.*;

    public class _11_BreadthFirstTraversal  {
        static class Edge {
            int src;
            int nbr;

            Edge(int src, int nbr) {
                this.src = src;
                this.nbr = nbr;
            }
        }



        static class Pair{
            int v;
            String str;

            Pair(int v,String str){
                this.v=v;
                this.str=str;
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
                graph[v1].add(new Edge(v1, v2));
                graph[v2].add(new Edge(v2, v1));
            }

            int src = Integer.parseInt(br.readLine());

            // write your code here

            ArrayDeque<Pair> pq=new ArrayDeque<>();
            pq.add(new Pair(src,src+""));

            boolean[] visited=new boolean[vtces];




            //  r m* w a*

            while(pq.size()>0)
            {
                Pair p=pq.removeFirst();

                if(visited[p.v]==true){
                    continue;
                }
                visited[p.v]=true;

                System.out.println(p.v + "@" + p.str);


                for(Edge edge:graph[p.v]){
                    if(visited[edge.nbr]==false){
                        pq.add(new Pair(edge.nbr,p.str+edge.nbr));
                    }
                }


            }



        }
    }





