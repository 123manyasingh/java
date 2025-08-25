import java.util.*;
public class majorityelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max) max=arr[i];
        }

        int count[]=new int[max+1];
        Arrays.fill(count,0);
        for(int i = 0;i<n;i++){
            count[arr[i]]++;
        }

        int m2=0;
        int m3=0;
        for(int i=0;i<=max;i++){
            if(count[i]>m2){
                m2=count[i];
                m3=i;
            }
        }
        if(m2 > (n/2)){
            System.out.println(m3);
        }
        else{
            System.out.println("null");
        }
        sc.close();
        
    }
}
