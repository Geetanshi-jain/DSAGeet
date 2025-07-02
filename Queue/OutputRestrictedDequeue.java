package QueueImp;

/*Insertion दोनों तरफ से (front और rear) allowed है
Deletion केवल front से allowed है */
public class OutputRestrictedDequeue {
    int arr[];
    int f, r, size;

    public OutputRestrictedDequeue(int capacity) {
        arr = new int[capacity];
        size = capacity;
        f = -1;
        r = -1;
    }

    public void insertRear(int val) {
        if ((f == 0 && r == size - 1) || (r + 1) % size == f) {
            System.out.println("deque is full");
            return;
        }
        if (f == -1) {
            f = r = 0;
        } else {
            r = (r + 1) % size;
        }
        arr[r] = val;

    }

    // Insert at front
    public void insertFront(int val) {
        if ((f == 0 && r == size - 1) || (r + 1) % size == f) {
            System.out.println("Dequeue is full ");
            return;
        }
        if (f == -1) {
            f = r = 0;
        } else if (f == 0) {
            f = size - 1;
        } else {
            f--;
        }
        arr[f] = val;
        System.out.println("Inserted at front" + val);
    }

    public void deleteFront() {
        if (f == -1) {
            System.out.println("deque is empty ");
            return;
        }

        if (f == r) {
            f = r = -1;
        } else {
            f = (f + 1) % size;
        }
    }

    public void display() {
        if (f == -1) {
            System.out.println("dequeue is empty");
            return;
        }
        for (int i = f; i < r; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        OutputRestrictedDequeue dq = new OutputRestrictedDequeue(5);

        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.insertFront(1);
        dq.display();

        dq.deleteFront(); // delete 1
        dq.display();

    }

}
/*	javac QueueImp/OutputRestrictedDequeue.java
Run	java QueueImp.OutputRestrictedDequeue */
