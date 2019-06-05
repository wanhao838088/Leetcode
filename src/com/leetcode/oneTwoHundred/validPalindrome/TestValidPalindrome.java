package com.leetcode.oneTwoHundred.validPalindrome;

/**
 * Created by LiuLiHao on 2019/6/2 0002 下午 04:06
 * @author : LiuLiHao
 * 描述：
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 */
public class TestValidPalindrome {

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(" ");
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(String s) {
        if (s==null){
            return true;
        }
        //去空格 和 符号
        s = s.replaceAll("\\s","").replaceAll("\\p{P}","").replaceAll("\\p{S}","");

        String org = s;
        //把字符串倒过来
        String now = new StringBuilder(s).reverse().toString();
        if (org.equalsIgnoreCase(now)){
            return true;
        }
        return false;
    }
}
