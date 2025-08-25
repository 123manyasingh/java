import java.util.*;

public class lexfirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] str = s.toCharArray();
        Arrays.sort(str);
        int n = str.length;
        if(n==1){
            System.out.println(str[0]);
            return;
        }
        boolean skip = false;
        int skipnum = 0;
        String s1 = "", s2 = "";
        for (int i = 0; i < n-1;) {
            if (str[i] == str[i + 1]) {
                s1 = s1 + str[i];
                s2 = str[i + 1] + s2;
                str[i]='0';
                str[i+1]='0';
                i+=2;
            } else {
                if (skip) {
                    System.out.println("-1");
                    return;
                } else {
                    skip = true;
                    skipnum = i;
                }
                i++;
            }
        }
        if(str[n-1] != '0'){
            System.out.println("-1");
            return;
        }
        String fina = skip ? (s1 + str[skipnum] + s2) : (s1 + s2);
        System.out.println(fina);
        sc.close();
        return;
    }
}
