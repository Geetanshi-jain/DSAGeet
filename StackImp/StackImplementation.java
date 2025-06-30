
class MyStack {
    int top;
    int[] stack;
    int capacity;

    MyStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    void push(int value) {
        if (top >= capacity - 1) {
            System.out.println("stack underflow");
        } else {
            stack[++top] = value;
            System.out.println(value + " ");
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("stack underflow");
            return -1;
        } else {
            return stack[top--];
        }
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is ");
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        }
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(10);
        s.push(2);
        s.display();
        System.out.println("poped" + s.pop());
        System.out.println("top" + s.peek());
        s.display();
    }

}
