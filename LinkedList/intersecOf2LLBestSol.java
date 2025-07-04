package LinkedList;

public class intersectionOf2LLBestSol {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node getIntersection(Node head1, Node head2) {

        if (head1 == null && head2 == null) {
            return null;
        }
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != temp2) {
            if (temp1 == null) {
                temp1 = head2;
            } else {
                temp1 = temp1.next;
            }

            if (temp2 == null) {
                temp2 = head1;
            } else {
                temp2 = temp2.next;
            }

        }
        return temp1;
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
}
/*
 * javac LinkedList\intersectionOf2LLBestSol.java
 * java LinkedList.intersectionOf2LLBestSol         
 */
