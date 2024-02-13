public class PrimeNumbers {

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Function to find and print prime numbers in a given series
    static void findPrimes(int[] series) {
        System.out.println("Prime numbers in the given series:");
        for (int num : series) {
            if (isPrime(num))
                System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage
        int[] series = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        findPrimes(series);
    }
}
