package Source;
import java.util.Stack;

/**
 * Queue Implementation using Two Stacks
 * Implements standard queue operations: enqueue, dequeue, peek, isEmpty
 * Time Complexity: Amortized O(1) for all operations
 * Space Complexity: O(n)
 */
public class QueueUsingStacks {
    
    private Stack<Integer> stack1; // For enqueue
    private Stack<Integer> stack2; // For dequeue
    
    /**
     * Constructor - Initialize two stacks
     */
    public QueueUsingStacks() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }
    
    /**
     * Enqueue operation - Add element to the rear of queue
     * @param value the value to be added
     */
    public void enqueue(int value) {
        stack1.push(value);
        System.out.println("Enqueued: " + value);
    }
    
    /**
     * Helper method to move elements from stack1 to stack2
     */
    private void moveElements() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }
    
    /**
     * Dequeue operation - Remove and return element from the front of queue
     * @return the removed element
     */
    public Integer dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        
        moveElements();
        int value = stack2.pop();
        System.out.println("Dequeued: " + value);
        return value;
    }
    
    /**
     * Peek operation - View element at the front without removing it
     * @return the front element, or null if queue is empty
     */
    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        
        moveElements();
        int value = stack2.peek();
        System.out.println("Front element: " + value);
        return value;
    }
    
    /**
     * Check if the queue is empty
     * @return true if queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
    
    /**
     * Get the size of the queue
     * @return total number of elements in the queue
     */
    public int size() {
        return stack1.size() + stack2.size();
    }
    
    /**
     * Display all elements in the queue
     */
    public void display() {
        System.out.println("Queue size: " + size());
        System.out.println("Stack1 (enqueue side): " + stack1);
        System.out.println("Stack2 (dequeue side): " + stack2);
        System.out.println();
    }
    
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        
        System.out.println("=== Queue Using Two Stacks ===\n");
        
        // Test enqueue
        System.out.println("--- Enqueuing elements ---");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();
        
        // Test peek
        System.out.println("--- Peeking ---");
        queue.peek();
        queue.display();
        
        // Test dequeue
        System.out.println("--- Dequeueing elements ---");
        queue.dequeue();
        queue.dequeue();
        queue.display();
        
        // Test enqueue after dequeue
        System.out.println("--- Enqueuing more elements ---");
        queue.enqueue(60);
        queue.enqueue(70);
        queue.display();
        
        // Test isEmpty
        System.out.println("--- Testing isEmpty ---");
        System.out.println("Is queue empty? " + queue.isEmpty());
        queue.display();
        
        // Dequeue all remaining elements
        System.out.println("--- Dequeueing all remaining elements ---");
        while (!queue.isEmpty()) {
            queue.dequeue();
        }
        
        // Test operations on empty queue
        System.out.println("\n--- Operations on empty queue ---");
        queue.peek();
        queue.dequeue();
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
