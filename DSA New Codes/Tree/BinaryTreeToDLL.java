package Tree;

class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTreeToDLL {
    TreeNode root;
    TreeNode head;
    TreeNode prev = null;
    
    void binaryTree(TreeNode root) {
        if(root == null) {
            return;
        }
        binaryTree(root.left);

        if(prev == null) {
            head = root;
        }
        else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        
        binaryTree(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeToDLL tree = new BinaryTreeToDLL();
        tree.root = new Tree.TreeNode(10);
        tree.root.left = new Tree.TreeNode(20);
        tree.root.right = new Tree.TreeNode(30);
        tree.root.left.left = new Tree.TreeNode(40);
        tree.root.left.right = new Tree.TreeNode(50);
        tree.root.right.left = new Tree.TreeNode(60);
    }
}