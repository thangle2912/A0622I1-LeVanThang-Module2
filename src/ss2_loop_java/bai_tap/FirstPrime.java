package src.ss2_loop_java.bai_tap;

public class FirstPrime {
    public static void main(String[] args) {
        System.out.println("Prime Number < 100");

        for (int i = 2; i <100 ; i++) {
            if (PrimeNumbers.isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
