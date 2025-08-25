import java.util.*;

public class sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine();
        //String s = Integer.toBinaryString(n);
        //System.out.println(s);
        String s1="";
        s1 = s.substring(4) + s.substring(0,4);
        System.out.println(s1);
        System.out.println(Integer.parseInt(s1,2));
        sc.close();
    }
    static int gcd(int n, int m){
        for(int i=n;i>=1;i--){
            if(m%i==0 && n%i==0){
                return i;
            }
        }
        return 1;
    }
}
