import java.util.ArrayList;
import java.util.PriorityQueue;

public class _4_GraphProblemWithDFS {


    public static void main(String[] args) {

    }

    static class  Pair{
        int wei;
        String psf;

//        class Pair(int wei,String psf){
//            wei=this.wei;
//            psf=this.psf;
//        }

    }

   static  String lpath;
   static  int lpathval=Integer.MIN_VALUE;
   static  String spath;
   static int spathval=Integer.MAX_VALUE;
   static String smallerthanthat;
   static int smallerthanthatval=Integer.MAX_VALUE;
   static String largerthanthat;
   static  int largerthanthatval=Integer.MIN_VALUE;

  static  PriorityQueue<Pair> pq=new PriorityQueue<>();

   static  int vert=7;
   static boolean vertices[]=new boolean[vert];

   public  static void  DFSSolution(ArrayList<_1_RepresentationOfGraph.Edge>[] graph,int src,int desti,String ans,int weigh,int val,int k){
       if(src==desti){

//           Lergest Path Solution
           if(lpathval<weigh){
               lpath=ans;
               lpathval=weigh;
           }

//           Smallest Path Solution
           if(spathval>weigh){
               spath=ans;
               spathval=weigh;
           }

//           smallerthanthat
           if(smallerthanthatval<val && smallerthanthatval<weigh){
               smallerthanthat=ans;
               smallerthanthatval=weigh;
           }

//           Larger than that
           if(largerthanthatval>val && largerthanthatval>weigh){
               largerthanthat=ans;
               largerthanthatval=weigh;
           }

           if(pq.size()<k){
//               pq.add(new Pair(weigh,ans))
           }else{
               if(weigh>pq.peek().wei){
                   pq.remove();
//                   pq.add(new Pair(weigh,ans));

               }
           }

        return;
       }
       vertices[src]=true;
       for(_1_RepresentationOfGraph.Edge edge:graph[src] ){
           DFSSolution(graph,edge.neigh,desti,ans+src,weigh+src,val,k);
       }

       vertices[src]=false;

    }





}
