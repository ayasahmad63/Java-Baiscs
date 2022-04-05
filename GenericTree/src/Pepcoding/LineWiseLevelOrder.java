package Pepcoding;

import java.util.ArrayDeque;
import java.util.Queue;

public class LineWiseLevelOrder {
// In Linewise Level we use Two Queue as  we put in first node and children in Second Queue
//    When first Queue is Empty Then we change the Line and MainQueue=secQueue
//    Link:- https://www.youtube.com/watch?v=amG7xun8k4w&list=PL-Jc9J83PIiEmjuIVDrwR9h5i9TT2CEU_&index=15

    public static void LinewiseLevelOrder(AFullGenericTree.Node node){

        Queue<AFullGenericTree.Node> MainQueue=new ArrayDeque<>();
        MainQueue.add(node);

        Queue<AFullGenericTree.Node>  secQueue=new ArrayDeque<>();
        while (MainQueue.size()>0) {
            System.out.print(" " + MainQueue.peek().data);
            for (AFullGenericTree.Node child : MainQueue.peek().children) {
                secQueue.add(child);
            }
            MainQueue.remove();

            if (MainQueue.size() == 0) {
                System.out.println("");
                MainQueue = secQueue;
                secQueue = new ArrayDeque<>();
            }

        }
    }



}
