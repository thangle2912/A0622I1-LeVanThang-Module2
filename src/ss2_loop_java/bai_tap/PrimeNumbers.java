package src.ss2_loop_java.bai_tap;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("First 20 primes");
        int count = 0,number =2;
        while (count<=20){
            if (isPrime(number)){
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
    static boolean isPrime(int number){
        for (int i = 2; i <=Math.sqrt(number) ; i++) {
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }
}
