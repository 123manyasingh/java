public class eulersphi {
    public static void main(String[] args) {
        int n = 100;
        int result = n;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                result -= result / i;
            }
        }
        // If n is still greater than 1, then it must be a prime number greater than sqrt(originalN)
        if (n > 1) {
            result -= result / n;
        }

        System.out.println("Euler's = " + result);
    }
}
