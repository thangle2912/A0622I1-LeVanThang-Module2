package src.ss3_array_method_java.bai_tap;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        outputArray(arrNumber);
        System.out.println("Insert Element");
        int insertElement = scanner.nextInt();
        System.out.println("Index Insert <" + arrNumber.length);
        int index = scanner.nextInt();
        if (0 <= index && index < arrNumber.length) {
            arrNumber = insertArray(arrNumber, insertElement, index);
            outputArray(arrNumber);
        }
    }

    public static void inputArray(int[] arr, Scanner scanner) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap vao phan tu thu " + i + " : ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void outputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%5d", arr[i]);
        }
        System.out.println();
    }

    public static int[] insertArray(int[] arr, int element, int index) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < result.length; i++) {
            if (i < index) {
                result[i] = arr[i];
            } else if (i == index) {
                result[i] = element;
            } else {
                result[i] = arr[i - 1];
            }
        }
        return result;
    }
}
