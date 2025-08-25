package stack;
import java.util.*;

public class stockspan {
    public static void main(String[] args) {
        int[] stockprices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = calculateSpan(stockprices);
        System.out.println("Stock Prices: " + Arrays.toString(stockprices));
        System.out.println("Spans: " + Arrays.toString(spans));
    }

    private static int[] calculateSpan(int[] stockprices) {
        int n = stockprices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < n; i++) {
            while (!stack.empty() && stockprices[i] >= stockprices[stack.peek()]) {
                stack.pop();
            }
            if (stack.empty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return span;
    }
}
