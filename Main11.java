import java.util.Vector;

public class Main11 {
    public static void main(String[] args) {

    }
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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        } else if (root.left == null && root.right == null) {
            return true;
        } else if (root.left != null && root.right == null) {
            return false;
        } else if (root.left == null && root.right != null) {
            return false;
        } else {
            Vector<TreeNode> leftQueue = new Vector<TreeNode>();
            Vector<TreeNode> rightQueue = new Vector<TreeNode>();

            leftQueue.add(root.left);
            rightQueue.add(root.right);

            while (!leftQueue.isEmpty() && !rightQueue.isEmpty()) {
                TreeNode leftCurrentNode = leftQueue.remove(0);
                TreeNode rightCurrentNode = rightQueue.remove(0);

                if (leftCurrentNode.val != rightCurrentNode.val) {
                    return false;
                } else {
                    if (leftCurrentNode.left == null && rightCurrentNode.right != null) {
                        return false;
                    } else if (leftCurrentNode.left != null && rightCurrentNode.right == null) {
                        return false;
                    } else if (leftCurrentNode.right == null && rightCurrentNode.left != null) {
                        return false;
                    } else if (leftCurrentNode.right != null && rightCurrentNode.left == null) {
                        return false;
                    } else if (leftCurrentNode.left != null && rightCurrentNode.right != null) {
                        leftQueue.add(leftCurrentNode.left);
                        rightQueue.add(rightCurrentNode.right);
                    } else if (leftCurrentNode.right != null && rightCurrentNode.left != null) {
                        leftQueue.add(leftCurrentNode.right);
                        rightQueue.add(rightCurrentNode.left);
                    }
                }

            }

            if (!leftQueue.isEmpty()) {
                return false;
            } else if (!rightQueue.isEmpty()) {
                return false;
            } else {
                return true;
            }
        }
    }
}