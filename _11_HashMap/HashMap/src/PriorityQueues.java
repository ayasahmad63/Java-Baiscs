
import  java.lang.*;
import java.util.*;

public class PriorityQueues {



//    In priority queue is same as queue(FIFO) but here priority is defined already.
//    Minimum value has default more priority but we can change priority by using constructor;
//    Time Complexity for Peek()->O(1) and for Addition/Substraction -> O(logn)

    public static void main(String[] args) throws Exception{


//        PriorityQueue<Integer>  pq=new PriorityQueue<>();

       PriorityQueue<Integer> pq=new PriorityQueue<>();
       int[] ranks={33,22,77,11,66,44,55};

       for(int rank:ranks){
           pq.add(rank);
       }
       while(pq.size()>0){
           System.out.print(" " +pq.remove());
       }



    }

}
