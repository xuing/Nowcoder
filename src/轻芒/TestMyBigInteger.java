package 轻芒;

import java.math.BigInteger;
import java.util.Random;

/**
 * @author Lika
 * @date 2019/01/03 15:22
 * Description:
 * MyBigInteger的测试以及对拍程序。
 * 时间原因，有些不规范的地方还请见谅。
 */
public class TestMyBigInteger {
    //生成数据的量
    final static int DataCount = 100000;

    // 使用对拍检测JDK自带的BigInteger和MyBigInteger的结果
    static void duipai() {
        String[][] data = GeneralData();
        System.out.println("数据生成完毕");
        long begin = System.currentTimeMillis();
        String[] res1 = useJdkBigInteger(data);
        long end = System.currentTimeMillis() - begin;
        System.out.println("使用JDK自带BigInteger执行高精度加法耗时：" + end + "毫秒");

        begin = System.currentTimeMillis();
        String[] res2 = useMyBigInteger(data);
        end = System.currentTimeMillis() - begin;
        System.out.println("使用MyBigInteger执行高精度加法耗时：" + end + "毫秒");

        checkIsCorrect(res1, res2);

    }

    private static void checkIsCorrect(String[] res1, String[] res2) {
        for (int i = 0; i < DataCount; i++) {
            if (!res1[i].equals(res2[i])) {
                System.out.println("计算出错");
                return;
            }
        }
        System.out.println(DataCount + "次计算，均计算正确!");
    }

    private static String[] useMyBigInteger(String[][] data) {
        String[] res = new String[DataCount];
        for (int i = 0; i < DataCount; i++) {
            MyBigInteger bigInteger = new MyBigInteger(data[i][0]);
            res[i] = bigInteger.add(data[i][1]).toString();
        }
        return res;
    }

    private static String[] useJdkBigInteger(String[][] data) {
        String[] res = new String[DataCount];
        for (int i = 0; i < DataCount; i++) {
            BigInteger bigInteger = new BigInteger(data[i][0]);
            res[i] = bigInteger.add(new BigInteger(data[i][1])).toString();
        }
        return res;
    }

    private static String[][] GeneralData() {
        String[][] res = new String[DataCount][2];
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < DataCount; i++) {
//            不定的位数
            for (int j = 1; j < random.nextInt(1000) + 5; j++) {
                sb.append(random.nextInt(10000));
            }
            res[i][0] = sb.toString();

            sb.delete(0, sb.length());
            for (int j = 1; j < random.nextInt(1000) + 5; j++) {
                sb.append(random.nextInt(10000));
            }
            res[i][1] = sb.toString();
            sb.delete(0, sb.length());
        }
        return res;
    }


    public static void main(String[] args) {
//        MyBigInteger bg =  new MyBigInteger("12345678909876543210");
//        System.out.println(bg.add("12345678909876543210"));
        duipai();
    }
}
