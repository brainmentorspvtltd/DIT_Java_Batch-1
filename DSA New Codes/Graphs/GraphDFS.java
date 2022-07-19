import java.util.ArrayList;
import java.util.LinkedList;

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
                dfs(adj, s, visited);
            }
        }
    }

    static void dfsCall(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean visited[] = new boolean[v];
        int source = 1;
        for(int i = 1; i < v; i++) {
            visited[i] = false;
        }
        dfs(adj, source, visited);
    }

}
