import java.util.*;
public class toggletheswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean door[]=new boolean[n+1];
        for(int i=1;i<=n;i++){
            for(int j=1*i;j<=n;j+=i){
                door[j]=!door[j];
            }
        }
        int c=0,o=0;
        for(int i=1;i<=n;i++){
            if(door[i]) o++;
            else c++;
        }
        System.out.println("close "+ c+ "\nopen "+o);
        sc.close();
    }
}

/*There are 100 closed doors. A cage holding 100 monkeys is placed nearby. Every monkey that visits a door either opens a closed door or closes an open door. 
The first monkey that is let out of the cage visits and opens all the hundred doors. The second monkey that is released visits doors of the order 2, 4, 6, 8, 10…. .
The third monkey released visits doors 3, 6, 9,12, 15……, and so on.
After all the monkeys from the cage are released and have opened or closed at least one door, how many doors are left open?
 */