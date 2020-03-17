package com.leetcode.elevenToTwelve;

/**
 * Created by LiuLiHao on 2020/3/17 0017 上午 10:30
 * @author : LiuLiHao
 * 描述：
 * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
 *
 * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
 *
 * 注意：每次拼写时，chars 中的每个字母都只能用一次。
 *
 * 返回词汇表 words 中你掌握的所有单词的 长度之和。
 *  
 *
 * 示例 1：
 *
 * 输入：words = ["cat","bt","hat","tree"], chars = "atach"
 * 输出：6
 * 解释：
 * 可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
 * 示例 2：
 *
 * 输入：words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * 输出：10
 * 解释：
 * 可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
 *
 */
public class FindWords1160 {

    public static void main(String[] args) {

        String[] words = {"hello","world","leetcode"};

        String chars = "welldonehoneyr";

        System.out.println(countCharacters(words,chars));

    }

//    public static int countCharacters(String[] words, String chars) {
//
//        int sum = 0;
//        for (int i = 0; i < words.length; i++) {
//
//            char[] array = words[i].toCharArray();
//            boolean flag = true;
//
//            Map<Character,Integer> map = new HashMap<>(16);
//
//            for (int j = 0; j < array.length; j++) {
//                //上一次索引
//                Integer lastIndex = map.getOrDefault(array[j], 0);
//
//                int index = chars.indexOf(array[j],lastIndex);
//                if (index<0){
//                    flag = false;
//                    break;
//                }else {
//                    map.put(array[j],index+1);
//                }
//            }
//            //如果匹配 加长度
//            if (flag){
//                sum+=array.length;
//            }
//        }
//        return sum;
//    }

    public static int countCharacters(String[] words, String chars) {
        int sum = 0;

        //统计给定字符串字符数量
        int[] countArray = new int[26];
        for (char c : chars.toCharArray()) {
            countArray[c - 'a']++;
        }

        for (String word : words) {
            char[] charArray = word.toCharArray();

            //统计当前单词字符数量
            int[] current = new int[26];
            for (char c : charArray) {
                current[c - 'a']++;
            }
            boolean flag = true;
            //比较是否满足条件
            for (int i = 0; i < 26; i++) {
                if (countArray[i]<current[i]){
                    flag = false;
                    break;
                }
            }
            if (flag){
                sum += charArray.length;
            }

        }

        return sum;
    }

}
