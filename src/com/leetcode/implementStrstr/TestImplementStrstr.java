package com.leetcode.implementStrstr;

/**
 * Created by LiuLiHao on 2019/5/25 0025 下午 04:50
 * @author : LiuLiHao
 * 描述：
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 */
public class TestImplementStrstr {
    public static void main(String[] args) {
        String haystack = "a";
        String needle = "a";

        int i = strStr(haystack, needle);
        System.out.println(i);
    }

    public static int strStr(String haystack, String needle) {
        if (needle.equals("")){
            return 0;
        }
        if (haystack==null || haystack.equals("")){
            return -1;
        }
        if (needle.length()>haystack.length()){
            return -1;
        }

        char[] out = haystack.toCharArray();
        char[] in = needle.toCharArray();

        outer:
        for (int i = 0; i < out.length; i++) {
            if (out[i]==in[0] && i+in.length<=out.length){
                for (int j = 1; j < in.length; j++) {
                    if (out[i+j]!=in[j]){
                        continue outer;
                    }
                }
                return i;
            }

        }
        return -1;
    }
}
