package LinkedList;

public class RemovingnthNodeFromEnd {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        public static void deleteNthfromEnd(Node head, int n) {
            Node slow = head;
            Node fast = head;
            for (int i = 1; i <= n; i++) {
                fast = fast.next;
            }
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;

        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        Node a = new Node(5);

        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(8);
        Node e = new Node(10);
        // 5->3->4->8->10

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        ll.display();
        ll.deleteNthfromEnd(a, 2);
        ll.display();

    }
}

/*
 * javac LinkedList\RemovingnthNodeFromEnd.java -O(n)
 * java LinkedList.RemovingnthNodeFromEnd
 */
