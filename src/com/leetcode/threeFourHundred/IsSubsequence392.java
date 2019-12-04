package com.leetcode.threeFourHundred;

/**
 * Created by LiuLiHao on 2019/12/3 0003 下午 04:49
 * @author : LiuLiHao
 * 描述：
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 *
 * 你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
 *
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 *
 * 示例 1:
 * s = "abc", t = "ahbgdc"
 *
 * 返回 true.
 *
 * 示例 2:
 * s = "axc", t = "ahbgdc"
 *
 * 返回 false.
 *
 * "acb"
 * "ahbgdc"
 *
 */
public class IsSubsequence392 {
    public static void main(String[] args) {

        System.out.println(isSubsequence("b", "c"));
    }

    public static boolean isSubsequence(String s, String t) {
        int index = -1;
        for (char c : s.toCharArray()){
            index = t.indexOf(c, index+1);
            if (index == -1) {
                return false;
            }
        }
        return true;

    }
}
