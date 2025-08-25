import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int min=Math.min(n1, n2);
        for(int i=min;i>0;i--){
            if(n1 % i == 0 && n2 % i == 0){
                System.out.println(i);
                return;
            }
        }
        sc.close();
        
        
    }
}
