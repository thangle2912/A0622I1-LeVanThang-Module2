package src.ss3_array_method_java.bai_tap;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size Array ");
        System.out.printf("m = ");
        int m = scanner.nextInt();
        System.out.printf("n = ");
        int n = scanner.nextInt();
        float arrNumber[][] = new float[m][n];
        inputArray(arrNumber, scanner);
        outputArray(arrNumber);
        System.out.println("Max = " + findMax(arrNumber));
    }

    public static void inputArray(float[][] arr, Scanner scanner) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Element [" + i + "][" + j + "] :");
                arr[i][j] = scanner.nextFloat();
            }
        }
    }

    public static void outputArray(float[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%f" + " ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static float findMax(float[][] arr) {
        float max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
