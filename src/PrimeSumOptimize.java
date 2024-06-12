public class PrimeSumOptimize {

    public static boolean[] getPrimeNumberArray(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++){
            prime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        return prime;
    }

    public static void main(String[] args) { long sum = 0;
        boolean[] getPrimeNumberArray = getPrimeNumberArray(10000000);
        for (int i = 5; i <= 10000000; i++) {
            if (getPrimeNumberArray[i] && i % 10 != 3) { sum += i;
            } }
        System.out.println("Sum of primes not ending in 3 from 5 to 10 million: " + sum);
    }

}