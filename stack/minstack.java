package stack;
import java.util.*;
public class minstack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public void push(int val) {
        mainStack.push(val);
        if(minStack.empty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    public void pop() {
        int temp=mainStack.pop();
        if(temp==minStack.peek()){
            minStack.pop();
        }
    }

    public int peek() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        minstack minStack=new minstack();
        minStack.push(2);
        minStack.push(3);
        minStack.pop();
        minStack.push(4);
        minStack.push(-1);
        System.out.println(minStack.peek());
        minStack.push(6);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }

}
