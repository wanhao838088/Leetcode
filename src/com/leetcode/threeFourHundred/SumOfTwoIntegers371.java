package com.leetcode.threeFourHundred;

/**
 * Created by LiuLiHao on 2019/12/3 0003 下午 03:45
 * @author : LiuLiHao
 * 描述：
 * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
 *
 * 示例 1:
 *
 * 输入: a = 1, b = 2
 * 输出: 3
 * 示例 2:
 *
 * 输入: a = -2, b = 3
 * 输出: 1
 *
 */
public class SumOfTwoIntegers371 {

    public static void main(String[] args) {

        System.out.println(getSum(1, 2));
    }
    public static int getSum(int a, int b) {
        if (b == 0) {
            return a;
        }
        //取进位
        int step = (a & b)<<1;
        //无进位的相加 + 进位
        return getSum(a ^ b, step);
    }
}
