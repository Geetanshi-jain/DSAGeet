package LinkedList;

/*findNthNodefromEnd
 * way1 =O(n) =2 traversal
 * way2 =O(n) =1 traversal
 */
public class findNthNodefromEnd {
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

        public static Node nthNode(Node head, int n) {
            int size = 0;
            Node temp = head;
            while (temp != null) {
                size++;
                temp = temp.next;
            }
            int m = size - n + 1;
            temp = head;
            for (int i = 1; i <= m - 1; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public static Node nthNodeUsingSlowFast(Node head, int n) {
            Node slow = head;
            Node fast = head;
            for (int i = 1; i <= n; i++) {
                fast = fast.next;
            }
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
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

        Node ans = ll.nthNode(a, 2);
        System.out.println("_________________________" + ans.data);
        ll.display();
        Node ans1 = ll.nthNodeUsingSlowFast(a, 2);
        System.out.println("_________________________" + ans1.data);

    }
}

/*
 * javac LinkedList\findNthNodefromEnd.java -O(n)
 * java LinkedList\findNthNodefromEnd.java
 */
