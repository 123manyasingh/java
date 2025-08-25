public class LongIncSubseq {
    public static void main(String[] args) {
        int[] arr = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
        System.out.println(lis(arr,0,arr.length,Integer.MIN_VALUE));
    }
    static int lis(int[] arr,int i,int n,int prev){
        if(i==n) return 0;
        int exclude=lis(arr,i+1,n,prev);
        int include=0;
        if(arr[i]>prev){
            //include
            include=1+lis(arr,i+1,n,arr[i]);
        }
        return Math.max(include,exclude);
    }

}
