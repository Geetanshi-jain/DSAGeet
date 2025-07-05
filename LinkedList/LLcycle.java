
public class LLcycle {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null) {

            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        Node a = new Node(5);
        // Node b = new Node(3);
        // Node c = new Node(4);
        /*
         * Node d = new Node(8);
         * Node e = new Node(10);
         * Node f = new Node(20);
         * // 5->3->4->8->10
         * 
         * a.next = b;
         * b.next = c;
         * c.next = d;
         * d.next = e;
         * e.next = b;
         */
        System.out.println(hasCycle(a));

    }

}
