package com.leetcode.twoThreeHundred.wordPattern;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LiuLiHao on 2019/6/26 0026 下午 04:48
 * @author : LiuLiHao
 * 描述：
 * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
 *
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
 *
 * 示例1:
 *
 * 输入: pattern = "abba", str = "dog cat cat dog"
 * 输出: true
 * 示例 2:
 *
 * 输入:pattern = "abba", str = "dog cat cat fish"
 * 输出: false
 * 示例 3:
 *
 * 输入: pattern = "aaaa", str = "dog cat cat dog"
 * 输出: false
 * 示例 4:
 *
 * 输入: pattern = "abba", str = "dog dog dog dog"
 * 输出: false
 */
public class TestWordPattern {
    public static void main(String[] args) {

        String pattern = "aaaa";
        String str = "dog cat cat dog";
        boolean b = wordPattern(pattern, str);
        System.out.println(b);
    }

    public static boolean wordPattern(String pattern, String str) {
        List<String> list = Arrays.asList(str.split(" "));
        //如果长度不一样 就不符合
        if (list.size()!=pattern.length()){
            return false;
        }
        Map<Character,String> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            char c = pattern.charAt(i);
            if (map.containsKey(c)){
                //检查 键 值 是否匹配
                if (!map.get(c).contains(s)){
                    return false;
                }
            }else {
                //如果没有key 但是有字符串 就不匹配
                if (map.containsValue(s)){
                    return false;
                }
                //没有这个key
                map.put(c,s);
            }
        }
        return true;
    }
}
