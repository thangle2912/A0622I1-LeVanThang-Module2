package src.ss2_loop_java.bai_tap;

import java.util.Scanner;

public class DisplayShapes {
    public static void main(String[] args) {
        System.out.println("Display Shapes");
        displayShapes();
    }
    static void displayShapes() {
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle ");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Input Your Choice : ");
        Scanner scanner = new Scanner(System.in);
        int yourChoice = scanner.nextInt();
        switch (yourChoice) {
            case 1:
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 10; j++) {
                        System.out.printf("*");
                    }
                    System.out.println();
                }
                displayShapes();
                break;
            case 2:
                System.out.println("1. Top-left");
                System.out.println("2. Top-right");
                System.out.println("3. Bottom-left");
                System.out.println("4. Bottom-right");
                int choiceTriangle = scanner.nextInt();
                switch (choiceTriangle) {
                    case 1:
                        for (int i = 5; i >= 1; --i) {
                            for (int j = 1; j <= i; ++j) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < i; j++) {
                                System.out.println("  ");
                            }
                            for (int j = i; j < 5; j++) {
                                System.out.println(" *");
                            }

                        }
                        break;
                    case 3:
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j <= i; j++) {
                                System.out.printf("* ");
                            }
                            System.out.println();
                        }
                        break;
                    case 4:
                }
                displayShapes();
                break;
            case 3:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5 - i; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                displayShapes();
                break;
            case 4:
                break;
            default:
                System.out.println("Error !");
                displayShapes();
        }
    }
}
