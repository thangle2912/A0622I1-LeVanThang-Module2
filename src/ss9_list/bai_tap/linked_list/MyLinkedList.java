package src.ss9_list.bai_tap.linked_list;

public class MyLinkedList<E> {
    private int numberNodes = 0;
    private Node head;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
        numberNodes++;
    }

    public void add(int index, E element) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        Node holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numberNodes++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numberNodes++;
    }

    public void addLast(E e) {
        Node temp = head;
        for (int i = 0; i < numberNodes - 1; i++) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numberNodes++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.printf(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public E remove(int index) {

        Node temp = head;
        if (index < 0 || index >= numberNodes) {
            throw new IndexOutOfBoundsException("NumNodes: " + numberNodes + "Index: " + index);
        } else {
            if (numberNodes == 0) {
                return null;
            } else {
                if (index == 0) {
                    Node holder = head;
                    head = head.next;
                    return (E) holder.data;
                } else {
                    for (int i = 0; i < index - 1; i++) {
                        temp = temp.next;
                    }
                    Node holder = temp.next;
                    temp.next = holder.next;
                    numberNodes--;
                    return (E) holder.data;
                }
            }
        }
    }

    public boolean remove(Object e) {
        Node holder = head;
        for (int i = 0; i < numberNodes; i++) {
            if (holder.data == e) {
                return true;
            }
            holder = holder.next;
        }
        return false;
    }

    public int size() {
        return numberNodes;
    }

//    public E clone() {
//        Node temp = head;
//        Node newHead = new Node(temp.data);
//        Node holder;
//        for (int i = 0; i < numberNodes; i++) {
//            newHead = newHead.next;
//            temp = temp.next;
//            newHead.next = new Node(temp.data);
//        }
//        return (E) newHead.data;
//    }

    public boolean contains(E o) {
        Node temp = head;
        for (int i = 0; i < size(); i++) {
            if (temp.data.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < size(); i++) {
            if (temp.data.equals(o)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public E get(int index) {
        Node temp = head;
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("NumNodes: " + numberNodes + "Index: " + index);
        } else {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }
        return (E) temp.data;
    }
    public E getFirst(){
        Node temp = head;
        return (E) temp.data;
    }
    public E getLast(){
        Node temp = head;
        for (int i = 0; i <size()-1 ; i++) {
            temp=temp.next;
        }
        return (E) temp.data;
    }
    public void clear(){
        head = null;
    }
}
