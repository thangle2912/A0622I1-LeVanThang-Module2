package src.ss11_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ElementReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        stackOfInteger(scanner);
        stackOfString(scanner);

    }
    public static void stackOfInteger(Scanner scanner){
        Stack<Integer> stacks = new Stack<>();
        int[] arrayNumber =inputArray(scanner);
        System.out.println("Array before reverse : ");
        outputArray(arrayNumber);
        for ( int element: arrayNumber){
            stacks.push(element);
        }
        for (int i = 0; i <arrayNumber.length ; i++) {
            arrayNumber[i] =stacks.pop();
        }
        System.out.println("Array after reverse : ");
        outputArray(arrayNumber);

    }
    public static int[] inputArray(Scanner scanner){
        System.out.print("Input size array :");
        int size = scanner.nextInt();
        int [] arrayNumber = new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("Input element : "+i);
            arrayNumber[i]= scanner.nextInt();
        }
        return arrayNumber;
    }
    public static void outputArray(int [] array){
        for (int element : array){
            System.out.printf(element+ " ");
        }
        System.out.println();
    }

    public static void stackOfString(Scanner scanner){
        Stack<String> stacks = new Stack<>();
        System.out.println("Input String : ");
        String str = scanner.nextLine();
        String [] arrayStr = str.split("");
        str = "";
        for (int i = 0; i <arrayStr.length ; i++) {
            stacks.push(arrayStr[i]);
        }
        for (int i = 0; i <arrayStr.length ; i++) {
            str = str + stacks.pop();
//            System.out.println(stacks.pop());
        }
        System.out.println(str);
    }
}
