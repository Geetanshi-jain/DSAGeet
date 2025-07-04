package LinkedList;

public class intersecOF2LL {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public static Node getIntersection(Node head1, Node head2) {

        int len1 = getLength(head1);
        int len2 = getLength(head2);

        while (len1 > len2) {
            head1 = head1.next;
            len1--;
        }
        while (len2 > len1) {
            head2 = head2.next;
            len2--;
        }
        while (head1 != null && head2 != null) {
            if (head1 == head2) {
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Node common = new Node(15);
        common.next = new Node(30);

        Node head1 = new Node(10);
        head1.next = common;

        Node head2 = new Node(3);
        head2.next = new Node(4);
        head2.next.next = common;

        Node intersection = getIntersection(head1, head2);
        if (intersection != null) {
            System.out.println("Intersection at node with data: " + intersection.val);
        } else {
            System.out.println("No intersection");
        }

    }

    /* hint 1: find the length of both LL
     * hint2 :
     */
}
