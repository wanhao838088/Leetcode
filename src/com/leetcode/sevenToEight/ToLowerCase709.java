package com.leetcode.sevenToEight;

/**
 * Created by LiuLiHao on 2019/12/4 0004 下午 04:19
 * @author : LiuLiHao
 * 描述：
 *实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 *
 *  
 *
 * 示例 1：
 *
 * 输入: "Hello"
 * 输出: "hello"
 * 示例 2：
 *
 * 输入: "here"
 * 输出: "here"
 * 示例 3：
 *
 * 输入: "LOVELY"
 * 输出: "lovely"
 *
 */
public class ToLowerCase709 {

    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
    }

    public static String toLowerCase(String str) {
        StringBuilder sb=new StringBuilder();

        for (char c : str.toCharArray()) {
            c |= 32;
            sb.append(c);
        }

        return sb.toString();
    }
}
