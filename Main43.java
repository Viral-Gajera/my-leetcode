
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
    public void DFS(TreeNode node, StringBuilder input) {
        input.append(String.valueOf(node.val));
        if (node.left != null) {
            input.append("(");
            DFS(node.left, input);
            input.append(")");
        }
        if (node.right != null && node.left == null) {
            input.append("()");
            input.append("(");
            DFS(node.right, input);
            input.append(")");
        }
        if (node.right != null && node.left != null) {
            input.append("(");
            DFS(node.right, input);
            input.append(")");
        }
    }

    public String tree2str(TreeNode root) {
        StringBuilder result = new StringBuilder("");
        DFS(root, result);
        return result.toString();
    }
}