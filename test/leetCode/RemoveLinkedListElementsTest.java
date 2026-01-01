package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveLinkedListElementsTest {
    private final RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();
    @Test
    public void ListNodeTest() {

    }
    /* @Test
     void emptyArray() {
     int[] nums = {};
     assertEquals(0, RemoveDuplicatesSorted.array(nums));
     }*/
    @Test
    void emptyList() {
        assertNull(removeLinkedListElements.removeElements(null, 2));
    }

    @Test
    void dupAtBegin() {
        ListNode nums = createList(1, 1, 2);
        ListNode expResult = createList(1, 1);
        checkEquals(expResult, removeLinkedListElements.removeElements(nums, 2));
    }

    @Test
    void dupAtEnd() {
        ListNode nums = createList(1, 1, 2, 3, 3);
        ListNode expResult = createList( 2, 3, 3);
        checkEquals(expResult, removeLinkedListElements.removeElements(nums, 1));
    }

    @Test
    void allSame() {
        ListNode nums = createList(1, 1, 1);
        assertNull(removeLinkedListElements.removeElements(nums, 1));
    }

    private ListNode createList(int... ints) {
        ListNode head = new ListNode(ints[0]);
        ListNode curr = head;
        for (int i = 1; i < ints.length; i++) {
            curr.next = new ListNode(ints[i]);
            curr = curr.next;
        }
        return head;
    }

    private void checkEquals(ListNode nums, ListNode result) {
        while (result != null) {
            assertEquals(nums.val, result.val);
            ListNode finalNums = nums;
            assertDoesNotThrow(() -> finalNums.next);
            nums = nums.next;
            result = result.next;
        }
    }
}

