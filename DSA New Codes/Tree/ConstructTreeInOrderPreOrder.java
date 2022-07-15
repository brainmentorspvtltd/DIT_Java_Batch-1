package Tree;

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class ConstructTreeInOrderPreOrder {
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        // int i = 0;
        TreeNode node = helper(preorder, inorder, 0, n-1);
        return node;
    }
    TreeNode helper(int[] preorder, int[] inorder, int startIndex, int endIndex) {
        if(startIndex > endIndex) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preIndex++]);
        int inOrderIndex = startIndex;
        for(int i = startIndex; i <= endIndex; i++) {
            if(inorder[i] == root.val) {
                inOrderIndex = i;
                break;
            }
        }
        root.left = helper(preorder, inorder, startIndex, inOrderIndex-1);
        root.right = helper(preorder, inorder, inOrderIndex+1, endIndex);
        return root;
    }
}
