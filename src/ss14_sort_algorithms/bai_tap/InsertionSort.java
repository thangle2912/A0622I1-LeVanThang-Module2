package src.ss14_sort_algorithms.bai_tap;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {2, 5, 4, 14, 5, 2, 3, 9, 23, 12};
        array = insertionSort(array);
        System.out.println("Mảng sau khi sắp xếp");
        for (int element : array) {
            System.out.printf(element + " ");
        }
    }

    public static int[] insertionSort(int[] array) {
        int minIndex;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }
}

