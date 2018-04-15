/**
 * @author Lika
 * @date 2018/04/14 17:57
 * Description:跳台阶
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpFloor8 {
    //核心点如下，写出来发现是fibonacci，然后就把7题的代码改了一下。
    //res =  arr[n-1] + arr[n-2]
    public int jumpFloor(int n) {
        int f1 = 1, f2 = 2;

        for (int i = 3; i <= n; i += 2) {
            f1 += f2;
            f2 += f1;
        }
        return n % 2 == 0 ? f2 : f1;

    }

    /**
     *  递归实现
     */
//    if (n == 1 ){
//        return 1;
//    }else if (n == 2){
//        return 2;
//    }
//        return jumpFloor(n-1)+jumpFloor(n-2);

}
