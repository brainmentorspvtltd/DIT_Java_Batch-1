package Tree;

public class BalancedTree {
    // int height(Node root) {
    //     if(root == null) {
    //         return 0;
    //     }
    //     int leftHeight = height(root.left);
    //     int rightHeight = height(root.right);
    //     return 1 + Math.max(leftHeight, rightHeight);
    // }

    // boolean isBalanced(Node root) {
    //     if(root == null) {
    //         return true;
    //     }
    //     int leftHeight = height(root.left);
    //     int rightHeight = height(root.right);
    //     return (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right));
    // }

    public static int isBalanced(Node root) {
        if(root == null) {
            return 0;
        }
        int leftH = isBalanced(root.left);
        if(leftH == -1) {
            return -1;
        }
        int rightH = isBalanced(root.right);
        if(rightH == -1) {
            return -1;
        }
        if(Math.abs(leftH - rightH) > 1) {
            return -1;
        }
        else {
            return Math.max(leftH, rightH) + 1;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.right = new Node(6);
        root.right.right.left = new Node(8);
        root.right.right.right = new Node(7);
        isBalanced(root);
    }

}
