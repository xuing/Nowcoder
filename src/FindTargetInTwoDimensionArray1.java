/**
 * @author Lika
 * @date 2018/04/12 14:11
 * Description:二维数组中的查找
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class FindTargetInTwoDimensionArray1 {
    public boolean Find(int target, int[][] array) {
        int rowLen = array.length;
        int colLen = array[0].length;
        for (int r = 0,c = colLen-1; r < rowLen && c >=0;) {
            if(array[r][c] > target){
                c--;
            }else if(array[r][c] < target){
                r++;
            }else{
                return true;
            }
        }
        return false;
    }
}
