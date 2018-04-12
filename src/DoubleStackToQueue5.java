import java.util.Stack;

/**
 * @author Lika
 * @date 2018/04/12 21:11
 * Description:用两个栈实现队列
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class DoubleStackToQueue5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        int res = stack2.pop();
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return res;
    }

    /**
     * 下面是精彩绝伦的代码
     * 左程云的《程序员代码面试指南》
     *   import java.util.Stack;
     *  
     *     public class Solution {
     *     Stack<Integer> stack1 = new Stack<Integer>();
     *     Stack<Integer> stack2 = new Stack<Integer>();
     *      
     *             public void push(int node) {
     *         stack1.push(node);
     *     }
     *      
     *             public int pop() {
     *         if(stack1.empty()&&stack2.empty()){
     *             throw new RuntimeException("Queue is empty!");
     *         }
     *         if(stack2.empty()){
     *             while(!stack1.empty()){
     *                 stack2.push(stack1.pop());
     *             }
     *         }
     *         return stack2.pop();
     *     }
     *     }
     */


}
