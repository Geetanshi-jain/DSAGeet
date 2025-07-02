package QueueImp;

public class circularQue {

    public static class Cqa {
        int f = -1;
        int r = -1;
        int size = 0;

        int arr[] = new int[10];

        public void add(int x) {
            if (size == arr.length) {
                System.out.println("Queue is full");
                return;
            } else if (size == 0) {
                f = r = 0;
                arr[0] = x;
            } else if (r < arr.length - 1) {
                arr[++r] = x;
            } else if (r == arr.length - 1) {
                r = 0;
                arr[0] = x;
            }
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                int val = arr[f];
                if (f == arr.length - 1)
                    f = 0;
                else
                    f++;
                size--;
                return val;
            }

        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            } else {
                return arr[f];
            }
        }

        public void display() {
            if (size == 0) {
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
    }

    public static void main(String[] args) {
        Cqa c = new Cqa();
        c.display();
        c.add(10);
        c.add(30);
        c.add(12);
        c.display();
        System.out.println(c.peek());
        c.remove();
        c.display();

    }

}
/*
 * javac QueueImp\circularQue.java
 * java QueueImp.circularQue
 * 
 */
