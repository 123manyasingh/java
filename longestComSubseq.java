public class longestComSubseq {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "acdf";
        int m=s1.length();
        int n=s2.length();
        Integer[][] memo = new Integer[m][n];
        int len= lcs(s1,s2,memo,m-1,n-1);
        printlcs(s1,s2,m-1,n-1,memo);
    }
    private static void printlcs(String s1, String s2, int m, int n, Integer[][] memo) {
        StringBuilder sb=new StringBuilder();
        while(m>=0 && n>=0){
            if(s1.charAt(m)==s2.charAt(n)){
                sb.insert(0,s1.charAt(m));
                m--; n--;
            }else{
                int m1=0,n1=0;
                if(m>0) m1=memo[m-1][n];
                if(n>0) n1=memo[m][n-1];
                if(m1>n1) m--;
                else n--;
            }
        }
        System.out.println(sb.toString());
    }
    private static int lcs(String s1, String s2, Integer[][] memo, int m, int n) {
        if(m<0 || n<0) return 0;
        if(memo[m][n]!=null) return memo[m][n];
        if(s1.charAt(m)==s2.charAt(n)){
            return memo[m][n]=1+lcs(s1,s2,memo,m-1,n-1);
        }else{
            return memo[m][n]=Math.max(lcs(s1,s2,memo,m-1,n),lcs(s1,s2,memo,m,n-1));
        }
    }
}
