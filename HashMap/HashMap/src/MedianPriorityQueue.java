import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.PriorityQueue;

public class MedianPriorityQueue {

    static  PriorityQueue<Integer> left;
    static  PriorityQueue<Integer>  right;


    public static void main(String[] args) {
        left=new PriorityQueue<>();
        right=new PriorityQueue<>(Collections.reverseOrder());






    }
    public  static  void add(int data){
        if(right.size()>0 && data>right.peek()){
            right.add(data);
        }else{
            left.add(data);

        }
        if(right.size()- left.size()==2){
            left.add(right.remove());
        }else if(left.size()- right.size()==2){
            right.add(left.remove());
        }

    }
    public static int remove(){
        if(left.size()> right.size()){
            return left.remove();
        }else{
            return right.remove();
        }
    }

    public static int peek(){
        if(left.size()> right.size()){
            return left.peek();
        }else{
            return right.peek();
        }
    }

    public static int size(){
        return  left.size()+right.size();

    }

}
