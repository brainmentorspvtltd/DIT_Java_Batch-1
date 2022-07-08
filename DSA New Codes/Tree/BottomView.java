package Tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Node {
    int data;
    int hd;
    Node left;
    Node right;
    public Node(int data) {
        this.data = data;
        this.hd = 0;
        left = right = null;
    }
}

public class BottomView {
    void bottomView(Node root) {
        if(root == null){
            return;
        }
        // Horizontal Distance
        int hd = 0;
        
        Map<Integer, Integer> map = new TreeMap<>();

        // Queue to store tree nodes in level order
        Queue<Node> queue = new LinkedList<>();
        root.hd = hd;
        queue.add(root);

        while(!queue.isEmpty()) {
            Node temp = queue.remove();

            // extract horizontal distance from dequeued tree node
            hd = temp.hd;

            // put the dequeued tree node into TreeMap
            // having key as horizontal distance. Every time we find a node
            // having same horizontal distance we need to replace the data
            // in map
            map.put(hd, temp.data);

            if(temp.left != null) {
                temp.left.hd = hd - 1;
                queue.add(temp.left);
            }
            if(temp.right != null) {
                temp.right.hd = hd + 1;
                queue.add(temp.right);
            }

        }

    }
}
