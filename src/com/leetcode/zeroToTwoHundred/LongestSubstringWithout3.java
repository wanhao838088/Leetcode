package com.leetcode.zeroToTwoHundred;

/**
 * Created by LiuLiHao on 2020/3/23 0023 下午 02:41
 * @author : LiuLiHao
 * 描述：
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 */
public class LongestSubstringWithout3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = i;
            char c = s.charAt(temp);
            //子串
            StringBuilder sb = new StringBuilder();
            while (!sb.toString().contains(c+"")){
                sb.append(c);
                len = sb.length()>len? sb.length(): len;
                temp++;
                if (temp>=s.length()){
                    break;
                }
                c = s.charAt(temp);
            }
        }
        return len;
    }
}
