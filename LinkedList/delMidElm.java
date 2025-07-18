public class delMidElm {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void delMidElmNode(Node head) {
        Node slow = head;
        Node fast = head;
        if (head == null || head.next == null) {
            return;
        }
        while (fast.next.next != null && fast.next.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;

    }

    public static void display(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(8);
        Node e = new Node(10);
        Node f = new Node(20);
        // 5->3->4->8->10

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        delMidElmNode(a);
        display(a);

    }

}
