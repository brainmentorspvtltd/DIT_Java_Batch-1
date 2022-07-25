import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class CloneGraph {
    public Node cloneGraph(Node source) {
        LinkedList<Node> q = new LinkedList<>();
        q.add(source);
        HashMap<Node, Node> hm = new HashMap<>();
        hm.put(source, new Node(source.val));
        while(!q.isEmpty()) {
            // get the front node from queue and visit its neighbours
            Node u = q.poll();
            // get corresponding cloned node from hashmap
            Node cloneNodeU = hm.get(u);
            if(u.neighbors != null) {
                List<Node>v = u.neighbors;
                for(Node node : v) {
                    Node cloneNodeG = hm.get(node);
                    if(cloneNodeG == null) {
                        q.add(node);
                        
                        cloneNodeG = new Node(node.val);
                        hm.put(node, cloneNodeG);
                    }
                    // add the cloneNodeG to neighbour
                    cloneNodeU.neighbors.add(cloneNodeG);
                }
            }
            
        }
        return hm.get(source);
    }
}
