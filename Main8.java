import java.util.*;

public class Main8 {
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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        } else if (p == null && q != null) {
            return false;
        } else if (p != null && q == null) {
            return false;
        } else {
            Vector<TreeNode> P = new Vector<TreeNode>();
            Vector<TreeNode> Q = new Vector<TreeNode>();

            P.add(p);
            Q.add(q);

            while (!P.isEmpty() && !Q.isEmpty()) {
                TreeNode currentNodeP = P.remove(0);
                TreeNode currentNodeQ = Q.remove(0);

                if (currentNodeP.val == currentNodeQ.val) {
                    if (currentNodeP.left != null && currentNodeQ.left != null) {
                        P.add(currentNodeP.left);
                        Q.add(currentNodeQ.left);
                    } else if (currentNodeP.left != null && currentNodeQ.left == null) {
                        return false;
                    } else if (currentNodeP.left == null && currentNodeQ.left != null) {
                        return false;
                    }

                    if (currentNodeP.right != null && currentNodeQ.right != null) {
                        P.add(currentNodeP.right);
                        Q.add(currentNodeQ.right);
                    } else if (currentNodeP.right != null && currentNodeQ.right == null) {
                        return false;
                    } else if (currentNodeP.right == null && currentNodeQ.right != null) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            if (!P.isEmpty()) {
                return false;
            } else if (!Q.isEmpty()) {
                return false;
            } else {
                return true;
            }
        }
    }
}