package leetCode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return null;
        }
        while (head.val == val) {
            if (head.next == null) {
                return null;
            } else {
                head = head.next;
            }
        }
        ListNode current = head;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
