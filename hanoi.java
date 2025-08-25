public class hanoi {
    public static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }

        // Move n-1 disks from source to auxiliary
        towerOfHanoi(n - 1, fromRod, auxRod, toRod);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);

        // Move the n-1 disks from auxiliary to destination
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}