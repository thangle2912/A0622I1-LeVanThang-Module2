package src.ss15_exception_debug.bai_tap;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int canhA , canhB, canhC;
        try{
            System.out.printf("A :");
            canhA = Integer.parseInt(scanner.nextLine());
            System.out.printf("B :");
            canhB = Integer.parseInt(scanner.nextLine());
            System.out.printf("C :");
            canhC = Integer.parseInt(scanner.nextLine());
            IllegalTriangleException illegalTriangleException = new IllegalTriangleException(canhA,canhB,canhC);

        }catch (Exception e){
            System.out.println("Error");
        }
        System.out.println("Success");
    }
}
