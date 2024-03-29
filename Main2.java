
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
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        } else {
            ListNode currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.val == currentNode.next.val) {
                    currentNode.next = currentNode.next.next;
                } else {
                    currentNode = currentNode.next;
                }
            }
        }

        return head;
    }
}

public class Main2 {
    public static void main(String[] args) {

    }
}
