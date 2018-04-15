/**
 * @author Lika
 * @date 2018/04/14 16:55
 * Description:斐波那契数列
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * n<=39
 */
public class fibonacci7 {

    //1、1、2、3、5、8、13、21、34
    public static void main(String[] args) {
        System.out.println(new fibonacci7().fibonacci(3));
    }

    //速度可以说是很快了。每次计算两个。
    private int fibonacci(int n) {
        int f1 = 1, f2 = 1;
        if (n == 0) {
            return 0;
        }
        for (int i = 3; i <= n; i += 2) {
            f1 += f2;
            f2 += f1;
        }
        return n % 2 == 0 ? f2 : f1;
    }
/**
 * 已经挺好的了，只不过空间占用还比较严重。实际上也不严重啊 23333
 */
//    private int fibonacci(int n) {
//        int[] fib = new int[40];
//
//        if (n == 0){
//            return 0;
//        }
//        fib[1] = fib[2] = 1;
//        for (int i = 3; i <= n; i++){
//            fib[i] = fib[i-1] + fib[i-2];
//        }
//        return fib[n];
//    }

/**
 * 递归版
 */
//    public int fibonacci(int n) {
//        if (n == 1 || n == 2) {
//            return 1;
//        }
//        return fibonacci(n-2)+ fibonacci(n-1);
//    }
}
