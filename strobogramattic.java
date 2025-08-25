import java.util.*;
public class strobogramattic {
    
    public static boolean hii(String s){
        HashMap<Character, Character> map=new HashMap<>();
        map.put('1','1');
        map.put('8','8');
        map.put('6','9');
        map.put('9','6');
        map.put('0','0');

        int l=0, r=s.length() -1;
        while(l<=r){
            if(!(map.containsKey(s.charAt(l)) && map.containsKey(s.charAt(r)))){
                return false;
            }
            if(map.get(s.charAt(l) ) != s.charAt(r)){
                return false;
            }
            l++; r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();
        System.out.println(hii(s));

    }
}
