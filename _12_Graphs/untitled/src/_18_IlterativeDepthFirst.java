import java.io.*;
import java.util.*;

    public class _18_IlterativeDepthFirst {
        static class Edge {
            int src;
            int nbr;

            Edge(int src, int nbr) {
                this.src = src;
                this.nbr = nbr;
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

            boolean[] visited =new boolean[vtces];
            Stack<Pair> stk=new Stack<>();
            stk.push(new Pair(src,""+src));
            while(stk.size()>0){
                Pair pa=stk.pop();
                if(visited[pa.val]==true){
                    continue;
                }
                visited[pa.val]=true;
                System.out.println(pa.val+"@"+pa.str);

                for(Edge edge:graph[pa.val]){
                    if(visited[edge.nbr]==false){
                        stk.push(new Pair(edge.nbr,pa.str+edge.nbr));
                    }
                }
            }




        }
        public static class Pair{
            int val;
            String str;

            Pair(int val,String str){
                this.val=val;
                this.str=str;
            }
        }
    }












