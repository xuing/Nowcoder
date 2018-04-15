/**
 * @author Lika
 * @date 2018/04/14 11:26
 * Description:旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class MinNumberInRotateArray6 {
    public static void main(String[] args) {
        System.out.println(new MinNumberInRotateArray6().minNumberInRotateArray(new int[]{2, 2, 3, 4, 5, 6, 6}));
    }

    //可以AC的比较好的，但是没有考虑重复元素的情况。
    public int minNumberInRotateArray(int[] array) {
        int size = array.length;
        if (size == 0) {
            return 0;
        }
        int left = 0, right = size - 1;
        int mid = 0;

        while (right >= left) {
            mid = (left + right) >>> 2;
            if (array[mid] >= array[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return array[left];
    }
//    暴力法
//    public int minNumberInRotateArray(int [] array) {
//        int len = array.length;
//        if (len == 0){
//            return 0;
//        }
//        int res = array[0];
//        for(int i=1; i < len; i++){
//            if (res > array[i]){
//                res = array[i];
//            }
//        }
//        return res;
//    }


//    public int minNumberInRotateArray(int [] array) {
//        /**
//         * 跳到中间，如果比头部大，继续后面二分。
//         * 如果比头部小了，开始向前搜索，遇到第一个大于等于头部的，返回前一个。
//         */
//        int low = 0;
//        int high = array.length-1;
//        if (high == -1){
//            return 0;
//        }
//        int key = array[0];
//        int mid = (low+high)/2;
//        while (low <= high){
//            if (array[mid] <= key){
//                while (mid > 0){
//                    if(array[mid] >= key){
//                        return array[mid + 1];
//                    }
//                    mid--;
//                }
//            }else if (array[mid] > key){
//                low = mid + 1;
//                mid = (low+high)/2;
//            }
//        }
//        return 0;
//    }
}