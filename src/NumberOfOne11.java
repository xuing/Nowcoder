/**
 * @author Lika
 * @date 2018/04/15 16:42
 * Description:二进制中1的个数
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 好巧妙呀2333，然而这个不是我写的。
 */
public class NumberOfOne11 {

    private static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
            System.out.println(n);
        }
        return count;
//        int count = 0;
//        int flag = 1;
//        while (flag != 0) {
//            if ((n & flag) != 0) {
//                count++;
//            }
//            flag = flag << 1;
//            System.out.println(flag);
//        }
//        return count;
    }

    public static void main(String[] args) {
        //使用n=10,二进制形式为1010，则1的个数为2；
//        1010
//        1011
//          1010
//          1001
        int n = 10;
        System.out.println(n + "的二进制中1的个数：" + NumberOf1(n));
    }

}
