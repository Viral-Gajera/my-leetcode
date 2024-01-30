import java.util.*;

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

    public boolean checkSum(TreeNode root, int targetSum, int currentSum) {
        if (root.left == null && root.right == null) {
            return currentSum + root.val == targetSum || false;
        } else if (root.left != null && root.right != null) {
            return checkSum(root.left, targetSum, currentSum + root.val)
                    || checkSum(root.right, targetSum, currentSum + root.val);
        } else if (root.left != null) {
            return checkSum(root.left, targetSum, currentSum + root.val);
        } else {
            return checkSum(root.right, targetSum, currentSum + root.val);
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        } else {
            return checkSum(root, targetSum, 0);
        }
    }
}