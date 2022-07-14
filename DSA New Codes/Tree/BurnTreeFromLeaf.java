package Tree;

class Distance {
    int val;
    Distance(int dist) {
        this.val = dist;
    }
}

public class BurnTreeFromLeaf {

    static int res = 0;

    static int burnTime(TreeNode root, int leaf, Distance dist) {
        if(root == null) {
            return 0;
        }

        if(root.data == leaf) {
            dist.val = 0;
            return 1;
        }

        Distance leftDistance = new Distance(-1);
        Distance rightDistance = new Distance(-1);

        int leftHeight = burnTime(root.left, leaf, leftDistance);
        int rightHeight = burnTime(root.right, leaf, rightDistance);

        if(leftDistance.val != -1) {
            dist.val = leftDistance.val + 1;
            res = Math.max(res, dist.val + rightHeight);
        }

        else if(rightDistance.val != -1) {
            dist.val = rightDistance.val + 1;
            res = Math.max(res, dist.val + leftHeight);
        }

        return Math.max(leftHeight, rightHeight) + 1;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root = new Tree.TreeNode(10);
        root.left = new Tree.TreeNode(20);
        root.right = new Tree.TreeNode(30);
        root.left.left = new Tree.TreeNode(40);
        root.left.right = new Tree.TreeNode(50);
        root.right.left = new Tree.TreeNode(60);

        burnTime(root, 60, new Distance(-1));
        System.out.println("Time is : " + res);

    }
}
