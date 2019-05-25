package com.leetcode.lengthOfLastWord;

/**
 * Created by LiuLiHao on 2019/5/25 0025 下午 07:22
 * @author : LiuLiHao
 * 描述：
 *
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * 示例:
 *
 * 输入: "Hello World"
 * 输出: 5
 */
public class TestLengthOfLastWord
{

    public static void main(String[] args) {

        String s = "        ";
        int i = lengthOfLastWord(s);
        System.out.println(i);
    }

    public static int lengthOfLastWord(String s) {

        String[] split = s.split(" ");
        if (split.length>=2){
            return split[split.length-1].length();
        }else {
            s = s.replaceAll(" ","");
            return s.length();
        }
    }
}
