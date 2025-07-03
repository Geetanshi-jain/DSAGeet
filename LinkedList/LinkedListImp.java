package LinkedList;

public class LinkedListImp {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
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
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);

        Node temp = a;
        System.out.println("elemets are :\n");
        /*
         * for (int i = 1; i <= 5; i++) {
         * System.out.println(temp.data + "  ");
         * temp = temp.next;
         * }
         */
        while (temp != null) {
            System.out.println(temp.data + "   ");
            temp = temp.next;
        }
             
    }
}
/*
 * javac LinkedList\LinkedListImp.java
 * java LinkedList.LinkedListImp
 */
