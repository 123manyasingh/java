import java.util.*;
public class manuvering {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(path(m,n));
        sc.close();
    }
    static int path(int m, int n){
        if(m == 1 || n==1){
            return 1;
        }
        return(path(n-1,m) + path(n,m-1));
        //if also diagonal is included then add path(n-1,m-1)
    }
    
}
