package com.company;

public class CustomQueue {

    private int[] data;

    private static final int DFAULT_SIZE=10;

    int end=0;

    public CustomQueue(){
        this(DFAULT_SIZE);
    }

    public void push(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is Full, Cann't push new item");

        }

        data[end++]=item;
//        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw  new Exception("Cannot POP Element from Empty Queue");
        }
        int remove=data[0];

        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return  remove;

    }

    public int front() throws  Exception{
        if(isEmpty()){
            throw new Exception("Cannot Show new item in the front of Empty Queue");
        }
        return data[0];
    }

    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i]+ " ");
        }
        System.out.println("END");
    }

    public CustomQueue(int size){
        this.data=new int[size];
    }

    public boolean isFull(){
        return end==data.length-1; // ptr is at last index;
    }

    public boolean isEmpty(){
        return end==-1;
    }

}
