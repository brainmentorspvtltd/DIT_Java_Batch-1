package Tree;

public class PrintNodeAtKDist {
    static void printNode(BinaryTree<Integer> root, int k) {
        if(root == null) {
            return;
        }
        if(k == 0) {
            System.out.println(root.data + ",");
        }
        else {
            printNode(root.left, k-1);
            printNode(root.right, k-1);
        }
    }

    public static void main(String[] args) {
        BinaryTreeOperations tree = new BinaryTreeOperations();
        BinaryTree<Integer> root = tree.insert();
        printNode(root, 2);
    }
}
