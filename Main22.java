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
    public List<Integer> preorderTraversal(TreeNode root) {
        Vector<Integer> list = new Vector<Integer>();
        if (root == null) {
            return list;
        } else if (root.left == null && root.right == null) {
            list.add(root.val);
            return list;
        } else {

            Vector<TreeNode> stack = new Vector<TreeNode>();
            stack.add(root);

            while (!stack.isEmpty()) {
                TreeNode currentNode = stack.remove(stack.size() - 1);

                list.add(currentNode.val);

                if (currentNode.right != null) {
                    stack.add(currentNode.right);
                }
                if (currentNode.left != null) {
                    stack.add(currentNode.left);
                }
            }

            return list;

        }
    }
}

public class Main22 {
    public static void main(String[] args) {
        Solution s = new Solution();
    }
}