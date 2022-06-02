
import java.io.*;
import java.util.*;

public class _14_SpreadOfInfection {
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

        int src = Integer.parseInt(br.readLine());
        // write your code


        boolean[] visited=new boolean[vtces];

        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(0,0+"",0));

        while(pq.size()>0){

            Pair pai=pq.remove();

            if(visited[pai.val]==true){
                continue;
            }
            visited[pai.val]=true;

            //   System.out.println(pai.val);

            System.out.println(pai.val+ " via " + pai.str + " @ " + pai.weigh);

            for(Edge edge:graph[pai.val]){
                if(visited[edge.nbr]==false){
                    pq.add(new Pair(edge.nbr,pai.str+edge.nbr,pai.weigh+edge.wt));
                }
            }


        }



    }

    public static class Pair implements Comparable<Pair>{
        int val;
        String str;
        int weigh;


        Pair(int val,String str,int weigh){
            this.val=val;
            this.str=str;
            this.weigh=weigh;
        }
        public int compareTo(Pair o){
            return this.weigh-o.weigh;
        }
    }

}





