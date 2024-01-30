import java.util.Vector;

public class Main13 {

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int depthOfNode(TreeNode node, int currentDepth) {

        if (node.left == null && node.right == null) {
            return 1;
        } else if (node.left != null && node.right != null) {
            int leftDepth = depthOfNode(node.left, currentDepth);
            int rightDepth = depthOfNode(node.right, currentDepth);

            if (leftDepth > rightDepth) {
                return leftDepth;
            } else {
                return rightDepth;
            }
        } else if (node.left != null) {
            return depthOfNode(node.left, currentDepth);
        } else if (node.right != null) {
            return depthOfNode(node.right, currentDepth);
        }

        return currentDepth;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            return depthOfNode(root, 0);
        }
    }
}