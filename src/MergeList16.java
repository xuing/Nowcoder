/**
 * @author Lika
 * @date 2019/01/26 13:51
 * Description:输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * 普通Merge就好
 */
public class MergeList16 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode res = null, p = null;
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            res = list1;
            p = res;
            list1 = list1.next;
        } else {
            res = list2;
            p = res;
            list2 = list2.next;
        }

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                p.next = list1;
                list1 = list1.next;
                p = p.next;
            } else {
                p.next = list2;
                list2 = list2.next;
                p = p.next;
            }
        }

        if (list1 != null) {
            p.next = list1;
        }

        if (list2 != null) {
            p.next = list2;
        }

        return res;
    }

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     *
     * Merge前做一个头结点，会省很多事情，返回的时候返回Next就好了。
     *
     * 链接：https://www.nowcoder.com/questionTerminal/d8b6b4358f774294a89de2a6ac4d9337
     * 来源：牛客网
     *
     * public class Solution {
     *     public ListNode Merge(ListNode list1,ListNode list2) {
     *         //新建一个头节点，用来存合并的链表。
     *         ListNode head=new ListNode(-1);
     *         head.next=null;
     *         ListNode root=head;
     *         while(list1!=null&&list2!=null){
     *             if(list1.val<list2.val){
     *                 head.next=list1;
     *                 head=list1;
     *                 list1=list1.next;
     *             }else{
     *                 head.next=list2;
     *                 head=list2;
     *                 list2=list2.next;
     *             }
     *         }
     *         //把未结束的链表连接到合并后的链表尾部
     *         if(list1!=null){
     *             head.next=list1;
     *         }
     *         if(list2!=null){
     *             head.next=list2;
     *         }
     *         return root.next;
     *     }
     * }
     */

}
