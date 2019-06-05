package com.leetcode.oneTwoHundred.excelSheetColumnNumber;

/**
 * Created by LiuLiHao on 2019/6/4 0004 下午 03:26
 * @author : LiuLiHao
 * 描述：
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 *
 * 例如，
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * 示例 1:
 *
 * 输入: "A"
 * 输出: 1
 * 示例 2:
 *
 * 输入: "AB"
 * 输出: 28
 * 示例 3:
 *
 * 输入: "ZY"
 * 输出: 701
 */
public class TestColumnNumber {

    public static void main(String[] args) {

        String str = "SG";
        int number = titleToNumber(str);
        System.out.println(number);
    }

    public static int titleToNumber(String s) {
        if (s==null||"".equals(s)){
            return 0;
        }
        char[] chars = s.toCharArray();
        int len = chars.length;
        long result = 0;

        for (int i = 0; i < len; i++) {
            //计算是第几位 然后乘 26对应的位数
            int position = len - i-1;
            if (position!=0){
                //计算基数
                int base = 26;
                while (position>1){
                    base*=26;
                    position--;
                }

                int high = (chars[i] - 64) * base;
                result+=high;
            }else {
                //最后一位
                int number = chars[i] - 64;
                result+=number;
            }
        }
        return (int) result;
    }

}
