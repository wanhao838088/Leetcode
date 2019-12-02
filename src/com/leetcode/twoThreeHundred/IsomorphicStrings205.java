package com.leetcode.twoThreeHundred;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LiuLiHao on 2019/12/2 0002 下午 03:10
 * @author : LiuLiHao
 * 描述：
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 *
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 *
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 *
 * 示例 1:
 *
 * 输入: s = "egg", t = "add"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "foo", t = "bar"
 * 输出: false
 * 示例 3:
 *
 * 输入: s = "paper", t = "title"
 * 输出: true
 *
 */
public class IsomorphicStrings205 {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("paper", "title"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> map = new HashMap<>(16);

        for (int i = 0; i < s.length(); i++) {

            char chs = s.charAt(i);
            char cht = t.charAt(i);

            if (!map.containsKey(chs)){
                if (map.containsValue(cht)){
                    return false;
                }
                //如果不包含 就放进去
                map.put(chs,cht);
            }else {
                //比较是否一样
                if (map.get(chs)!=cht){
                    return false;
                }
            }
        }
        return true;
    }
}
