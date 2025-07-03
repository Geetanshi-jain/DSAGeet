package LinkedList;

public class findLentthOfLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static int length(Node a) {
        int count = 0;
        while (a != null) {
            count++;
            a = a.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(13);
        Node c = new Node(1);
        Node d = new Node(2);

        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println("length = " + length(a));

    }

}
/* javac LinkedList\findLentthOfLL.java */
/* java LinkedList.findLentthOfLL*/
