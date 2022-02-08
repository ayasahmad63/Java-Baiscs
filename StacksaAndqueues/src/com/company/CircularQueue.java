package com.company;

public class CircularQueue {

    protected int[] data;

    private static  final int DEFAULT_SIZE=10;


    protected int end=0;
    protected int front =0;
    private int size=0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data=new int[size];
    }

    public boolean isFull(){
        return size== data.length;
    }

    public boolean isEmpty(){
        return  size ==  0;
    }

    public boolean push(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        end=end % data.length;
        size++;
        return true;

    }

    public int pop(int item) throws Exception{
        if(isEmpty()){
            throw new Exception("No Item can remove from Empty queue");
        }
        int remove =data[front++];
        front=front%data.length;
        size--;

        return remove;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("EMPTY");
            return;
        }
        int i=front;
        do{
            System.out.print(data[i]+  "->");
            i++;
            i %=data.length;

        }while(i !=end);
        System.out.println("END");

    }

}
