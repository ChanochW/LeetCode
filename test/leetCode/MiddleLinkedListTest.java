package leetCode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleLinkedListTest {
    private MiddleLinkedList middleLinkedList = new MiddleLinkedList();
    private ListNode head, expected;
    @BeforeEach
    void setUp() {
        head = new ListNode(1);
        expected = new ListNode(6);
        ListNode start = head;
        for (int c = 0; c < 9; c++) {
            head.next = new ListNode(c + 2);
            head = head.next;
        }
        head = start;
    }

    @Test
    void print() {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    @Test
    public void middleNodeTest() {
        assertEquals(expected.val, middleLinkedList.middleNode(head).val);
    }
}
