import java.util.ArrayList;
import java.util.LinkedList;

public class GraphBFS {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void bfs(ArrayList<ArrayList<Integer>> adj, int v) {
        // Step 1 : Initialize visited array and mark false initially
        boolean visited[] = new boolean[v+1];
        for(int i = 1; i <= v; i++) {
            visited[i] = false;
        }

        // Step 2 : Initialize a queue and push source in it
        // and mark true for source in visited array
        LinkedList<Integer> queue = new LinkedList<>();
        int source = 1;

        visited[source] = true;
        queue.add(source);

        while(queue.size() != 0) {
            // Step 3 : Pop front element of queue
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

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

        for(int i = 0; i < V+1; i++) {
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 2, 5);
        addEdge(adj, 3, 5);
        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 5, 6);

        bfs(adj, V);

    }

}
