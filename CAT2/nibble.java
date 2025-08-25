import java.util.Scanner;

public class nibble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int swap = ((n & 0x0F) << 4) | ((n & 0xF0) >> 4);
        System.out.println(swap);
        
        scanner.close();
    }
}
