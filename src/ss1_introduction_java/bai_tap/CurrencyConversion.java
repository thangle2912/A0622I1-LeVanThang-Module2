package src.ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        System.out.println("Input Dolar : ");
        Scanner scanner = new Scanner(System.in);
        float dolar = scanner.nextFloat();
        final float rate = 23000;
        float vnd = rate * dolar;
        System.out.println("Dolar to VND : "+dolar+"$ = "+vnd+" đ");
    }
}
