package com.leetcode.threeFourHundred.firstUniqueCharacterInString;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by LiuLiHao on 2019/6/28 0028 下午 05:22
 * @author : LiuLiHao
 * 描述：
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 案例:
 *
 * s = "leetcode"
 * 返回 0.
 *
 * s = "loveleetcode",
 * 返回 2.
 */
public class TestFirst {
    public static void main(String[] args) {

        int i = firstUniqChar("loveleetcode");
        System.out.println(i);
    }

    public static int firstUniqChar(String s) {
        if (s==null|| s.length()==0){
            return -1;
        }
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                Integer count = map.get(c);
                map.put(c,++count);
            }else {
                map.put(c,1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        int i = 0;
        for (Map.Entry<Character, Integer> entry : entries) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            //找到次数是1的 第一个出现的
            if (value==1){
                //获取key在字符串中的位置
                return s.indexOf(key);
            }
            i++;
        }

        return -1;
    }
}
