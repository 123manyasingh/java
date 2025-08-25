import java.util.*;

public class longestpalin {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int fc=1;
        int n=s.length();

        for(int i=2;i<n;i++){
            
            for(int j=0;j<n-i;j++){
                
                if(palindrome(s.substring(j,j+i))){
                    if(i>fc){
                        fc=i;
                    }
                }
            }
        }

        System.out.println(fc);
        sc.close();
    }
    static boolean palindrome(String s){
        int j=s.length()-1;
        int i=0;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
