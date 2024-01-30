
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode currentNodeA = headA;
        ListNode currentNodeB = null;

        while (currentNodeA != null) {
            currentNodeB = headB;

            while (currentNodeB != null) {
                if (currentNodeB == currentNodeA) {
                    return currentNodeA;
                }
                currentNodeB = currentNodeB.next;
            }

            currentNodeA = currentNodeA.next;
        }

        return null;
    }
}