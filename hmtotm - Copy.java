import java.util.*;
public class hmtotm {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(31, "Welcome");
        hm.put(11, "to");
        hm.put(2, "Coding Class");
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.putAll(hm);
        System.out.println(hm);
        System.out.println(tm);
        System.out.println(tm.values());

    }
}
