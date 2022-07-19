import java.util.ArrayList;
import java.util.LinkedList;

public class GraphBFSDisconnected {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void bfs(ArrayList<ArrayList<Integer>> adj, boolean visited[] , int source) {
        LinkedList<Integer> queue = new LinkedList<>();

        visited[source] = true;
        queue.add(source);

        while(queue.size() != 0) {
            // Pop front element of queue
            source = queue.poll();
            System.out.println(source + " ");
            // Get number of adjacent vertices of current source
            int size = adj.get(source).size();
            for(int i = 0; i < size; i++) {
                // adjacent node
                int adjNode = adj.get(source).get(i);
                // check if node is visited
                if(visited[adjNode] == false) {
                    // if not visited than mark as visited
                    visited[adjNode] = true;
                    // add in queue
                    queue.add(adjNode);
                }
            }

        }
    }

    static void bfs_disconnected(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean visited[] = new boolean[v];
        int island = 0;
        for(int i = 0; i < v; i++) {
            visited[i] = false;
        }

        for(int i = 0; i < v; i++) {
            if(visited[i] == false) {
                bfs(adj, visited, i);
                island++;
            }
        }
        System.out.println("Number of Island : " + island);
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 1, 3);
        addEdge(adj, 4, 5);
        addEdge(adj, 5, 6);
        addEdge(adj, 4, 6);

        bfs_disconnected(adj, V);
    }

}
