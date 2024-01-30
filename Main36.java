
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        } else if (head.next == null) {
            if (head.val == val) {
                return null;
            } else {
                return head;
            }
        } else {
            while (head.val == val) {
                head = head.next;

                if (head == null) {
                    return null;
                }
            }

            ListNode currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.val == val) {
                    currentNode.next = currentNode.next.next;
                    continue;
                }
                currentNode = currentNode.next;

            }
        }
        return head;
    }
}