package com.leetcode.sevenToEight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiuLiHao on 2020/3/30 0030 下午 03:25
 * @author : LiuLiHao
 * 描述：
 * 给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
 *
 * 示例:
 * 输入: S = "a1b2"
 * 输出: ["a1b2", "a1B2", "A1b2", "A1B2"]
 *
 * 输入: S = "3z4"
 * 输出: ["3z4", "3Z4"]
 *
 * 输入: S = "12345"
 * 输出: ["12345"]
 * 注意：
 *
 * S 的长度不超过12。
 * S 仅由数字和字母组成
 *
 */
public class LetterCasePermutation784 {
    public static void main(String[] args) {
        System.out.println(letterCasePermutation("mQe"));
    }

    static List<String> result = new ArrayList<>();

    public static List<String> letterCasePermutation(String S) {
        char[] array = S.toCharArray();
        helper(array,0);
        return result;
    }

    private static void helper(char[] array, int index) {
        result.add(String.valueOf(array));
        for (int i = index; i < array.length; i++) {
            char cur = array[i];
            if (Character.isDigit(cur)){
                continue;
            }else if (Character.isLowerCase(cur)){
                //小写变大写
                array[i] = Character.toUpperCase(cur);
                helper(array,i+1);
                array[i] = Character.toLowerCase(cur);
            }else {
                //大写变小写
                array[i] = Character.toLowerCase(cur);
                helper(array,i+1);
                array[i] = Character.toUpperCase(cur);
            }
        }
    }

}
