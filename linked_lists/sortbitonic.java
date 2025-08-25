package linked_lists;

public class sortbitonic {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data=d;
            next=null;
            prev=null;
        }
    }
    static Node head;

    static Node peakSplit(){
        Node temp=head;
        while(temp != null && temp.next != null && temp.data < temp.next.data){
            temp=temp.next;
        }
        Node temp2=temp.next;
        temp.next=null; //breaking bonds;
        if(temp2!=null) temp2.prev=null;
        return temp2;
    }



    static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev=curr;
            curr=next;

        }
        return prev;
    }

    static Node merge(Node first, Node second){
        if(first==null){
            return second;
        }
        if(second==null){
            return first;
        }
        Node res;
        if(first.data <= second.data){
            res=first;
            res.next=merge(first.next,second);
            if(res.next != null){
                res.next.prev=res;
            }
        }
        else{
            res=second;
            res.next=merge(first,second.next);
            if(res.next != null){
                res.next.prev=res;
            }
        }
        return res;
    }

    static void insertlast(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            return;
        }
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
    }

    static void display(Node head){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insertlast(10);
        insertlast(20);
        insertlast(30);
        insertlast(40);
        insertlast(50);
        insertlast(60);
        insertlast(55);
        insertlast(45);
        insertlast(35);
        insertlast(15);
        if(head==null){
            System.out.println("NULL");
            return;
        }
        display(head);
        Node hi=peakSplit();
        hi=reverse(hi);
        hi=merge(hi,head);
        display(hi);



    }
}
