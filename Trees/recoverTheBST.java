package Trees;

public class recoverTheBST {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
    static class Solution {
        TreeNode f = null, s = null, prev = null;
        public void recoverTree(TreeNode root) {
            if (root == null) return;
            inorder(root);
            // Swap the values of the incorrect nodes
            if (f != null && s != null) {
                int temp = f.val;
                f.val = s.val;
                s.val = temp;
            }
        }

        void inorder(TreeNode node) {
            if (node == null) return;
            inorder(node.left);
            // Detect swapped nodes
            if (prev != null && node.val < prev.val) {
                if (f == null) {
                    f = prev;  // First incorrect node
                }
                s = node;  // Always update second incorrect node
            }
            prev = node; // Move previous pointer
            inorder(node.right);
        }

        // Helper function to print inorder traversal of the tree
        void printInorder(TreeNode root) {
            if (root == null) return;
            printInorder(root.left);
            System.out.print(root.val + " ");
            printInorder(root.right);
        }
    }

    public static void main(String[] args) {
        // Creating a sample BST:
        //         3
        //        / \
        //       1   4
        //          /
        //         2
        // The correct BST should be:
        //         2
        //        / \
        //       1   4
        //          /
        //         3
        // But 2 and 3 have been swapped

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);

        Solution solution = new Solution();

        System.out.println("Inorder traversal before recovery:");
        solution.printInorder(root);
        System.out.println();

        // Recover the BST
        solution.recoverTree(root);

        System.out.println("Inorder traversal after recovery:");
        solution.printInorder(root);
    }
}
