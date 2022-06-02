package Pepcoding;

import java.util.ArrayDeque;
import java.util.Queue;

public class LineWiseLevelOrder2 {

//    Method 2 :- In this We only Use 1 Queue and one Flag data to refer to change the line
//    link:-https://www.youtube.com/watch?v=NuASXwfaFaY&list=PL-Jc9J83PIiEmjuIVDrwR9h5i9TT2CEU_&index=18
//    AFullGeneriTree.Node=Node  (for future References)

    public static  void LineWiseLevelOrder2(AFullGenericTree.Node node){
        Queue<AFullGenericTree.Node> queue=new ArrayDeque<>();
        queue.add(node);
        queue.add( new AFullGenericTree.Node(-1));

        while(queue.size()>0) {
            AFullGenericTree.Node n=queue.remove();
            if (n.data!= -1) {

                System.out.print(" " +n.data);

                for (AFullGenericTree.Node child:n.children){
                    queue.add(child);
                }

            }else{
                if(queue.size()>0){
                    System.out.println("");
                    queue.add(new AFullGenericTree.Node(-1));
                }
            }

        }

    }


}
