package Tree;

import java.util.ArrayList;

public class SerializeDeserializeTree {
    static final int EMPTY = -1;
    static int index = 0;
    static void serialize(TreeNode root, ArrayList<Integer> arr) {
        if(root == null) {
            arr.add(EMPTY);
            return;
        }
        arr.add(root.data);
        serialize(root.left, arr);
        serialize(root.right, arr);
    }

    static TreeNode deSerialize(ArrayList<Integer> arr) {
        if(arr.size() == index) {
            return null;
        }
        int val = arr.get(index);
        index++;
        if(val == EMPTY) {
            return null;
        }
        TreeNode node = new TreeNode(val);
        node.left = deSerialize(arr);
        node.right = deSerialize(arr);
        return node;
    }
}
