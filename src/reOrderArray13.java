import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Lika
 * @date 2018/05/17 17:42
 * Description:输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class reOrderArray13 {

    public static void reOrderArray(int[] array) {

        int initialCapacity = array.length >>> 1;
        ArrayList<Integer> oddArray = new ArrayList<Integer>(initialCapacity);
        ArrayList<Integer> evenArray = new ArrayList<Integer>(initialCapacity);

        for (int i : array) {
            if ((i & 1) == 0) {
                evenArray.add(i);
            } else {
                oddArray.add(i);
            }
        }
        oddArray.addAll(evenArray);
        for (int i = 0; i < array.length; i++) {
            array[i] = oddArray.get(i);
        }

    }

    /**
     * 这个版本没有保证顺序
     *
     * @param array
     */
//    public static void reOrderArray13(int[] array) {
//        int left = 0;
//        int right = array.length - 1;
//
//        while (left < right){
//            while ((array[left] & 1) == 1){
//                left++;
//            }
//            while ((array[right] & 1) == 0){
//                right--;
//            }
//            swap(array,left,right);
//            left++;
//            right--;
//        }
//    }
    private static void swap(int[] array, int left, int right) {
        int t = array[left];
        array[left] = array[right];
        array[right] = t;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        reOrderArray(nums);
//        System.out.println(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
