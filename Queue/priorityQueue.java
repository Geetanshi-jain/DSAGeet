package QueueImp;

class Item {
    int data;
    int priority;

    Item(int data, int priority) {
        this.data = data;
        this.priority = priority;
    }
}

class PQueue {
    final int MAX_SIZE = 100;
    Item[] queue = new Item[MAX_SIZE];
    int front, rear;

    PQueue() {
        front = rear = -1;
        for (int i = 0; i < MAX_SIZE; i++) {
            queue[i] = new Item(-1, -1);
        }
    }

    void addItem(int data, int priority) {
        if (rear == MAX_SIZE - 1) {
            System.out.println("Queue is full");
            return;
        } else {
            rear++;
            queue[rear] = new Item(data, priority);
        }

        if (front == -1)
            front = 0;
        sort();
    }

    Item deleteItem() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return new Item(-1, -1);
        }

        Item temp = queue[front];
        queue[front] = new Item(-1, -1);

        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }

        return temp;
    }

    void sort() {
        for (int i = front; i <= rear; i++) {
            for (int j = i + 1; j <= rear; j++) {
                if (queue[i].priority > queue[j].priority) {
                    Item temp = queue[i];
                    queue[i] = queue[j];
                    queue[j] = temp;
                }
            }
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue contents (data : priority):");
        for (int i = front; i <= rear; i++) {
            if (queue[i].data != -1)
                System.out.println(queue[i].data + " : " + queue[i].priority);
        }
    }
}

// Main class renamed to priorityQueue
public class priorityQueue {
    public static void main(String[] args) {
        PQueue q = new PQueue();

        q.addItem(10, 2);
        q.addItem(5, 1);
        q.addItem(20, 3);

        q.display();

        Item removed = q.deleteItem();
        System.out.println("Deleted item: " + removed.data + " with priority: " + removed.priority);

        q.display();
    }
}
