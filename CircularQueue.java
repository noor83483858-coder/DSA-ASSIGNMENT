public class CircularQueue {

int[] queue = new int[5];
int front = -1;
int rear = -1;
int size = 5;

void enqueue(int data) {
    if ((rear + 1) % size == front) {
        System.out.println("Queue is full");
        return;
    }

    if (front == -1) {
        front = 0;
    }

    rear = (rear + 1) % size;
    queue[rear] = data;
    System.out.println(data + " added");
}

void dequeue() {
    if (front == -1) {
        System.out.println("Queue is empty");
        return;
    }

    System.out.println(queue[front] + " removed");

    if (front == rear) {
        front = rear = -1;
    } else {
        front = (front + 1) % size;
    }
}

void display() {
    if (front == -1) {
        System.out.println("Queue is empty");
        return;
    }

    int i = front;

    while (true) {
        System.out.print(queue[i] + " ");

        if (i == rear) {
            break;
        }

        i = (i + 1) % size;
    }

    System.out.println();
}

public static void main(String[] args) {
    CircularQueue q = new CircularQueue();

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);

    System.out.println("Circular Queue:");
    q.display();

    q.dequeue();

    System.out.println("After dequeue:");
    q.display();
}

}