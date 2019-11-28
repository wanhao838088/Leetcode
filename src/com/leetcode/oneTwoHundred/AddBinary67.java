package com.leetcode.oneTwoHundred;

/**
 * Created by LiuLiHao on 2019/11/28 0028 下午 03:31
 * @author : LiuLiHao
 * 描述：
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 */
public class AddBinary67 {

    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;

        int carry = 0;
        while (lenA >= 0 || lenB >= 0 || carry > 0) {
            carry += lenA >= 0 ? a.charAt(lenA--) - '0' : 0;
            carry += lenB >= 0 ? b.charAt(lenB--) - '0' : 0;
            builder.append(carry % 2);
            carry /=2 ;
        }

        return builder.reverse().toString();
    }
}
