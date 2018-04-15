/**
 * @author Lika
 * @date 2018/04/15 15:59
 * Description:矩形覆盖
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 想了半天，没想清楚，还是看了一下讨论...Orz
 */
public class RectCover10 {
    public int RectCover(int n) {
        if (n < 1) {
            return 0;
        }
        int f1 = 1, f2 = 2;
        for (int i = 3; i < n; i += 2) {
            f1 += f2;
            f2 += f1;
        }
        return n % 2 == 0 ? f2 : f1;

//简单的
//        if(n < 1){
//            return 0;
//        }else if(n == 1){
//            return 1;
//        }else if(n == 2){
//            return 2;
//        }
//        return RectCover(n-1)+RectCover(n-2);
    }
}
