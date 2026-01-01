package leetCode;

public class MiddleLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode current = head, middle = head;
        short counter = 0, middlePosition = 0;
        while (current != null) {
            if (counter % 2 != 0 && counter / 2 >= middlePosition) {
                middle = middle.next;
                middlePosition++;
            }
            counter++;
            current = current.next;
        }
        return middle;
    }
}
