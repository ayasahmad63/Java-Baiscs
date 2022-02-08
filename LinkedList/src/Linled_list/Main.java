package Linled_list;

public class Main {
    public static void main(String[] args) {
        LL link=new LL();
        link.insertval(2);
        link.insertval(3);
        link.insertval(4);
        link.insertval(5);
        link.insertval(6);
        link.insertval(7);
        link.lastinsert(1);
        link.insert(6,5);
        link.display();
//        link.deletestart();
//
//        link.display();
//link.deleteend();
//        link.display();
        link.delete(3);
        link.display();

    }
}
