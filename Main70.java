
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int d1;
        int d2;
        int d;
        int c = 0;

        ListNode head = new ListNode();
        ListNode traverse = head;

        while (l1 != null || l2 != null) {
            d1 = l1 != null ? l1.val : 0;
            d2 = l2 != null ? l2.val : 0;

            d = (d1 + d2 + c) % 10;
            c = (d1 + d2 + c) / 10;

            traverse.next = new ListNode();
            traverse = traverse.next;
            traverse.val = d;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        if (c != 0) {
            traverse.next = new ListNode();
            traverse = traverse.next;
            traverse.val = c;
        }

        return head.next;

    }
}