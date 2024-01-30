
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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            if (root.left != null && root.right != null) {
                int leftDepth = maxDepth(root.left);
                int rightDepth = maxDepth(root.right);

                if (leftDepth > rightDepth) {
                    return 1 + leftDepth;
                } else {
                    return 1 + rightDepth;
                }
            } else if (root.left != null) {
                return 1 + maxDepth(root.left);
            } else {
                return 1 + maxDepth(root.right);
            }
        }
    }
}

public class Main23 {
    public static void main(String[] args) {
        Solution s = new Solution();
    }
}