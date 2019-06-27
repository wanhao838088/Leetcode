package com.leetcode.threeFourHundred.reverseVowelsOfString;

import java.util.Arrays;
import java.util.List;

/**
 * Created by LiuLiHao on 2019/6/27 0027 下午 03:25
 * @author : LiuLiHao
 * 描述：
 *编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 * 示例 1:
 *
 * 输入: "hello"
 * 输出: "holle"
 * 示例 2:
 *
 * 输入: "leetcode"
 * 输出: "leotcede"
 * 说明:
 * 元音字母不包含字母"y"。
 */
public class TestReverseVowelsString {

    public static void main(String[] args) {

        String s = "a.";
        String vowels = reverseVowels(s);
        System.out.println(vowels);
    }

    public static String reverseVowels(String s) {
        if (s==null || s.equals("")){
            return s;
        }
        Character[] chs  = {'a','e','i','o','u','A','E','I','O','U'};
        List<Character> list = Arrays.asList(chs);
        char[] charArray = s.toCharArray();

        int i=0,j=s.length()-1;
        char temp;

        while (i<=j){
            //找到i的元音字母位置
            while (i<=j && !list.contains(s.charAt(i))){
                i++;
            }
            //找到j的元音字母位置
            while (i<=j && !list.contains(s.charAt(j))){
                j--;
            }

            if(i<=j){
                temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                i++;
                j--;
            }
        }


        return new String(charArray);
    }

//    public static String reverseVowels(String s) {
//        if (s==null || s.equals("")){
//            return s;
//        }
//        int index=0;
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        //获取所有元音下标
//        while (index<s.length()){
//            char c = s.charAt(index);
//            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
//                    c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
//                linkedList.add(index);
//            }
//            index++;
//        }
//        int len = linkedList.size();
//        StringBuilder sb = new StringBuilder(s);
//        //交换位置
//        for (int i = 0; i < len/2; i++) {
//            int start = linkedList.get(i);
//            int end = linkedList.get(len-(i+1));
//            char sc = s.charAt(start);
//            char sd = s.charAt(end);
//            sb.replace(start,start+1,sd+"");
//            sb.replace(end,end+1,sc+"");
//        }
//
//        return sb.toString();
//    }
}
