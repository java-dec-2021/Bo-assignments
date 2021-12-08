

public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void printValues() {
        Node node = head;
        while(node.next != null) {
            System.out.println(node.value);
            node = node.next;
        }
        System.out.println(node.value);
    }


    public int remove() {
        Node runner = head;
        int removeNode;

        while(runner.next.next != null) {
            runner = runner.next;
        }
        removeNode = runner.next.value;
        runner.next = null;

        return removeNode;
    }

}