package com.leetcode.zeroToTwoHundred;

/**
 * Created by LiuLiHao on 2020/3/23 0023 下午 03:42
 * @author : LiuLiHao
 * 描述：
 *
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 *
 */
public class LongestPalindromic5 {
    public static void main(String[] args) {

        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {
        if (s==null || "".equals(s)){
            return "";
        }
        int start=0,end=0;

        for (int i = 0; i < s.length(); i++) {
            int lenA = getMaxLength(s, i, i);
            int lenB = getMaxLength(s, i, i + 1);
            int len = Math.max(lenA, lenB);
            if (len > end - start) {
                //开始位置
                start = i - (len - 1) / 2;
                //结束位置
                end = i + len / 2;
            }
        }
        return s.substring(start,end+1);
    }

    /**
     * 向两端扩展 找最长回文串
     * @param s
     * @param left
     * @param right
     * @return
     */
    private static int getMaxLength(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }


}
