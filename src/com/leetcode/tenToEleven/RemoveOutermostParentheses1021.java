package com.leetcode.tenToEleven;

/**
 * Created by LiuLiHao on 2019/12/9 0009 下午 03:57
 * @author : LiuLiHao
 * 描述：
 * 有效括号字符串为空 ("")、"(" + A + ")" 或 A + B，其中 A 和 B 都是有效的括号字符串，+ 代表字符串的连接。例如，""，"()"，"(())()" 和 "(()(()))" 都是有效的括号字符串。
 *
 * 如果有效字符串 S 非空，且不存在将其拆分为 S = A+B 的方法，我们称其为原语（primitive），其中 A 和 B 都是非空有效括号字符串。
 *
 * 给出一个非空有效字符串 S，考虑将其进行原语化分解，使得：S = P_1 + P_2 + ... + P_k，其中 P_i 是有效括号字符串原语。
 *
 * 对 S 进行原语化分解，删除分解中每个原语字符串的最外层括号，返回 S 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入："(()())(())"
 * 输出："()()()"
 * 解释：
 * 输入字符串为 "(()())(())"，原语化分解得到 "(()())" + "(())"，
 * 删除每个部分中的最外层括号后得到 "()()" + "()" = "()()()"。
 * 示例 2：
 *
 * 输入："(()())(())(()(()))"
 * 输出："()()()()(())"
 * 解释：
 * 输入字符串为 "(()())(())(()(()))"，原语化分解得到 "(()())" + "(())" + "(()(()))"，
 * 删除每隔部分中的最外层括号后得到 "()()" + "()" + "()(())" = "()()()()(())"。
 * 示例 3：
 *
 * 输入："()()"
 * 输出：""
 * 解释：
 * 输入字符串为 "()()"，原语化分解得到 "()" + "()"，
 * 删除每个部分中的最外层括号后得到 "" + "" = ""。
 *
 */
public class RemoveOutermostParentheses1021 {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
    }

    public static String removeOuterParentheses(String S) {

        StringBuilder result = new StringBuilder();

        int left = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(' && left++ > 0) {
                result.append('(');

            } else if (S.charAt(i) == ')' && --left > 0) {
                result.append(')');
            }
        }
        return result.toString();
    }
//    public static String removeOuterParentheses(String S) {
//
//        final char start = '(';
//        final char end = ')';
//
//        int sStart = 0;
//        int sEnd = 0;
//
//        if (S==null || S.equals("")){
//            return "";
//        }
//        StringBuilder result = new StringBuilder();
//
//        Queue<Character> stack = new LinkedList<>();
//        for (char c : S.toCharArray()) {
//            if (c==start){
//                stack.add(c);
//                sStart++;
//            }else if (c==end){
//                sEnd++;
//                stack.add(c);
//                if (sStart==sEnd){
//                    String temp = "";
//                    //弹出
//                    while (!stack.isEmpty()){
//                        Character poll = stack.poll();
//                        temp +=poll;
//                    }
//                    //去掉开头和结尾
//                    temp = temp.substring(1,temp.length()-1);
//                    result.append(temp);
//                }
//
//            }
//        }
//
//        return result.toString();
//    }
}
