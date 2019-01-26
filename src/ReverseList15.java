import java.util.Stack;

/**
 * @author Lika
 * @date 2019/01/26 12:06
 * Description: 输入一个链表，反转链表后，输出新链表的表头。
 * 可以使用栈进行反转
 */

public class ReverseList15 {
    public static ListNode ReverseList(ListNode head) {
        Stack<ListNode> nodeStack = new Stack<>();
        ListNode p = head;
        if (head == null) {
            return null;
        }

        while (p != null) {
            nodeStack.push(p);
            p = p.next;
        }

        ListNode res = nodeStack.pop();
        p = res;
        while (!nodeStack.empty()) {
            p.next = nodeStack.pop();
            p = p.next;
        }
        p.next = null;

        return res;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        a.next = b;
        ListNode r = ReverseList(a);

    }

    /*
     * 牛客网上的其他答案，直接反指回去。
     * */
    public ListNode nowcoder(ListNode head) {
        if (head == null)
            return null;
        ListNode reversedHead = null;
        ListNode current = head;
        ListNode tmp = null;
        ListNode pre = null;
        while (current != null) {
            tmp = current.next;
            current.next = pre;
            if (tmp == null)
                reversedHead = current;
            pre = current;
            current = tmp;

        }
        return reversedHead;
    }

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
