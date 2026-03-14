public class  q139_IntroLinkedLIst{

    // Node class
    public class Node {
        int val;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    // Add element at beginning
    public void addFirst(int item) {
        Node nn = new Node();
        nn.val = item;

        if (size == 0) {
            head = nn;
            tail = nn;
        } else {
            nn.next = head;
            head = nn;
        }

        size++;
    }

    // Add element at end
    public void addLast(int item) {
        Node nn = new Node();
        nn.val = item;

        if (size == 0) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }

        size++;
    }

    // Get node at index
    private Node getNode(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node temp = head;

        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }

        return temp;
    }

    // Add element at specific index
    public void addAtIndex(int idx, int item) {
        if (idx < 0 || idx > size) {
            throw new IndexOutOfBoundsException();
        }

        if (idx == 0) {
            addFirst(item);
            return;
        }

        if (idx == size) {
            addLast(item);
            return;
        }

        Node nn = new Node();
        nn.val = item;

        Node temp = getNode(idx - 1);

        nn.next = temp.next;
        temp.next = nn;

        size++;
    }

    // Display linked list
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Get first element
    public int getFirst() {
        if (size == 0) {
            throw new IndexOutOfBoundsException();
        }

        return head.val;
    }

    // Get last element
    public int getLast() {
        if (size == 0) {
            throw new IndexOutOfBoundsException();
        }

        return tail.val;
    }

    // Get element at index
    public int getAtIndex(int idx) {
        Node temp = getNode(idx);
        return temp.val;
    }

    // Remove first element
    public int removeFirst() {
        if (size == 0) {
            throw new IndexOutOfBoundsException();
        }

        int val = head.val;

        head = head.next;
        size--;

        if (size == 0) {
            tail = null;
        }

        return val;
    }

    // Remove last element
    public int removeLast() {
        if (size == 0) {
            throw new IndexOutOfBoundsException();
        }

        if (size == 1) {
            int val = head.val;
            head = null;
            tail = null;
            size--;
            return val;
        }

        Node temp = getNode(size - 2);

        int val = tail.val;

        temp.next = null;
        tail = temp;

        size--;

        return val;
    }

    // Remove element at index
    public int removeAtIndex(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (idx == 0) {
            return removeFirst();
        }

        if (idx == size - 1) {
            return removeLast();
        }

        Node temp = getNode(idx - 1);

        int val = temp.next.val;

        temp.next = temp.next.next;

        size--;

        return val;
    }

    // Main method for testing
    public static void main(String[] args) {

        Linked_List list = new Linked_List();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(40);

        list.display();

        list.addAtIndex(2, 50);
        list.display();

        list.removeFirst();
        list.display();

        list.removeLast();
        list.display();

        list.removeAtIndex(1);
        list.display();
    }
}