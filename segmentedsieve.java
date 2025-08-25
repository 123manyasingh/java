// now its a segemented sieve lol. (not really)

import java.util.*;
class segmentedsieve {

    public static int ss(int n) {
        if (n <= 2) {
            System.out.println(0);
            return 0;
        }
        int prime[] = new int[n];
        for (int i = 2; i < n; i++) {
            prime[i] = 1;
        }
        for (int i = 2; i * i < n; i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j < n; j += i) {
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
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(ss(m) - ss(n));
        sc.close();
    }
}
