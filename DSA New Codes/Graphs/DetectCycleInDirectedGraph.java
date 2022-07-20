import java.util.ArrayList;

public class DetectCycleInDirectedGraph {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        // adj.get(v).add(u);
    }

    static boolean dfsRec(ArrayList<ArrayList<Integer>> adj, int source, boolean[] visited, boolean recursionStack[]) {
        visited[source] = true;
        recursionStack[source] = true;

        for(int item : adj.get(source)) {
            if(visited[item] == false && dfsRec(adj, item, visited, recursionStack) == true) {
                return true;
            }
            else if(recursionStack[item]) {
                return true;
            }
        }
        recursionStack[source] = false;

        return false;
    }

    static boolean dfsCall(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean visited[] = new boolean[v];
        for(int i = 0; i < v; i++) {
            visited[i] = false;
        }

        boolean recursionStack[] = new boolean[v];
        for(int i = 0; i < v; i++) {
            recursionStack[i] = false;
        }

        for(int i = 0; i < v; i++) {
            if(visited[i] == false) {
                if(dfsRec(adj, i, visited, recursionStack)) {
                    return true;
                }
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 2, 1);
        addEdge(adj, 2, 3);

        System.out.println(dfsCall(adj, V));
    }
}
