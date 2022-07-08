package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class VerticalOrderIterative {
    TreeNode node = null;
    int dist = 0;
    VerticalOrderIterative(TreeNode node, int dist) {
        this.node = node;
        this.dist = dist;
    }

    void traverse(TreeNode root) {
        LinkedList<VerticalOrderIterative> queue = new LinkedList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        int minDist = 0, maxDist = 0;
        queue.add(new VerticalOrderIterative(root, 0));

        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                VerticalOrderIterative vo = queue.removeFirst();
                maxDist = Math.max(maxDist, vo.dist);
                minDist = Math.min(minDist, vo.dist);
                map.putIfAbsent(vo.dist, new ArrayList<>());
                map.get(vo.dist).add(vo.node.data);
                if(vo.node.left != null) {
                    queue.addLast(new VerticalOrderIterative(vo.node.left, vo.dist-1));
                }
                if(vo.node.right != null) {
                    queue.addLast(new VerticalOrderIterative(vo.node.right, vo.dist+1));
                }
            }
        }
        for(int i = minDist; i <= maxDist; i++) {
            ans.add(map.get(i));
        }
    }

}
