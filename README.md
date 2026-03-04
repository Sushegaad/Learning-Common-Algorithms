# Learning Common Algorithms
Learn fundamental algorithms and data structure implementations in Java.

## Author
Hemant Naik

## Project Description

This project contains a collection of fundamental algorithms and data structure implementations in Java. It includes sorting algorithms, string manipulation techniques, and common coding interview problems to help developers understand and practice algorithmic problem-solving.

## Project Structure

```
Source/
├── BubbleSort.java           # Bubble Sort Implementation
├── BinarySearch.java         # Binary Search Implementation
├── HelloWorld.java           # Hello World Program (JDK Test)
├── InsertionSort.java        # Insertion Sort Implementation
├── LengthLastWord.java       # Length of Last Word Problem
├── StringManipulations.java  # String Reversal Algorithm
├── TwoSum.java               # Two Sum Problem
├── MergeSortedLists.java     # Merge Two Sorted Lists (Linked List)
├── BinaryTreeTraversal.java  # In-order, Pre-order, Post-order Traversals
├── MergeSort.java            # Merge Sort Implementation
├── LinkedList.java           # Linked List with Add/Remove Operations
├── DijkstraAlgorithm.java    # Dijkstra's Shortest Path Algorithm
├── QueueUsingStacks.java     # Queue Implementation using Two Stacks
└── HeapSort.java             # Heap Sort Implementation
lib/                         # External Libraries
.git/                        # Git Repository
```

## Algorithms Included

### 1. **Bubble Sort** (`BubbleSort.java`)
- **Description**: A simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
- **Key Concept**: Basic sorting technique with O(n²) time complexity.
- **Example**: Sorts an array of integers `[98, 76, 45, 33, 22, 98, 65, 34, 25, 12]` in ascending order.
- **Output**: Shows each iteration of the sorting process.

### 2. **Binary Search** (`BinarySearch.java`)
- **Description**: An efficient algorithm for finding an element in a sorted array by repeatedly dividing the search interval in half.
- **Key Concept**: Divide-and-conquer approach with O(log n) time complexity.
- **Example**: Searches for `34` in sorted array `[12, 22, 25, 33, 34, 45, 65, 76, 98, 98]`.
- **Output**: Returns the index of the target element or -1 if not found.

### 3. **Insertion Sort** (`InsertionSort.java`)
- **Description**: A simple sorting algorithm that builds the final sorted array one item at a time by inserting elements into their correct positions.
- **Key Concept**: Efficient for small datasets with O(n²) average case and O(n) best case complexity.
- **Advantages**: Simple implementation, in-place sorting, adaptive, stable, and online.
- **Example**: Sorts an array of integers `[98, 76, 45, 33, 22, 98, 65, 34, 25, 12]` in ascending order.
- **Output**: Shows each iteration of the sorting process.

### 4. **Hello World** (`HelloWorld.java`)
- **Description**: A simple Java program to verify JDK setup and Java version.
- **Key Concept**: Basic Java syntax and environment verification.
- **Output**: Prints Hello World message and Java version information.

### 5. **Length of Last Word** (`LengthLastWord.java`)
- **Description**: Finds and returns the length of the last word in a string.
- **Key Concept**: String manipulation and array traversal.
- **Problem Statement**: Given a string with words and spaces, return the length of the last word (maximal substring of non-space characters).
- **Example**: 
  - Input: `"  are the Champions  of the world "`
  - Output: `5` (length of "world")

### 6. **String Manipulations** (`StringManipulations.java`)
- **Description**: Implements string reversal using character array manipulation.
- **Key Concept**: Two-pointer technique for in-place string reversal.
- **Algorithm**: Uses left and right pointers that move towards the center, swapping characters.
- **Example**: `"This string will be reversed."` → `".desrever eb lliw gnirts sihT"`

### 7. **Two Sum** (`TwoSum.java`)
- **Description**: A classic LeetCode problem that finds two numbers in an array that add up to a target sum.
- **Key Concept**: Hash Map-based approach for O(n) time complexity.
- **Algorithm**: Uses a HashMap to store visited numbers and their indices for efficient lookup.
- **Example**:
  - Input Array: `[99, 88, 11, 77, 66, 55, 33, 22, 100]`
  - Target: `122`
  - Output: Indices of the two numbers that sum to the target

### 8. **Merge Sorted Lists** (`MergeSortedLists.java`)
- **Description**: Merges two sorted singly linked lists into one sorted list by re-linking existing nodes.
- **Key Concept**: Iterative two-pointer technique using a dummy head.
- **Example**:
  - Input: `l1 = [1,2,4]`, `l2 = [1,3,4]`
  - Output: `[1,1,2,3,4,4]`

### 9. **Binary Tree Traversal** (`BinaryTreeTraversal.java`)
- **Description**: Demonstrates recursive inorder, preorder, and postorder traversals of a binary tree.
- **Key Concepts**:
  - **Preorder** (node-left-right)
  - **Inorder** (left-node-right)
  - **Postorder** (left-right-node)
- **Example Tree**:
  ```
      1
     / \
    2   3
   / \   \
  4   5   6
  ```
- **Output**:
  - Preorder: `1 2 4 5 3 6`
  - Inorder: `4 2 5 1 3 6`
  - Postorder: `4 5 2 6 3 1`

### 10. **Merge Sort** (`MergeSort.java`)
- **Description**: A divide-and-conquer sorting algorithm that divides the array into halves, recursively sorts them, and merges the sorted subarrays.
- **Time Complexity**: O(n log n) in all cases
- **Space Complexity**: O(n)
- **Key Concept**: Stable sorting algorithm, efficient for large datasets
- **Algorithm Steps**:
  1. Divide the array into two halves
  2. Recursively sort both halves
  3. Merge the sorted halves
- **Example**: `[64, 34, 25, 12, 22, 11, 90]` → `[11, 12, 22, 25, 34, 64, 90]`

### 11. **Linked List** (`LinkedList.java`)
- **Description**: Implementation of a singly linked list with add and remove node operations.
- **Key Operations**:
  - `addNode(int data)` - Add node at the end (O(n))
  - `addNodeAtBeginning(int data)` - Add node at the beginning (O(1))
  - `addNodeAtPosition(int data, int position)` - Add node at specific position (O(n))
  - `removeNode(int data)` - Remove node by value (O(n))
  - `removeNodeAtPosition(int position)` - Remove node at specific position (O(n))
- **Example**: Create a list, add/remove nodes, and display the linked list
- **Use Case**: Foundation for tree and graph data structures

### 12. **Dijkstra's Algorithm** (`DijkstraAlgorithm.java`)
- **Description**: Finds the shortest path from a source vertex to all other vertices in a weighted graph with non-negative edge weights.
- **Time Complexity**: O((V + E) log V) using priority queue
- **Space Complexity**: O(V)
- **Key Concept**: Greedy algorithm using priority queue (min-heap)
- **Algorithm Steps**:
  1. Initialize distances to infinity except source (0)
  2. Use a priority queue to process vertices in order of distance
  3. For each vertex, update distances to adjacent vertices (relaxation)
  4. Mark vertices as visited to avoid reprocessing
- **Example Graph**: 6 vertices with weighted edges finding shortest paths from vertex 0
- **Output**: Shortest distances from source to all reachable vertices

### 13. **Queue Using Two Stacks** (`QueueUsingStacks.java`)
- **Description**: Implementation of a queue (FIFO) data structure using two stacks.
- **Key Operations**:
  - `enqueue(int value)` - Add element to rear (O(1))
  - `dequeue()` - Remove and return front element (Amortized O(1))
  - `peek()` - View front element without removal (Amortized O(1))
  - `isEmpty()` - Check if queue is empty (O(1))
- **Time Complexity**: Amortized O(1) for all operations
- **Key Concept**: Uses stack1 for enqueue and stack2 for dequeue, with lazy element transfer
- **Example Operations**: Enqueue elements, peek at front, dequeue, and test edge cases

### 14. **Heap Sort** (`HeapSort.java`)
- **Description**: Comparison-based sorting algorithm based on the binary heap data structure.
- **Time Complexity**: O(n log n) in all cases
- **Space Complexity**: O(1) - in-place sorting
- **Key Concept**: Builds a max heap and repeatedly extracts the maximum element
- **Algorithm Steps**:
  1. Build a max heap from the input array
  2. Extract maximum element and place it at the end
  3. Reduce heap size and repeat heapification
- **Advantages**: O(n log n) guaranteed time complexity, in-place, no extra space
- **Disadvantage**: Unstable sorting algorithm
- **Example**: `[64, 34, 25, 12, 22, 11, 90, 88]` → `[11, 12, 22, 25, 34, 64, 88, 90]`

## How to Run

Each Java file contains a `main` method and can be run independently:

```bash
# Compile and run any algorithm
javac Source/BubbleSort.java
java -cp . Source.BubbleSort
```

## Requirements

- Java Development Kit (JDK) 8 or higher
- Basic understanding of Java syntax and algorithms

## Topics Covered

- **Sorting**: Bubble Sort, Insertion Sort, Merge Sort, Heap Sort
- **Searching**: Binary Search, Dijkstra's Algorithm
- **String Manipulation**: String Reversal, Length of Last Word
- **Problem Solving**: Two Sum Problem
- **Data Structures**: Arrays, HashMap, Linked List, Queue, Stack, Binary Tree, Weighted Graph, Heap

## License

This project is licensed under the MIT License.

---
*Last Updated: March 2026*