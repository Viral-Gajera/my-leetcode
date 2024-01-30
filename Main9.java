import java.util.*;

public class Main9 {
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
        } else {
            Vector<TreeNode> queue = new Vector<TreeNode>();
            Vector<Integer> array = new Vector<Integer>();

            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode currentNode = queue.remove(0);

                if (currentNode != null) {
                    array.add(currentNode.val);
                    queue.add(currentNode.left);
                    queue.add(currentNode.right);
                }
            }

            Vector<Integer> stack = new Vector<Integer>();

            while (!array.isEmpty()) {
                int lastValue = array.remove(array.size() - 1);

                if (stack.isEmpty()) {
                    stack.add(lastValue);
                } else {
                    if (lastValue == stack.get(stack.size() - 1)) {
                        stack.remove(stack.size() - 1);
                    } else {
                        stack.add(lastValue);
                    }
                }
            }

            if (stack.size() == 1) {
                return true;
            } else {
                return false;
            }

        }
    }
}
