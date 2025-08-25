package dp;

import java.util.Arrays;

public class wildcard_rec_memo {
    public static void main(String[] args) {
        String s1= "x***x";
        String s2= "xyxzzxy";
        int[][] memo=new int[s1.length()][s2.length()];
        for(int[] row:memo) Arrays.fill(row,-1);
        int i=isMatch(s1.toCharArray(),s2.toCharArray(),s1.length()-1,s2.length()-1,memo);
        if(i==1){
            System.out.println("Match");
        }else System.out.println("Not Match");

    }
    static int isMatch(char[] pattern,char[] text,int i,int j,int[][] memo){
        if(i<0&&j<0) return 1;
        else if(i<0) return 0;
        else if(j<0){
            for(int ii=0;ii<=i;ii++){
                if(pattern[ii]!='*') return 0;
            }
            return 1;
        }
        if(memo[i][j] != -1){
            return memo[i][j];
        }
        if(pattern[i]==text[j] || pattern[i]=='?'){
            return memo[i][j]=isMatch(pattern,text,i-1,j-1,memo);
        }
        else{
            if(pattern[i]=='*'){
                if(isMatch(pattern,text,i-1,j,memo)==1 || isMatch(pattern,text,i,j-1,memo) == 1){
                    memo[i][j]=1;
                }else memo[i][j]=0;
                return memo[i][j];
            }else{
                return 0;
            }
        }
    }
}
