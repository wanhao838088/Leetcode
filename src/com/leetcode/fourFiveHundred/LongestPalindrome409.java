package com.leetcode.fourFiveHundred;

/**
 * Created by LiuLiHao on 2020/3/19 0019 下午 03:18
 * @author : LiuLiHao
 * 描述：
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 *
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 *
 * 注意:
 * 假设字符串的长度不会超过 1010。
 *
 * 示例 1:
 *
 * 输入:
 * "abccccdd"
 *
 * 输出:
 * 7
 *
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 */
public class LongestPalindrome409 {

    public static void main(String[] args) {

        System.out.println(longestPalindrome("abccccdd"));
    }

    public static int longestPalindrome(String s) {
        char[] chars = s.toCharArray();

        int[] array = new int[58];
        for (char c : chars) {
            array[c - 'A']++;
        }
        int len = 0;
        for (int i : array) {
            len += (i / 2) * 2;
        }
        if (len < s.length()) {
            len++;
        }
        return len;
    }

}
