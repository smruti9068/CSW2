package assignment8;

import java.util.*;

class Graph1 {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency list

    public Graph1(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    public void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    // Breadth-first search (BFS)
    public void BFS(int start) {
        boolean[] visited = new boolean[V];
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");

            for (int neighbor : adjList[v]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // Read graph and store it in adjacency list representation
    public void readGraph(Scanner scanner) {
        System.out.println("Enter the number of vertices:");
        int vertices = scanner.nextInt();
        System.out.println("Enter the number of edges:");
        int edges = scanner.nextInt();

        System.out.println("Enter " + edges + " edges (format: from to):");
        for (int i = 0; i < edges; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            addEdge(from, to);
        }
    }
}

public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a graph
        System.out.println("Enter the number of vertices:");
        int V = scanner.nextInt();
        Graph1 graph = new Graph1(V);

        // Read graph
        graph.readGraph(scanner);

        // Perform breadth-first search (BFS)
        System.out.println("Breadth-First Search (BFS) starting from vertex 0:");
        graph.BFS(0);

        scanner.close();
    }
}
