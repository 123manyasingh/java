package stack;
import java.util.*;
public class stackpermutations {
    public static void main(String[] args) {
        int[] orig={1,2,3};
        int[] target={2,1,3};
        if(stackyes(orig,target)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    static boolean stackyes(int[] o, int[] t){
        Stack<Integer> stack=new Stack<>();
        int i=0;
        for(int e : o){
            stack.push(e);
            while(i<t.length && !stack.empty() && stack.peek()==t[i]){
                stack.pop();
                i++;
            }
        }
        return stack.empty();
    }

}
