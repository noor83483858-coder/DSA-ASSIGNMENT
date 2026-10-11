import org.w3c.dom.Node;

public class StackLinkedList {

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

Node top = null;

void push(int data) {
    Node newNode = new Node(data);
    newNode.next = top;
    top = newNode;
    System.out.println(data + " pushed");
}

void pop() {
    if (top == null) {
        System.out.println("Stack is empty");
        return;
    }

    System.out.println(top.data + " popped");
    top = top.next;
}

void display() {
    Node temp = top;

    if (temp == null) {
        System.out.println("Stack is empty");
        return;
    }

    while (temp != null) {
        System.out.println(temp.data);
        temp = temp.next;
    }
}

public static void main(String[] args) {
    StackLinkedList stack = new StackLinkedList();

    stack.push(10);
    stack.push(20);
    stack.push(30);

    System.out.println("Stack elements:");
    stack.display();

    stack.pop();

    System.out.println("After pop:");
    stack.display();
}

 }
