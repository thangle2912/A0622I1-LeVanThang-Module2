package src.ss9_list.bai_tap.linked_list;

import javax.xml.soap.Node;
import java.util.LinkedList;

public class MyLinkedListTest<E> {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(0);
        myLinkedList.add(1,"Một");
        myLinkedList.add(2,"Hai");
        myLinkedList.add(3,"Ba");
        myLinkedList.printList();
//        myLinkedList.addLast("Bốn");
//        myLinkedList.add(3,9);
//        myLinkedList.printList();
//        myLinkedList.remove(3);
////        myLinkedList.add(2,"Winn");
//        myLinkedList.printList();
//        myLinkedList.addLast("Winn");
//        myLinkedList.printList();
//
//        System.out.println(myLinkedList.remove("Winn"));
//        System.out.println(myLinkedList.size());
//        System.out.println();
//        System.out.println(myLinkedList.indexOf("Một"));
//        System.out.println(myLinkedList.get(2));
//        System.out.println("First : "+ myLinkedList.getFirst() +"\nLast : " +myLinkedList.getLast());
//        myLinkedList.clear();
//        myLinkedList.printList();
        MyLinkedList myLinkedList1 = new MyLinkedList(0);
        myLinkedList1 = (MyLinkedList) myLinkedList.clone();
        myLinkedList1.printList();
    }

}
