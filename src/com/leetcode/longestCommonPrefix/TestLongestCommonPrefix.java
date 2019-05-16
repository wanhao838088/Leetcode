package com.leetcode.longestCommonPrefix;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 */
public class TestLongestCommonPrefix {

    public static void main(String[] args) {

        String[] arr = {"aca", "ac"};

        //{"flower","flow","flight"};
        String prefix = longestCommonPrefix(arr);
        System.out.println(prefix);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }
        String result = "";

        //最短字符串大小
        int min = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (min > strs[i].length()) {
                min = strs[i].length();
            }
        }
        for (int i = 0; i < min; i++) {

            char ch = strs[0].charAt(i);
            boolean flag = true;
            for (int j = 1; j < strs.length; j++) {
                //如果不相同 直接返回
                if (ch != strs[j].charAt(i)) {
                    return result;
                }
            }
            if (flag) {
                result += ch;
            }
        }
        return result;
    }
}
