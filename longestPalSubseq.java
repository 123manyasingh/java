public class longestPalSubseq {
    public static void main(String[] args) {
        String s = "bbacbzaybcab";
        Integer[][] memo=new Integer[s.length()][s.length()];
        System.out.println(lps(s,0,s.length()-1,memo));
    }
    static int lps(String s,int start,int end,Integer[][] memo){
        if(start>end) return 0;
        if(start==end) return 1;
        if(memo[start][end] != null) return memo[start][end];
        if(s.charAt(start) == s.charAt(end)){
            return memo[start][end]=2+lps(s,start+1,end-1,memo);
        }else{
            return memo[start][end]=Math.max(lps(s,start+1,end,memo), lps(s,start,end-1,memo));
        }
    }
}
