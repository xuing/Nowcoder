package 轻芒;

/**
 * @author Lika
 * @date 2019/01/03 15:12
 * Description:
 */
public class MyBigInteger_old {
    char[] num = null;

    public MyBigInteger_old(String initStr) {
        if (initStr.length() == 0) {
            throw new NumberFormatException("Zero length BigInteger");
        }
        num = initStr.toCharArray();
//        num = new char[initStr.length()];
//        for (int i = 0; i < initStr.length(); i++) {
//            num[i] = (char) (initStr.charAt(i) - '0');
//        }
    }

    public MyBigInteger_old(char[] res) {
        num = res;
    }

    public MyBigInteger_old add(MyBigInteger_old val) {
        int newLength = val.length() > num.length ? val.length() : num.length;
        int minLength = val.length() > num.length ? num.length : val.length();
        char[] res = new char[newLength + 1];

        for (int i = 1; ; i++) {
            if (minLength - i < 0) {
                break;
            }
            res[res.length - i - 1] = (char) ((val.num[val.length() - i] + num[num.length - i]) / 10 + '0');
            res[res.length - i] = (char) ((val.num[val.length() - i] + num[num.length - i]) % 10 + '0');
        }
        return new MyBigInteger_old(res);
    }

    public Integer length() {
        return num.length;
    }

    @Override
    public String toString() {
        return new String(num);
    }


}
