package com.company;

public class QueueMain {

    public static void main(String[] args) throws Exception {

        CustomQueue queue=new CustomQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);

        queue.display();
        System.out.println( queue.pop());
        System.out.println( queue.pop());
        System.out.println( queue.pop());
        System.out.println( queue.pop());
        System.out.println( queue.pop());
        System.out.println( queue.pop());

    }
}
