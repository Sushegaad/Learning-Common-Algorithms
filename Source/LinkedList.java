package Source;
/**
 * LinkedList Implementation
 * Supports basic operations: add node, remove node, display
 * Time Complexity: O(n) for most operations
 */
public class LinkedList {
    
    /**
     * Node class to represent each element in the linked list
     */
    private class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node head;
    
    /**
     * Add a node at the end of the list
     * @param data the value to be added
     */
    public void addNode(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    
    /**
     * Add a node at the beginning of the list
     * @param data the value to be added at the beginning
     */
    public void addNodeAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    /**
     * Add a node at a specific position (0-indexed)
     * @param data the value to be added
     * @param position the position at which to insert
     */
    public void addNodeAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        
        Node newNode = new Node(data);
        
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }
        
        newNode.next = current.next;
        current.next = newNode;
    }
    
    /**
     * Remove a node by value (removes first occurrence)
     * @param data the value to be removed
     * @return true if node was removed, false otherwise
     */
    public boolean removeNode(int data) {
        if (head == null) {
            return false;
        }
        
        // If head needs to be removed
        if (head.data == data) {
            head = head.next;
            return true;
        }
        
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        
        return false;
    }
    
    /**
     * Remove a node at a specific position (0-indexed)
     * @param position the position of the node to remove
     * @return true if node was removed, false otherwise
     */
    public boolean removeNodeAtPosition(int position) {
        if (position < 0 || head == null) {
            return false;
        }
        
        if (position == 0) {
            head = head.next;
            return true;
        }
        
        Node current = head;
        for (int i = 0; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }
        
        if (current.next == null) {
            return false;
        }
        
        current.next = current.next.next;
        return true;
    }
    
    /**
     * Display all nodes in the linked list
     */
    public void display() {
        Node current = head;
        System.out.print("LinkedList: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    /**
     * Get the size of the linked list
     * @return the number of nodes
     */
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Add nodes
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.display();
        
        // Add node at beginning
        list.addNodeAtBeginning(5);
        list.display();
        
        // Add node at position
        list.addNodeAtPosition(15, 2);
        list.display();
        
        // Remove node by value
        System.out.println("\nRemoving node with value 20:");
        list.removeNode(20);
        list.display();
        
        // Remove node at position
        System.out.println("Removing node at position 1:");
        list.removeNodeAtPosition(1);
        list.display();
        
        System.out.println("Size of list: " + list.size());
    }
}
