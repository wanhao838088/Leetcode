package com.leetcode.threeFourHundred.findTheDifference;

/**
 * Created by LiuLiHao on 2019/6/19 0019 下午 05:06
 * @author : LiuLiHao
 * 描述：
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 *
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *
 * 请找出在 t 中被添加的字母。
 *
 *  
 *
 * 示例:
 *
 * 输入：
 * s = "abcd"
 * t = "abcde"
 *
 * 输出：
 * e
 *
 * 解释：
 * 'e' 是那个被添加的字母。
 */
public class TestFindTheDifference {
    public static void main(String[] args) {

        char c = findTheDifference("abcde", "abcd");
        System.out.println(c);
    }

    /**
     * 使用求差 得到字符
     * @param s
     * @param t
     * @return
     */
    public static char findTheDifference(String s, String t) {
        int sum1=0,sum2=0;

        char[] arr1 = s.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            sum1+=arr1[i];
        }

        char[] arr2 = t.toCharArray();
        for (int i = 0; i < arr2.length; i++) {
            sum2+=arr2[i];
        }
        return (char) Math.abs(sum1-sum2);
    }
}
