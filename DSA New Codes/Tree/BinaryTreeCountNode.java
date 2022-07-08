package Tree;

public class BinaryTreeCountNode {
    int countNodes(BinaryTree<Integer> root) {
        if(root == null) {
            return 0;
        }
        int counter = 1;
        counter += countNodes(root.left);
        counter += countNodes(root.right);
        return counter;
    }
}
