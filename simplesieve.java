import java.util.*;

class simplesieve {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 2) {
            System.out.println(0);
            sc.close();
            return;
        }

        int prime[] = new int[n]; // Array size should be n
        for (int i = 2; i < n; i++) {
            prime[i] = 1;
        }

        for (int i = 2; i * i < n; i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j < n; j += i) { // Loop should run while j < n
                    prime[j] = 0;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (prime[i] == 1) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
