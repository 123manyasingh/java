package linked_lists;

public class mergesortdll {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int val){
            data=val;
            next=null;
            prev=null;
        }
    }
    static Node head;

    static void addlast(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node split(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next != null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //slow pointer now has the mid point, so second list will begin from slow.next
        Node second=slow.next;
        slow.next=null;
        if(second!=null) second.prev=null;
        return second;
    }

    static Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node secondHalf=split(head);
        Node firstHalf=head;

        firstHalf=mergeSort(firstHalf);
        secondHalf=mergeSort(secondHalf);

        return merge(firstHalf,secondHalf);
    }

    static Node merge(Node first, Node second){
        if(first==null) return second;
        if(second==null) return first;
        Node result;
        if(first.data <= second.data){
            result=first;
            result.next=merge(first.next,second);
            if(result.next != null){
                result.next.prev=result;
            }
        }
        else{
            result=second;
            result.next=merge(first,second.next);
            if(result.next != null){
                result.next.prev=result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        addlast(10);
        addlast(3);
        addlast(15);
        addlast(7);
        addlast(8);
        addlast(12);
        addlast(2);
        addlast(1);

        System.out.println("Original List:");
        display(head);

        head = mergeSort(head);

        System.out.println("Sorted List:");
        display(head);
    }
}
