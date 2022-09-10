package src.ss3_array_method_java.bai_tap;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input size Array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        inputArray(arr,scanner);
        outputArray(arr);
        System.out.println("Min = "+ findMin(arr));
    }
    public static void inputArray(int[] arr, Scanner scanner) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Element " + i + " = ");
            arr[i] = scanner.nextInt();
        }
    }
    public static void outputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%5d", arr[i]);
        }
        System.out.println();
    }
    public static int findMin(int []arr){
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
