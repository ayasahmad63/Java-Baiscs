package Pepcoding;

import java.util.ArrayDeque;
import java.util.Queue;

public class LineWiseLevelOrder3 {


//Method 3 :- In This Method we used to ilterate through the size of the queue and add child
//    link:-https://www.youtube.com/watch?v=NuASXwfaFaY&list=PL-Jc9J83PIiEmjuIVDrwR9h5i9TT2CEU_&index=18
//    AFullGeneriTree.Node=Node  (for future References)


    public static void LineWiseLevelOrder3(AFullGenericTree.Node node) {
        Queue<AFullGenericTree.Node> queue = new ArrayDeque<>();
        queue.add(node);

        while (queue.size() > 0) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                AFullGenericTree.Node n = queue.remove();
                System.out.print(" " + n.data);

                for (AFullGenericTree.Node child : n.children) {
                    queue.add(child);
                }

            }
            System.out.println("");

        }


    }
}
