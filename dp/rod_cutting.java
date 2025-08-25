package dp;

import java.util.Arrays;

public class rod_cutting {
    public static void main(String[] args) {
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        int n = price.length;
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        int maxVal = cutRodRecursive(price, n, memo);
        System.out.println("Maximum obtainable value is " + maxVal);
    }

    private static int cutRodRecursive(int[] price, int n, int[] memo) {
        if(memo[n] != -1) return memo[n];
        if(n==0) return 0;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            max=Math.max(max,price[i-1] + cutRodRecursive(price,n-i,memo));
        }
        return memo[n]=max;
    }
}

