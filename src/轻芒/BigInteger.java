package 轻芒;

/**
 * @author Lika
 * @date 2019/01/03 14:55
 * Description:
 * 给定两个大整数（超过 64 位整数表达范围，用字符串表示），
 * 在不使用第三方大整数库的情况下，实现两个整数的相加
 */
public interface BigInteger {

    /**
     * 高精度加法
     *
     * @param bg 要相加的数
     * @return 返回相加后的结果
     */
    public BigInteger add(BigInteger bg);

    /**
     * 取得整数长度
     *
     * @return 返回整数长度
     */
    public Integer length();
}
