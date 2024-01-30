
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        } else if (head.next == null) {
            return false;
        } else if (head.next == head) {
            return true;
        } else {
            ListNode currentNode = head;

            while (currentNode != null) {
                ListNode backTraverseNode = head;

                if (currentNode.next == currentNode) {
                    return true;
                }

                while (backTraverseNode != currentNode) {
                    if (currentNode.next == backTraverseNode) {
                        return true;
                    }
                    backTraverseNode = backTraverseNode.next;
                }

                currentNode = currentNode.next;
            }
            return false;
        }

    }
}

public class Main25 {
    public static void main(String[] args) {
        Solution s = new Solution();
    }
}