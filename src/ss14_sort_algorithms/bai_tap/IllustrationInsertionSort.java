package src.ss14_sort_algorithms.bai_tap;

import java.util.Arrays;

public class IllustrationInsertionSort {
    public static void main(String[] args) {
        int [] array = {2,5,4,14,5,2,3,9,23,12};
        insertionSort(array);
    }
    public static void insertionSort(int []array){
        System.out.println("Input array : "+ Arrays.toString(array));
        int minIndex;
        for (int i = 0; i < array.length ; i++) {
            minIndex=i;
            System.out.println("So sánh phần tử đang xét với các phần tử còn lại");
            System.out.printf("Xét vị trí thứ "+i+" : ");
            System.out.printf("Min index : "+minIndex+" \n");

            for (int j = i+1; j <array.length ; j++) {
                System.out.println(array[minIndex] +" "+array[j]);
                if (array[j]<array[minIndex]){
                    minIndex = j;
                    System.out.println("Lấy vị trí phần tử bé hơn phần tử đang xét, Min index : "+minIndex);
                }
            }
            System.out.println("Đổi chỗ phần tử đang so sánh "+array[i]+" có vị trí là "+i+ " với phần tử bé hơn trong mảng "+array[minIndex]+" có vị trí là "+minIndex+":");
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex]= temp;
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }
}
