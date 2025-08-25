package linked_lists;
import java.util.*;
public class segregateoddeven {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }

    }
    static Node head;
    public static void addlast(int d1){
        Node node=new Node(d1);
        if(head == null){
            head=node;
            return;
        }
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=node;
        return;
    }

    static Node even;
    public static void addeven(int d1){
        Node node=new Node(d1);
        if(even == null){
            even=node;
            return;
        }
        Node temp=even;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=node;
        return;
    }


    static void display(Node head){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    static Node segregate(Node head){
        Node temp1=head;
        Node temp2=head;
        while (temp1 != null){
            int a=temp1.data;
            if(a%2 == 0){
                addeven(a);
            }
            temp1=temp1.next;
        }
        while (temp2 != null){
            int a=temp2.data;
            if(a%2 != 0){
                addeven(a);
            }
            temp2=temp2.next;
        }

        return even;
    }

    public static void main(String[] args) {
        addlast(2);
        addlast(3);
        addlast(5);
        addlast(6);
        addlast(1);
        addlast(4);

        display(head);
        display(segregate(head));
    }

}
