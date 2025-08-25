package stack;
import java.util.*;
public class celebrityproblem {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 0}
        };

        int n = 4; // Number of people
        int result = findCelebrity(matrix, n);

        if (result == -1) {
            System.out.println("No celebrity found.");
        } else {
            System.out.println("Celebrity is person " + result);
        }
    }

    static int findCelebrity(int[][] matrix, int n){
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            stack.push(i);
        }
        while(stack.size()>1){
            int a=stack.pop();
            int b=stack.pop();
            if(knows(matrix,a,b)){
                stack.push(b); // If a knows b, then a cannot be a celebrity
            }else{
                stack.push(a); // If a does not know b, then b cannot be a celebrity
            }
        }
        int candidate=stack.pop();
        for(int i=0;i<n;i++){
            if(candidate==i) continue;
            if(knows(matrix,candidate,i) || !knows(matrix,i,candidate)){
                return -1;
            }
        }
        return candidate;
    }

    static boolean knows(int[][] matrix, int a, int b){
        return matrix[a][b] ==1;
    }
}
