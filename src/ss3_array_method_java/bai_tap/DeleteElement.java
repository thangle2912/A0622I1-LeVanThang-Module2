package src.ss3_array_method_java.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        outputArray(arrNumber);
        System.out.println("Delete Element");
        int delElement = scanner.nextInt();
        int[] result = deleteElement(arrNumber, delElement);
        outputArray(result);
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

    public static int[] deleteElement(int[] arr, int element) {
        int[] result = new int[arr.length - 1];
        loop1:
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != element) {
                result[i] = arr[i];
            } else {
                for (int j = i; j < result.length; j++) {
                    result[j] = arr[j + 1];
                }
                break loop1;
            }
        }
        return result;
    }
}
