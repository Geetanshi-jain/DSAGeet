package QueueImp;

public class Cque {

    private final int n = 4;
    private int f = -1;
    private int r = -1;
    private int[] arr = new int[n];

    public void add(int val) {
        // Full condition
        if ((r + 1) % n == f) {
            System.out.println("Queue is full");
            return;
        }

        if (f == -1) {
            f = r = 0;
        } else {
            r = (r + 1) % n;
        }

        arr[r] = val;
    }

    public int remove() {
        if (f == -1) {
            System.out.println("Queue is empty");
            return -1;
        }

        int val = arr[f];

        if (f == r) {
            f = r = -1; // Queue becomes empty
        } else {
            f = (f + 1) % n;
        }

        return val;
    }

    public int peek() {
        if (f == -1) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[f];
    }

    public void display() {
        if (f == -1) {
            System.out.println("Queue is empty");
            return;
        } else {
            if (f <= r) {
                for (int i = f; i <= r; i++) {
                    System.out.println(arr[i]);
                }
            } else if (r < f) {
                for (int i = f; i < arr.length - 1; i++) {
                    System.out.println(arr[i]);
                }
                for (int i = 0; i < r; i++) {
                    System.out.println(arr[i]);
                }
            }

        }
    }

    public static void main(String[] args) {
        Cque c = new Cque();

        c.display(); // Empty
        c.add(10);
        c.add(30);
        c.add(12);
        c.display(); // Queue: 10 30 12
        System.out.println("Peek: " + c.peek()); // Peek: 10

        c.remove();
        c.add(99);
        c.add(77); // Should show Queue is full if exceeded
        c.display(); // Queue after wrap-around
    }
}
/*
 * javac QueueImp\Cque.java
 * java QueueImp.Cque
 * 
 */
