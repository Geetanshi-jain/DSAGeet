package LinkedList;

/* insert methd implementaion - Atbeg,Atidx,AtEnd */
/* Tc of inssertAtBeg ,when head is given  =O(1) 
 * Tc of inssertAtEnd ,when tail is given =O(1)
 * Tc of inssertAtidx =O(n)
 * * Tc of length or size =O(n)
*/

public class implementationOfSll {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class linkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int data) {
            // if tail node is given
            Node temp = new Node(data);
            if (head == null) {
                head = temp;

            } else {
                tail.next = temp;

            }
            tail = temp;

        }

        void insertAtBeg(int data) {
            // if tail node is given
            Node temp = new Node(data);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            tail = temp;
        }

        void insertAtidx(int idx, int val) {
            if (idx < 0 || idx > size()) {
                System.out.println("wrong index");
                return;
            }
            if (idx == 0) {
                insertAtBeg(val);
                return;
            }
            if (idx == size()) {
                insertAtEnd(val);
                return;
            }
            Node t = new Node(val);
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        int size() {
            Node temp = head;
            int ctn = 0;
            while (temp != null) {
                ctn = ctn + 1;
                temp = temp.next;
            }
            return ctn;
        }

    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(18);
        ll.insertAtEnd(9);
        ll.insertAtEnd(1);
        System.out.println("_________________________");
        ll.display();
        System.out.println("LL size= " + ll.size());
        System.out.println("_________________________");
        ll.insertAtBeg(10);
        ll.insertAtidx(2, 5);
        System.out.println("_________________________");
        System.out.println("ll size= " + ll.size());
        System.out.println("_________________________");
        ll.display();
        System.out.println("_________________________");
    }

}
