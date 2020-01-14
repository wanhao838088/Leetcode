package com.leetcode.elevenToTwelve;

import java.util.Arrays;

/**
 * Created by LiuLiHao on 2020/1/14 0014 下午 01:56
 * @author : LiuLiHao
 * 描述：
 * 给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。
 *
 * 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。
 *
 * 示例 1：
 *
 * 输入：text = "nlaebolko"
 * 输出：1
 *
 */
public class MaximumNumberBalloons1189 {

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("leetcode"));
    }

    public static int maxNumberOfBalloons(String text) {
        //balloon
        int bCount=0,aCount=0,lCount=0,oCount=0,nCount=0;

        char[] charArray = text.toCharArray();
        for (char c : charArray) {
            switch (c){
                case 'b':
                     bCount++;
                     break;
                case 'a':
                    aCount++;
                    break;
                case 'l':
                    lCount++;
                    break;
                case 'o':
                    oCount++;
                    break;
                case 'n':
                    nCount++;
                    break;
                default:
                    break;
            }
        }
        lCount/=2;
        oCount/=2;
        int[] array = {bCount,aCount,lCount,oCount,nCount};
        Arrays.sort(array);

        return array[0];
    }
}
