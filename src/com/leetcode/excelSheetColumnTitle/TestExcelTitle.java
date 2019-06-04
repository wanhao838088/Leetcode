package com.leetcode.excelSheetColumnTitle;

/**
 * Created by LiuLiHao on 2019/6/4 0004 上午 10:34
 * @author : LiuLiHao
 * 描述：
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 *
 * 例如，
 *
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *     ...
 * 示例 1:
 *
 * 输入: 1
 * 输出: "A"
 * 示例 2:
 *
 * 输入: 28
 * 输出: "AB"
 * 示例 3:
 *
 * 输入: 701
 * 输出: "ZY"
 */
public class TestExcelTitle {

    public static void main(String[] args) {

        int num = 5666;
        String s = convertToTitle(num);
        System.out.println(s);
    }

    public static String convertToTitle(int n) {
        if (n<=0){
            return "";
        }
        StringBuilder sb = new StringBuilder();

        while (n>0){
            //减一 变成 0-25 的范围 是26进制
            n--;
            sb.append( (char)  (n%26 +'A') );
            n/=26;
        }
        return sb.reverse().toString();
    }
}
