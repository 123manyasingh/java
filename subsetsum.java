public class subsetsum {
    static Boolean[][] memo;
    static boolean ssum(int[] arr,int sum, int n,Boolean[][] memo){
        if(sum==0) return true;
        if(n==0) return false;
        if(memo[n][sum] != null) return memo[n][sum];
        if(arr[n-1]>sum){
            return memo[n][sum]=ssum(arr,sum,n-1,memo);
        }
        return memo[n][sum]=ssum(arr,sum,n-1,memo) || ssum(arr,sum-arr[n-1],n-1,memo);
    }
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 35;
        int n=arr.length;
        memo=new Boolean[n+1][sum+1];
        System.out.println(ssum(arr,sum,n,memo));
    }
}
