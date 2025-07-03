#include <iostream>
using namespace std;

const int MAX_SIZE = 100; // Renamed to avoid conflict with std::max

struct item {
    int data;
    int p_no;
};

class Pqueue {
    item p[MAX_SIZE];
    int f, r;

public:
    Pqueue();                      // Constructor
    void add_item(int, int);      // Add an item with data and priority
    item del_item();              // Delete item with highest priority
    void sort();                  // Sort by priority
    void display();               // Display the queue
};

// Constructor
Pqueue::Pqueue() {
    f = r = -1;
    for (int i = 0; i < MAX_SIZE; i++) {
        p[i].data = -1;
        p[i].p_no = -1;
    }
}

// Add item
void Pqueue::add_item(int d, int pr) {
    if (r == MAX_SIZE - 1) {
        cout << "Queue is full\n";
        return;
    } else {
        r++;
        p[r].data = d;
        p[r].p_no = pr;
    }
    if (f == -1) f = 0;
    sort();
}

// Delete item
item Pqueue::del_item() {
    if (f == -1) {
        cout << "Queue is empty\n";
        return { -1, -1 };
    } else {
        item temp = p[f];
        p[f].data = -1;
        p[f].p_no = -1;
        if (f == r) {
            f = r = -1;
        } else {
            f++;
        }
        return temp;
    }
}

// Sort by priority (ascending: lower p_no = higher priority)
void Pqueue::sort() {
    for (int i = f; i <= r; i++) {
        for (int j = i + 1; j <= r; j++) {
            if (p[i].p_no > p[j].p_no) {
                item temp = p[i];
                p[i] = p[j];
                p[j] = temp;
            }
        }
    }
}

// Display
void Pqueue::display() {
    if (f == -1) {
        cout << "Queue is empty\n";
        return;
    }
    cout << "Queue contents (data : priority):\n";
    for (int i = f; i <= r; i++) {
        cout << p[i].data << " : " << p[i].p_no << "\n";
    }
}

// Main function
int main() {
    Pqueue q;

    q.add_item(10, 2);
    q.add_item(5, 1);
    q.add_item(20, 3);

    q.display();

    item removed = q.del_item();
    cout << "Deleted item: " << removed.data << " with priority: " << removed.p_no << "\n";

    q.display();

    return 0;
}
