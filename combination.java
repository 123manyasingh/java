import java.util.*;
public class combination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {2,3,4,5,2,1,2,4};
        int n=arr.length;
        HashSet<String> hs=new HashSet<String>();
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                String hi="";
                hi += "{";
                hi+= arr[i];
                hi+= ", ";
                hi += arr[j];
                hi += "}";
                hs.add(hi);

            }
        }


        ArrayList<String> ary=new ArrayList<>(hs);
        Collections.sort(ary);

        for(String yoyo : ary){
            System.out.println(yoyo);
        }
    }
}
