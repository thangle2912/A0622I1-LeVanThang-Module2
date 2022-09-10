package src.ss3_array_method_java.bai_tap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size Array 1 : ");
        int sizeArray1 = scanner.nextInt();
        int[] arrA = new int[sizeArray1];
        inputArray(arrA, scanner);
        System.out.println("Input size Array 2 : ");
        int sizeArray2 = scanner.nextInt();
        int[] arrB = new int[sizeArray2];
        inputArray(arrB, scanner);
        int[] arrC = new int[arrA.length + arrB.length];
        outputArray(mergeArray(arrA, arrB, arrC));

    }

    public static void inputArray(int[] arr, Scanner scanner) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " = ");
            arr[i] = scanner.nextInt();
        }
    }

    public static int[] mergeArray(int[] arrA, int[] arrB, int[] arrC) {
        int i = 0;
        while (i < arrA.length) {
            arrC[i] = arrA[i];
            i++;
        }
        while (i < arrC.length) {
            arrC[i] = arrB[i - arrA.length];
            i++;
        }
        return arrC;
    }

    public static void outputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%5d", arr[i]);
        }
        System.out.println();
    }

}
