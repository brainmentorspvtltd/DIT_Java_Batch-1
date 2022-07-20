import java.util.ArrayList;
import java.util.LinkedList;

public class ShortestPathInUnweightedGraph {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void bfs(ArrayList<ArrayList<Integer>> adj, int v, int source, int []distance) {
        boolean visited[] = new boolean[v+1];
        for(int i = 1; i <= v; i++) {
            visited[i] = false;
        }

        LinkedList<Integer> queue = new LinkedList<>();

        visited[source] = true;
        queue.add(source);

        while(queue.size() != 0) {
            source = queue.poll();
            System.out.println(source + " ");
            int size = adj.get(source).size();
            for(int i = 0; i < size; i++) {
                int adjNode = adj.get(source).get(i);
                if(visited[adjNode] == false) {
                    distance[adjNode] = distance[source] + 1;
                    visited[adjNode] = true;
                    queue.add(adjNode);
                }
            }

        }

    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

        for(int i = 0; i < V+1; i++) {
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 0, 4);
        addEdge(adj, 2, 5);
        addEdge(adj, 3, 5);
        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 5, 6);

        int source = 0;
        int []distance = new int[V];

        for(int i = 0; i < V; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[source] = 0;

        bfs(adj, V, source, distance);
        for(int i : distance) {
            System.out.print(i + ", ");
        }

    }
}
