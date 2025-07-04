package LinkedList;

public class findmiddleOFLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node middleElm(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            /*
             * in this case when even Elm -this mthd return right middle
             * if I want to print left middle then fast.next.next!=null
             */
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {

        Node a = new Node(5);

        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(8);
        Node e = new Node(10);
        Node f = new Node(11);
        // 5->3->4->8->10
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println("middle elm = " + middleElm(a).data);

    }
}
/* javac LinkedList\intersectionOf2LLBestSol.java */
