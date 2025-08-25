package Trees;
import java.util.*;
public class boundaryTraversal {
    class Node {
        int data;
        Node left;
        Node right;
        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        boundaryTraversal bt=new boundaryTraversal();
        Node root = bt.new Node(1);
        root.left = bt.new Node(2);
        root.right = bt.new Node(3);
        root.left.left = bt.new Node(4);
        root.left.right = bt.new Node(5);
        root.right.left = bt.new Node(6);
        root.right.right = bt.new Node(7);
        List<Integer> result = bt.printBoundary(root);
        System.out.print("Boundary Traversal: ");
        System.out.println(result);
    }

    private List<Integer> printBoundary(Node root) {
        List<Integer> l=new ArrayList<>();
        if(root==null) return l;
        if(!isLeaf(root)) l.add(root.data);
        leftBoundary(root,l);
        leaves(root,l);
        rightBoundary(root,l);
        return l;
    }

    private void rightBoundary(Node root, List<Integer> l) {
        Node c=root.right;
        Stack<Integer> s=new Stack<>();
        while(c!=null){
            if(!isLeaf(c)) s.push(c.data);
            if(c.right != null) c=c.right;
            else c=c.left;
        }
        while (!s.isEmpty()){
            l.add(s.pop());
        }
    }

    private void leaves(Node root, List<Integer> l) {
        if(root==null) return;
        if(isLeaf(root)){
            l.add(root.data);
            return;
        }
        leaves(root.left,l);
        leaves(root.right,l);
    }

    private void leftBoundary(Node n,List<Integer> l){
        Node c=n.left;
        while(c!=null){
            if(!isLeaf(c)) l.add(c.data);
            if(c.left != null) c=c.left;
            else c=c.right;
        }
    }
    boolean isLeaf(Node n){
        return n.right==null && n.left==null;
    }
}
