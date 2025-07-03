package LinkedList;

public class dispalyLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
//can be do it recursively

    public static void displayR(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.data);
        displayR(head.next);
    }

    public static void main(String[] args) {
        dispalyLL ll = new dispalyLL();
        Node a = new Node(5);
        System.out.println(a.next);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(8);
        Node e = new Node(10);
        // 5->3->4->8->10

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // System.out.println(a.next);
        // System.out.println(b);

        System.out.println(b.data);
        System.out.println(a.next.data);
        // can be do it recursively
        display(a);

    }

}
