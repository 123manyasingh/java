import java.util.*;
public class maxprodsub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=i;j--){
                int h=1;
                for(int k=i;k<=j;k++){
                    h*=arr[k];
                }
                if(h>max) max=h;
            }
        }





        /*for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int m=1;
                for(int k=i;k<=j;k++){
                    m*=arr[k];
                }
                if(m>max) max=m;
            }
        }*/
        System.out.println(max);
        sc.close();
    }
    
}