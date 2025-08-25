public class lon_bitonic_subseq {
    public static void main(String[] args) {
        int max=0;
        int[] arr = {1, 11, 2, 10, 4, 5, 2, 1};
        int n = arr.length;
        for(int i=0;i<n;i++){
            max=Math.max(max,LIS(0,i,arr,Integer.MIN_VALUE) + LDS(i+1,n,arr,Integer.MAX_VALUE) );
        }
        System.out.println(max);
    }
    static int LIS(int i,int n,int[] arr,int prev){
        if(i==n) return 0;
        int include=0;
        int exclude=LIS(i+1,n,arr,prev);
        if(arr[i] > prev){
            include=1+ LIS(i+1,n,arr,arr[i]);
        }
        return Math.max(include,exclude);
    }
    static int LDS(int i,int n,int[] arr,int prev){
        if(i==n) return 0;
        int include=0;
        int exclude=LDS(i+1,n,arr,prev);
        if(arr[i] < prev){
            include=1+ LDS(i+1,n,arr,arr[i]);
        }
        return Math.max(include,exclude);
    }
}
