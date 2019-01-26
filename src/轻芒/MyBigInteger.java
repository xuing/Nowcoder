package 轻芒;

/**
 * @author Lika
 * @date 2019/01/03 15:12
 * Description:
 * 使用int数组进行高效率的大数(正整数)加法。
 * 基本思想是，int数组存储大数，每个int存9位数字。Add时模拟加法。
 */
public class MyBigInteger {
    //一个Int可以存储9位数字。
    private static final int digitsPerInt = 9;
    final int[] num;

    public MyBigInteger(String initStr) {
        final int len = initStr.length();
        int cursor = len;
        String group;

        if (len == 0) {
            throw new NumberFormatException("Zero length BigInteger");
        }
        // 9位数字为单位拆分到int数组中
        int numWords = len / digitsPerInt + 1;
        num = new int[numWords + 1];
        num[0] = 0;
        while (cursor > 0) {
            int startIndex = cursor - digitsPerInt;
            if (startIndex < 0) {
                startIndex = 0;
            }
            group = initStr.substring(startIndex, cursor);
            cursor = startIndex;
            num[numWords--] = Integer.parseInt(group);
        }
    }

    MyBigInteger(int[] num) {
        this.num = num;
    }

    public MyBigInteger add(MyBigInteger num2) {
        return new MyBigInteger(add(num, num2.num));
    }

    public MyBigInteger add(String num2) {
        return add(new MyBigInteger(num2));
    }

    private int[] add(int[] num, int[] num2) {
        int maxLength = num.length > num2.length ? num.length : num2.length;
        int cursor = maxLength - 1;
        int[] res = new int[cursor + 1];
        int i, j, temp, carry = 0;

        for (i = num.length - 1, j = num2.length - 1; cursor >= 0; i--, j--) {
            int s1 = i >= 0 ? num[i] : 0;
            int s2 = j >= 0 ? num2[j] : 0;
            temp = s1 + s2 + carry;
            res[cursor--] = temp % 1000000000;
            carry = temp >= 1000000000 ? 1 : 0;
        }
        return res;
    }

    public Integer length() {
        return num.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        if (num.length == 2) {
            return String.valueOf(num[i]);
        } else if (num[i] == 0) {
            i++;
        }
        sb.append(num[i++]);
        // 除了起始的数组，后面的int数组均不能忽略前导0
        for (; i < num.length; i++) {
            String t = String.valueOf(num[i]);
            t.length();
            for (int j = 0; j < digitsPerInt - t.length(); j++) {
                sb.append('0');
            }
            sb.append(t);
            // 奇慢无比
            // sb.append(String.format("%09d", num[i]));
        }
        return sb.toString();
    }


}
