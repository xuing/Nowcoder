import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 @author Lika
 @date 2018/04/12 14:35
 Description:从尾到头打印链表
 输入一个链表，从尾到头打印链表每个节点的值。
 运行时间：36ms
 占用内存：9164k
 */
public class PrintLinkListByReverse3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {
            return new ArrayList<Integer>();
        }
        ListNode tempList = listNode;
        int len = 1;
        while (tempList.next != null) {
            len++;
            tempList = tempList.next;
        }
        Integer[] result = new Integer[len];
        tempList = listNode;
        while (len > 0) {
            result[len - 1] = tempList.val;
            tempList = tempList.next;
            len--;
        }
        ArrayList<Integer> res = new ArrayList<>(Arrays.asList(result));
        return res;
    }

    @Test
    public void test() {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);

        ArrayList<Integer> arrayList = printListFromTailToHead(null);
        int i = 0;
        while (i < arrayList.size()) {
            System.out.println(arrayList.get(i));
            i++;
        }
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
