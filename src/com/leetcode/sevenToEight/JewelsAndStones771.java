package com.leetcode.sevenToEight;

/**
 * Created by LiuLiHao on 2019/12/4 0004 下午 03:47
 * @author : LiuLiHao
 * 描述：
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 *
 * 示例 1:
 *
 * 输入: J = "aA", S = "aAAbbbb"
 * 输出: 3
 * 示例 2:
 *
 * 输入: J = "z", S = "ZZ"
 * 输出: 0
 *
 */
public class JewelsAndStones771 {

    public static void main(String[] args) {

        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String J, String S) {
        char[] chs = J.toCharArray();
        int sum = 0;
        for (char c : S.toCharArray()) {
            for (char tp : chs) {
                if (tp==c){
                    sum++;
                }
            }
        }
        return sum;
    }
}
