import java.util.*;
public class uniquepermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<String> hs=new HashSet<String>();

        generatePermutations(s,"",hs);

        ArrayList<String> ar=new ArrayList<>(hs);
        Collections.sort(ar);
        for(String hi : ar){
            System.out.println(hi);
        }
        sc.close();
    }
    static void generatePermutations(String s, String p, HashSet<String> result){
        if(s.length() == 0){
            result.add(p);
            return;
        }
        for(int i=0;i<s.length();i++){
            String rem=s.substring(0, i) + s.substring(i + 1);
            generatePermutations(rem, p + s.charAt(i), result);
                }
    }
}
