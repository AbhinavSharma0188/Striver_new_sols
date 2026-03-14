public class q140_Insertion {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    int size = 0;

    // Insert at beginning
    public void addFirst(int val) {
        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;

        size++;
    }

    // Insert at end
    public void addLast(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        size++;
    }

    // Insert at specific position
    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size) {
            System.out.println("Invalid Index");
            return;
        }

        if (index == 0) {
            addFirst(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        size++;
    }

    // Print Linked List
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        q140_Insertion list = new q140_Insertion();

        list.addFirst(10);
        list.addFirst(5);

        list.addLast(20);
        list.addLast(30);

        list.addAtIndex(2, 15);

        list.display();
    }
}