package com.company.DoublyList;


public class Main {
    public static void main(String[] args) {

        DL doublelink=new DL();


        doublelink.insertfromfront(1);
        doublelink.insertfromfront(2);
        doublelink.insertfromfront(3);
        doublelink.insertfromfront(4);
        doublelink.insertfromfront(6);
        doublelink.insertfromfront(5);
        doublelink.insertfromend(7);
        doublelink.display();

        doublelink.insert(11,4);

        doublelink.display();




     }
}
