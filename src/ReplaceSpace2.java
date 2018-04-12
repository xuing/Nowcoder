/**
 * @author Lika
 * @date 2018/04/12 14:14
 * Description:替换空格
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 */
public class ReplaceSpace2 {
    public String replaceSpace(StringBuffer str) {
        char[] chars = str.toString().toCharArray();
//        for (int i = 0; i < chars.length; i++){
//            System.out.printf("%c",chars[i]);  //We Are Happy.null ，转换为字符数组后，最后一个不是\0,而是null
//        }
        StringBuilder strBuilder = new StringBuilder();
        int i = 0;
        while(i < chars.length){
            if (chars[i] != ' ') {
                strBuilder.append(chars[i]);
            }else {
                strBuilder.append("%20");
            }
            i++;
        }
        return strBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReplaceSpace2().replaceSpace(new StringBuffer("We Are Happy.")));
    }

    /**
     * PS:
     * java与C语言在字符串结束符上的区别
     * https://blog.csdn.net/sszgg2006/article/details/49148189
     */
}
