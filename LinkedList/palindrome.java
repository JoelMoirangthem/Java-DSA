class ListNode {
    int val;
    ListNode next;
    ListNode(int data) {
        this.val = data;
        this.next = null;
    }
}

public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        // Step 1: find middle
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: reverse second half
        ListNode curr = slow;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: compare both halves
        ListNode right = prev;
        ListNode left = head;
        while (right != null) {
            if (right.val != left.val) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
}
