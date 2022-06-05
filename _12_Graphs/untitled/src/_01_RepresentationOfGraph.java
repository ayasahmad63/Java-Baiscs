import java.util.ArrayList;

public class _01_RepresentationOfGraph {

//    https://youtu.be/t0r04fYdT7U
//    There are two ways to Represent Graph
//    1)Adjacency Matrix:- In this format we make two dimensional matrix and represent the value init.
//    2)Array of Linked List:-We Make Array of LinkedList of type Edge in which we take three sour,neigh,weight;






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

            graph[0].add(new Edge(0,1,10));
            graph[0].add(new Edge(0,3,40));

            graph[1].add(new Edge(1,0,10));
            graph[1].add(new Edge(1,2,10));

            graph[2].add(new Edge(2,1,10));
            graph[2].add(new Edge(2,3,10));

            graph[3].add(new Edge(3,0,40));
            graph[3].add(new Edge(3,2,10));
            graph[3].add(new Edge(3,4,2));

            graph[4].add(new Edge(4,3,2));
            graph[4].add(new Edge(4,5,3));
            graph[4].add(new Edge(4,6,3));

            graph[5].add(new Edge(5,4,3));
            graph[5].add(new Edge(5,6,3));

            graph[6].add(new Edge(6,5,3));
            graph[6].add(new Edge(6,4,3));










    }

}
