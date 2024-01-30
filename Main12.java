import java.util.Vector;

public class Main12 {
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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            int depth = 1;
            Vector<TreeNode> queue = new Vector<TreeNode>();
            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode currentNode = queue.remove(queue.size() - 1);

                if (currentNode.left != null && currentNode.right != null) {
                    queue.add(currentNode.left);
                    queue.add(currentNode.right);
                    depth++;
                } else if (currentNode.left != null) {
                    queue.add(currentNode.left);
                    depth++;
                } else if (currentNode.right != null) {
                    queue.add(currentNode.right);
                    depth++;
                }
            }
            return depth;
        }
    }
}