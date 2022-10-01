package src.ss9_list.bai_tap.array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (size == this.elements.length) {
            ensureCapa();
        }
        for (int i = size - 1; i >= index; i--) {
            this.elements[i++] = this.elements[i];
        }
        this.elements[index] = element;
        size++;
    }

    public Object[] remove(int index) {
        Object[] elements = new Object[size-1];
        int i = 0;
        if (index <= size) {
            for (; i < index; i++) {
                elements[i] = this.elements[i];
            }
            for (i = index; i < size-1; i++) {
                elements[i] = this.elements[i + 1];
            }
        }else {
            throw  new IndexOutOfBoundsException("size: " + size + "index: " + index);
        }
        return elements;
    }

    public int size() {
        return size;
    }


    public boolean contrains(E o) {
        if ( o ==null){
            for (int i = 0;i<size;i++){
                if (elements[i]==null){
                    return true;
                }
            }
        }else {
            for (int i =0;i<size;i++){
                if (elements[i].equals(o)){
                    return true;
                }
            }
        }
        return false;
    }

    public Object[] clone() {
        Object newArray[] = new Object[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = elements[i];
        }
        return newArray;
    }
    public int indexOf(E o){
        if ( o == null){
            for (int i = 0;i<size;i++){
                if (elements[i]==null){
                    return i;
                }
            }
        }else {
            for (int i =0;i<size;i++){
                if (elements[i].equals(o)){
                    return i;
                }
            }
        }
        return -1;
    }
    public boolean add (E o){
        if (elements.length == size){
            return false;
        }
        elements[size] = o;
        size++;
        return true;
    }
    public E get(int index){
        if (index>=size || size <0){
            throw new IndexOutOfBoundsException("size: " + size + "index: " + index);
        }
        return (E) elements[index];
    }
    public void clear(){
        for (int i=0;i<size;i++){
            elements[i]=null;
        }
    }
}
