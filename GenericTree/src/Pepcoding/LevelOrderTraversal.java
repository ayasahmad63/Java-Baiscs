package Pepcoding;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTraversal {

//    In Level order traversal we use queue from first remove and add children of node to queue
//       link:-https://www.youtube.com/watch?v=TUxo5YpKvxw&list=PL-Jc9J83PIiEmjuIVDrwR9h5i9TT2CEU_&index=13


    public static void LevelOrder(AFullGenericTree.Node node) {

        Queue<AFullGenericTree.Node> queue = new ArrayDeque<>();
        queue.add(node);


        while (queue.size() > 0) {

            System.out.print(queue.peek().data + ",");


            for (AFullGenericTree.Node child : queue.peek().children) {
                queue.add(child);
            }
            queue.remove();
        }

    }
}