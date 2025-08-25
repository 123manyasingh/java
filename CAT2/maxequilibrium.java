import java.util.*;
public class maxequilibrium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=Integer.MAX_VALUE;
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n-1;i++){
            int diff=Math.abs(sum(arr,0,i) - sum(arr,i,n));
            if(diff < sum){
                sum=diff;
            }
        }
        System.out.println(sum);
        sc.close();
        return;
    }
    
    public static int sum(int[] arr, int i, int n){
        int sum=0;
        for(int j=i;j<n;j++){
            sum+=arr[j];
        }
        return sum;
    }
}
