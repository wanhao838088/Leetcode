package com.leetcode.fourFiveHundred.numberOfSegmentsInAstring;

/**
 * Created by LiuLiHao on 2019/7/3 0003 上午 09:58
 * @author : LiuLiHao
 * 描述：
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 *
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 *
 * 示例:
 *
 * 输入: "Hello, my name is John"
 * 输出: 5
 */
public class TestNumber {

    public static void main(String[] args) {

        //", , , ,        a, eaefa"
        System.out.println(countSegments(", , , ,        a, eaefa"));
    }
    public static int countSegments(String s) {
        if (s==null || s.equals("")){
            return 0;
        }
        int count = 0;
        String[] strs = s.split(" ");
        for (String str : strs) {
            if (!"".equals(str)) {
                count++;
            }
        }
        return count;
    }
}
