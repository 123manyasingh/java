package stack;
import java.util.*;
public class iterativehanoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of disks: ");
        int n=sc.nextInt();
        hanoi(n,'A','B','C');
    }
    static void hanoi(int n, char s,char a, char d){ //source,auxiliary,destination
        int totalMoves=(int)Math.pow(2,n) -1;
        //System.out.println(totalMoves);
        Stack<Integer> src=new Stack<>();
        Stack<Integer> aux=new Stack<>();
        Stack<Integer> dest=new Stack<>();

        for(int i=n;i>=1;i--){
            src.push(i);
        }
        if(n%2==0){
            char t=a;  //swap dest and aux in case of even. only while printing, no need in code
            a=d;
            d=t;
        }
        for(int i=1;i<=totalMoves;i++){
            if(i%3==0){
                move(src,dest,s,d);
            }
            else if(i%3==1){
                move(src,aux,s,a);
            }
            else{
                move(aux,dest,a,d);
            }
        }
    }

    static void move(Stack<Integer> src,Stack<Integer> dest,char s, char d){
        if(!src.empty() && (dest.empty() || src.peek() < dest.peek())){
            dest.push(src.pop());
            System.out.println("Move disk "+dest.peek()+" from "+s+" to "+d);
        }else{
            src.push(dest.pop());
            System.out.println("Move disk "+src.peek()+" from "+d+" to "+s);
        }
    }
}
