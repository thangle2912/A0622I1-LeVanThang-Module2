package src.ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class DisplayName {
    public static void main(String[] args) {
        System.out.println("Enter your name : ");
        Scanner scanner = new Scanner(System.in);
        String yourName = scanner.nextLine();
        System.out.println("Hello  : "+yourName);
    }
}