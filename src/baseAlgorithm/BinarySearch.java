package baseAlgorithm;


import java.util.Date;

import static java.util.Arrays.binarySearch;

/**
 * @author Lika
 * @date 2018/04/14 11:39
 * Description:
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 7, 8, 10, 25, 65, 77, 97};

        Long start = System.currentTimeMillis();
//        System.out.println("result:"+myBinarySearch(a,3));
        for (int i = 0; i <= 10000000; i++) {
            int d = myBinarySearch(a, 56);
        }
        Long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

    private static int myBinarySearch(int[] a, int key) {
        int left = 0;
        int right = a.length;
        int mid = right / 2;

        while (left <= right) {
            if (a[mid] < key) {
                left = mid + 1;
                mid = (right + left) >>> 1;
            } else if (a[mid] > key) {
                right = mid - 1;
                mid = (right + left) >>> 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
