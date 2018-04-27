/**
 * @author Lika
 * @date 2018/04/19 11:00
 * Description:数值的整数次方
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Power12 {
    public static void main(String[] args) {
        System.out.println((new Power12().power(0, 0)));
    }
    //负数的有问题因为是补码嘛，实际按照正数算了，取1/res 就好了
//    public double Power(double base, int exponent) {
//        double res = 1;
//        double t = base;
//        while (exponent < 0 && exponent != -1){
//            res = res * ((exponent & 1) == 1? 1/t : 1);
//            t *= t;
//            exponent = exponent >> 1;
//        }
//        while (exponent > 0){
//            res = res * ((exponent & 1) == 1? t : 1);
//            t *= t;
//            exponent = exponent >>> 1;
//        }
//        return res;
//    }

    private double power(double base, int exponent) {
        double res = 1;
        double t = base;
        int n;
        if (exponent < 0) {
            if (base == 0) {
                throw new RuntimeException("分母不能为0");
            }
            n = -exponent;
        } else {
            n = exponent;
        }
        while (n != 0) {
            res = res * ((n & 1) == 1 ? t : 1);
            t *= t;
            n = n >>> 1; //无符号右移
        }
        return exponent > 0 ? res : 1 / res;
    }
}
