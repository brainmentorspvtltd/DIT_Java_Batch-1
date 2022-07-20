import java.util.ArrayList;

public class GraphDFS {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void dfs(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.println(s);
        for(int item : adj.get(s)) {
            if(visited[item] == false) {
                dfs(adj, item, visited);
            }
        }
    }

    static void dfsCall(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean visited[] = new boolean[v];
        int source = 0;
        for(int i = 0; i < v; i++) {
            visited[i] = false;
        }
        dfs(adj, source, visited);
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 4);
        addEdge(adj, 3, 5);
        addEdge(adj, 4, 5);

        dfsCall(adj, V);
    }

}
