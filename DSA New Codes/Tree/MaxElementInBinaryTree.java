package Tree;

public class MaxElementInBinaryTree {
    int getMax(BinaryTree<Integer> root) {
        if(root == null) {
            return Integer.MIN_VALUE;
        }
        else {
            return Math.max(root.data, Math.max(getMax(root.left), 
            getMax(root.right)));
        }
    }
}
