package dp;
//levenshtein distance problem(edit distance on leetcode)
public class leve_dist {
    public static void main(String[] args) {
        String str1 = "abad";
        String str2 = "abac";
        System.out.println(editDistance(str1,str2,str1.length(),str2.length()));
    }
    private static int editDistance(String str1, String str2,int m,int n) {
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0){
                    dp[i][j]=j;
                }else if(j==0){
                    dp[i][j]=i;
                }
                else if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=1 + Math.min(Math.min(dp[i-1][j-1], dp[i][j-1]), dp[i-1][j]);
                }

            }
        }
        return dp[m][n];
    }
}
