import java.util.*;

class Solution {

    void traverse(TreeNode currentNode, ArrayList<Integer> list) {
        if (currentNode.left == null && currentNode.right == null) {
            list.add(currentNode.val);
        } else {
            if (currentNode.left != null && currentNode.right != null) {
                traverse(currentNode.left, list);
                traverse(currentNode.right, list);
                list.add(currentNode.val);
            } else if (currentNode.left != null) {
                traverse(currentNode.left, list);
                list.add(currentNode.val);
            } else {
                traverse(currentNode.right, list);
                list.add(currentNode.val);
            }
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        if (root == null) {
            return list;
        } else if (root.left == null && root.right == null) {
            list.add(root.val);
            return list;
        } else {
            traverse(root, list);
        }

        return list;

    }
}