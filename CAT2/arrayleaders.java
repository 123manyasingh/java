import java.util.*;
public class arrayleaders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> ret=new ArrayList<>();
        int max=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                ret.add(arr[i]);
                max=arr[i];
            }
        }
        int size=ret.size();
        for(int i=size-1;i>=0;i--){
            System.out.print(ret.get(i) + " ");
        }

        sc.close();
    }

}
