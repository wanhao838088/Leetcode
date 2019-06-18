package com.leetcode.oneTwoHundred.validParentheses;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 */
public class TestValidParentheses {

    public static void main(String[] args) {
        boolean valid = isValid("[");
        System.out.println(valid);
    }

    public static boolean isValid(String s) {
        if (s==null||"".contains(s)){
            return true;
        }
        String open = "([{";

        Stack<Character> stack = new Stack<>();
        int index = 0;
        while (index<s.length()){
            char ch = s.charAt(index);
            //是否是开的
            if (open.contains(ch+"")){
                stack.push(ch);
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                //查找匹配
                Character peek = stack.peek();
                switch (peek){
                    case '(':
                        if (ch==')'){
                            stack.pop();
                        }else {
                            return false;
                        }
                        break;
                    case '[':
                        if (ch==']'){
                            stack.pop();
                        }else {
                            return false;
                        }
                        break;
                    case '{':
                        if (ch=='}'){
                            stack.pop();
                        }else {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
            index++;
        }
        //栈为空说明全部匹配了
        if (stack.isEmpty()){
            return true;
        }else {
            return false;
        }

    }
}
