import java.util.*;
public class blockswap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=sc.nextInt();
        if(c>n){
            c=c%n;
        }
        else if(c==n){
            print(arr, n);
            sc.close();
            return;
        }
        int[] arr2=new int[n];
        for(int i=0;i<n-c;i++){
            arr2[i]=arr[c+i];
        }
        for(int i=n-c;i<n;i++){
            arr2[i]=arr[i-n+c];
        }
        print(arr2, n);
        sc.close();
        return;
    }
    public static void print(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    } 
}
