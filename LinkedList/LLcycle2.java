
public class LLcycle2 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {

                Node temp = head;
                while (temp != slow) {
                    temp = temp.next;
                    slow = slow.next;

                }
            }
            return slow;
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
        e.next = b;
        // 5->3->4->8->10->3
        System.out.println(hasCycle(a).data);

    }

}
