public class kanpsack01 {
    static int knap(int[] weight,int[] value,int n,int W){   //w is weight left
        if(W==0||n==0){        //over
            return 0;
        }
        if(weight[n-1]>W){     //skip
            return knap(weight,value,n-1,W);
        }
        int include=value[n-1]+knap(weight,value,n-1,W-weight[n-1]);
        int exclude=knap(weight,value,n-1,W);
        return Math.max(include,exclude);
    }
    public static void main(String[] args) {
        int[] wt = {10, 20, 30};
        int[] val = {60, 100, 120};
        int W = 50;
        int n = wt.length;
        System.out.println(knap(wt,val,n,W));
    }
}
