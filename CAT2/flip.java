import java.util.*;

public class flip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a1=new int[n];
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }
        int num = sc.nextInt();
        int max=0;
        for (int i = 0; i < n; i++) {
            int k=num;
            int[] a=Arrays.copyOf(a1,n);
            for (int j = i; j < n; j++) {
                if (k > 0 && a[j] == 0) {
                    a[j] = 1;
                    k--;
                }
            }
            int c1=count(a, n);
            if(c1>max) max=c1;
        }
        System.out.println(max);
        sc.close();
    }
    public static int count(int[] a, int n){
        int max=0;
        for(int i=0;i<n-1;i++){
            int m1=0;
            for(int j=i;j<n;j++){
                if(a[j] == 1){
                    m1++;
                }
                else{
                    break;
                }
            }
            if(m1>max){
                max=m1;
            }
        }
        return max;
    }
}
