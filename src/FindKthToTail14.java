/**
 * @author Lika
 * @date 2019-1-26 11:49:32
 * Description:输入一个链表，输出该链表中倒数第k个结点。
 * 使用快慢指针就可以了，注意NPE。
 */
public class FindKthToTail14 {
    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        if (fast == null || k <= 0) {
            return null;
        }
        for (int i = 1; i < k; i++) {
            fast = fast.next;
            if (fast == null) {
                return null;
            }
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}

