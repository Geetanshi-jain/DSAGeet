package LinkedList;

public class implementationOfSllDel {
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

        int getAt(int idx) {
            Node temp = head;
            if (idx < 0 || idx >= size()) {
                System.out.println("wrong index");
                return -1;
            }

            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAt(int idx) {
            if (idx == 0) {
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
            tail = temp;
        }

    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(18);
        ll.insertAtEnd(9);
        ll.insertAtEnd(1);
        ll.insertAtBeg(10);
        
        System.out.println("_________________________");
        ll.display();
        ll.deleteAt(1);

    }
}
