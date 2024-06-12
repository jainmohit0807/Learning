public class PrimeSum {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }

    public static void main(String[] args) { long sum = 0;
        for (int i = 5; i <= 10000000; i++) {
            if (isPrime(i) && i % 10 != 3) { sum += i;
            } }
        System.out.println("Sum of primes not ending in 3 from 5 to 10 million: " + sum);
        //2402006986464
    }

}