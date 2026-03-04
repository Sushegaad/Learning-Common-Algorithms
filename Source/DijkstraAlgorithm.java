package Source;
import java.util.*;

/**
 * Dijkstra's Algorithm Implementation
 * Finds the shortest path from a source vertex to all other vertices in a weighted graph
 * Time Complexity: O((V + E) log V) using priority queue
 * Space Complexity: O(V)
 * Constraint: No negative edge weights
 */
public class DijkstraAlgorithm {
    
    private static final int INF = Integer.MAX_VALUE;

    /**
     * Graph representation using adjacency list
     */
    static class Graph {
        int vertices;
        List<List<Edge>> adjacencyList;
        
        Graph(int vertices) {
            this.vertices = vertices;
            this.adjacencyList = new ArrayList<>();
            for (int i = 0; i < vertices; i++) {
                adjacencyList.add(new ArrayList<>());
            }
        }
        
        /**
         * Add an edge to the graph
         * @param source source vertex
         * @param destination destination vertex
         * @param weight weight of the edge
         */
        void addEdge(int source, int destination, int weight) {
            adjacencyList.get(source).add(new Edge(destination, weight));
            // Uncomment for undirected graph:
            // adjacencyList.get(destination).add(new Edge(source, weight));
        }
    }
    
    /**
     * Edge class to represent a weighted edge
     */
    static class Edge {
        int destination;
        int weight;
        
        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }
    
    /**
     * Node class for priority queue
     */
    static class Node implements Comparable<Node> {
        int vertex;
        int distance;
        
        Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
        
        @Override
        public int compareTo(Node other) {
            return this.distance - other.distance;
        }
    }
    
    /**
     * Dijkstra's algorithm using Priority Queue
     * @param graph the input graph
     * @param source the source vertex
     * @return array of shortest distances from source to all vertices
     */
    public static int[] dijkstra(Graph graph, int source) {
        int[] distances = new int[graph.vertices];
        boolean[] visited = new boolean[graph.vertices];
        
        // Initialize distances
        Arrays.fill(distances, INF);
        distances[source] = 0;
        
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(source, 0));
        
        while (!pq.isEmpty()) {
            Node current = pq.poll();
            
            if (visited[current.vertex]) {
                continue;
            }
            
            visited[current.vertex] = true;
            
            // Check all adjacent vertices
            for (Edge edge : graph.adjacencyList.get(current.vertex)) {
                int destination = edge.destination;
                int weight = edge.weight;
                
                // Relaxation step
                if (!visited[destination] && distances[current.vertex] != INF &&
                    distances[current.vertex] + weight < distances[destination]) {
                    distances[destination] = distances[current.vertex] + weight;
                    pq.offer(new Node(destination, distances[destination]));
                }
            }
        }
        
        return distances;
    }
    
    /**
     * Print the shortest distances
     * @param distances array of distances
     * @param source the source vertex
     */
    public static void printDistances(int[] distances, int source) {
        System.out.println("Shortest distances from vertex " + source + ":");
        for (int i = 0; i < distances.length; i++) {
            if (distances[i] == INF) {
                System.out.println("Vertex " + i + ": INF");
            } else {
                System.out.println("Vertex " + i + ": " + distances[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        
        // Add edges (source, destination, weight)
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 2);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 5);
        graph.addEdge(2, 3, 8);
        graph.addEdge(2, 4, 10);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 5, 3);
        graph.addEdge(3, 5, 6);
        
        int source = 0;
        int[] distances = dijkstra(graph, source);
        printDistances(distances, source);
    }
}
