package com.leetcode.eightNineHundred.backspaceStringCompare;

import java.util.Stack;

/**
 * Created by LiuLiHao on 2019/6/18 0018 上午 10:52
 * @author : LiuLiHao
 * 描述：
 * 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：S = "ab#c", T = "ad#c"
 * 输出：true
 * 解释：S 和 T 都会变成 “ac”。
 * 示例 2：
 *
 * 输入：S = "ab##", T = "c#d#"
 * 输出：true
 * 解释：S 和 T 都会变成 “”。
 * 示例 3：
 *
 * 输入：S = "a##c", T = "#a#c"
 * 输出：true
 * 解释：S 和 T 都会变成 “c”。
 * 示例 4：
 *
 * 输入：S = "a#c", T = "b"
 * 输出：false
 * 解释：S 会变成 “c”，但 T 仍然是 “b”。
 *
 */
public class TestBackspaceStringCompare {

    public static void main(String[] args) {
        String s1 = "fo##f";
        String s2 = "f#o##f";

        boolean compare = backspaceCompare(s1, s2);
        System.out.println(compare);
    }

    public static boolean backspaceCompare(String S, String T) {
        return getStr(S).equals(getStr(T));
    }

    private static String getStr(String s){
        Stack<Character> stack1 = new Stack<>();
        //第一个栈
        for (int i = 0; i < s.toCharArray().length; i++) {
            char ch = s.charAt(i);
            if (ch=='#' && !stack1.isEmpty()){
                stack1.pop();
            }else if (ch!='#'){
                stack1.push(ch);
            }
        }
        StringBuilder sb1 = new StringBuilder();
        while (!stack1.isEmpty()){
            sb1.append(stack1.pop());
        }
        return sb1.toString();
    }
}
