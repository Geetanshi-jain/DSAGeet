import javax.print.attribute.standard.NumberOfDocuments;

public class DoublyLL {
    public static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static void display(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node insertAtHead(Node head, int val) {
        Node temp = new Node(val);
        temp.next = head;
        head.prev = temp;
        head = temp;
        return head;
    }

    public static void displayRev(Node tail) {
        while (tail != null) {
            System.out.println(tail.data);
            tail = tail.prev;
        }
    }

    public static void display2(Node random) {
        Node temp = random;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node insertAtTail(Node tail, int val) {
        Node temp = new Node(val);
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
        return tail;
    }

    public static void insertAtTailwhenTainNotGiven(Node head, int val) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node t = new Node(val);
        temp.next = t;
        t.prev = temp;
        temp = t;
    }

    public static void insertAtIdx(Node head, int idx, int val) {
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        Node t = new Node(val);
        temp.next.prev = t;
        t.prev = temp;
        t.next = temp.next;
        temp.next = t;

    }

    public static void main(String[] args) {
        // 1->2->3->4->5
        Node a = new Node(1);
        Node b = new Node(2);

        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        display(a);
        displayRev(e);
        Node newh = insertAtHead(a, 30);
        System.out.println("_______________________");
        display(newh);
        System.out.println(insertAtTail(e, 10).data);
        insertAtTailwhenTainNotGiven(newh, 13);
        System.out.println("_______________________");
        display(newh);
        System.out.println("_______________________");
        insertAtIdx(newh, 3, 50);
        System.out.println("_______________________");
        display(newh);
    }

}
