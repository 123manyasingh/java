import java.util.*;
//two loops. first for index of the string, second for how many are being included in the string. ek se huru karo if less weight, add karo. uske bad ek aur
//character daal ke dekho agar woh bhi add ho rha hai toh karo warna break from the internal loop.
public class weightedss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String p=sc.nextLine();
        String q=sc.nextLine();
        int n=sc.nextInt();
        HashSet<String> hs=new HashSet<String>();
        int p1=p.length();
        for(int i=0;i<p1;i++){
            int sum=0;
            String s="";

            for(int j=i;j<p1;j++){
                //char s1=s.charAt(j);
                int pos=p.charAt(j) -'a';
                sum += q.charAt(pos) -'0';
                s += p.charAt(j);
                if(sum <= n){
                    hs.add(s);
                }
                else{
                    break;
                }
            }
        }
        System.out.println(hs.size());
        
        sc.close();
    }
}
