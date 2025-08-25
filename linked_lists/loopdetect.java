package linked_lists;

import java.util.*;
public class loopdetect {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    static Node head;
    static void addlast(int d1){
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
     
    static void display(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    static boolean hashld(){
        Node hi=head;
        HashSet<Node> chk=new HashSet<>();
        while(hi != null){
            if(chk.contains(hi)){
                return true;
            }
            chk.add(hi);
            hi=hi.next;
        }
        return false;
    }

    static void floydld(){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                System.out.println("Loop Exits");
                return;
            }
        }
        System.out.println("Loop doesn't exists");
        return;
    }
    static void removeloop(){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                break;
            }
        }
        if(slow == fast){
            fast=head;
            while (fast != null) {
                if(slow == fast){
                    Node temp=head;
                    while(temp.next != slow){
                        temp=temp.next;
                    }
                    temp.next=null;
                    return;
                }
                slow=slow.next;
                fast=fast.next;
            }
        }
        System.out.println("Loop doesn't exists");
        return;
    }
    public static void main(String[] args) {
        addlast(20);
        addlast(4);
        addlast(15);
        addlast(10);
        head.next.next.next.next =head;
        display();
        if (hashld())
            System.out.println("Loop Exists");
        else
            System.out.println("Loop doesn't exists");
        removeloop();
        display();
        floydld();
    }

}
