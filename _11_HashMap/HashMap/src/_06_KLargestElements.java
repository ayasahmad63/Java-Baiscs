import java.util.PriorityQueue;

public class _06_KLargestElements {

    public static void main(String[] args) {

        int[] arr={5,2,11,98,43,23,76,33,66,12,90,95};

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(arr[0]);
        pq.add(arr[1]);
        pq.add(arr[2]);

        for(int i=3;i<arr.length;i++){
            if(arr[i]>pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }

        }


        for(int i=0;i<3;i++){
            System.out.print(" " +pq.remove());
        }

    }



}
