public class QueueLinkedList {
    class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

Node front = null;
Node rear = null;

void enqueue(int data) {
    Node newNode = new Node(data);

    if (rear == null) {
        front = rear = newNode;
    } else {
        rear.next = newNode;
        rear = newNode;
    }

    System.out.println(data + " added");
}

void dequeue() {
    if (front == null) {
        System.out.println("Queue is empty");
        return;
    }

    System.out.println(front.data + " removed");
    front = front.next;

    if (front == null) {
        rear = null;
    }
}

void display() {
    Node temp = front;

    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }

    System.out.println();
}

public static void main(String[] args) {
    QueueLinkedList q = new QueueLinkedList();

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);

    System.out.println("Queue elements:");
    q.display();

    q.dequeue();

    System.out.println("After dequeue:");
    q.display();
}
    
}
