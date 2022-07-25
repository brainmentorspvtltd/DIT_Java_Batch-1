import java.util.Arrays;

public class DijkstraAlgorithm {

    static int[] dijsktra(int graph[][], int V, int source) {
        int []distances = new int[V];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;
        boolean set[] = new boolean[V];
        for(int i = 0; i < V; i++) {
            int u = -1;
            for(int j = 0; j < V; j++) {
                if(!set[j] && (u == -1 || distances[j] < distances[u])) {
                    u = j;
                }
            }
            set[u] = true;
            for(int v = 0; v < V; v++) {
                if(graph[u][v] != 0 && set[v] == false) {
                    distances[v] = Math.min(distances[v], distances[u] + graph[u][v]);
                }
            }
        }
        return distances;
    }

    public static void main(String[] args) {
        int graph[][] = {
            {0, 50, 100, 0},
            {50, 0, 30, 200},
            {100, 30, 0, 20},
            {0, 200, 20, 0}
        };
        int V = 4;
        int result[] = dijsktra(graph, V, 0);
        for(int i : result) {
            System.out.print(i + ",");
        }

    }
}
