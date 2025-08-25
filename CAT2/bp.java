import java.util.*;
public class bp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toBinaryString(n);
        int i=0;
        int j=s.length()-1;
        boolean chk=true;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                chk=false;
            }
            i++;
            j--;
        }
        System.out.println(chk);
        sc.close();
    }
}
