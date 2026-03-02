package Source;

/*
 Merge two sorted linked lists and return it as a new sorted list. 
 The new list is formed by splicing together the nodes of the first two lists.
 Example:
 Input: l1 = [1,2,4], l2 = [1,3,4]
 Output: [1,1,2,3,4,4]
*/
public class MergeSortedLists {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode curr = this;
            while (curr != null) {
                sb.append(curr.val);
                if (curr.next != null) sb.append(" -> ");
                curr = curr.next;
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        ListNode l1 = buildList(new int[]{1, 2, 4});
        ListNode l2 = buildList(new int[]{1, 3, 4});

        System.out.println("List1: " + l1);
        System.out.println("List2: " + l2);

        ListNode merged = mergeTwoLists(l1, l2);
        System.out.println("Merged: " + merged);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // attach the remaining nodes
        if (l1 != null) tail.next = l1;
        else if (l2 != null) tail.next = l2;

        return dummy.next;
    }

    private static ListNode buildList(int[] vals) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int v : vals) {
            tail.next = new ListNode(v);
            tail = tail.next;
        }
        return dummy.next;
    }
}
