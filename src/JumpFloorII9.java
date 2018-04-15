/**
 * @author Lika
 * @date 2018/04/14 18:12
 * Description:变态跳台阶
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……
 * 它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpFloorII9 {
    public static void main(String[] args) {
        System.out.println(new JumpFloorII9().jumpFloorII(4));
    }

    public int jumpFloorII(int n) {
        //更疯狂一点的
        return 1 << (n - 1);
//        return (int)Math.pow(2,n-1);
    }
    /**
     * 常规一点的，实际上是找规律出来的..不该看样例的，有点作弊嫌疑。
     */
//    int[] res = new int[n+1];
//    res[1] = 1;
//        for (int i = 2; i <= n; i++){
//        res[i] = res[i-1]*2;
//    }
//        return res[n];

    /**
     * 常规其实有动态规划的思想了
     */
//    int jumpFloorII(int number) {
//        int[] a = new int[number+1];
//        a[0]=1;
//        a[1]=1;
//        for(int i=2;i<=number;i++){
//            a[i]=0;
//            for(int j=i-1;j>=0;j--){
//                a[i]+=a[j];
//            }
//        }
//        return a[number];
//    }
}
