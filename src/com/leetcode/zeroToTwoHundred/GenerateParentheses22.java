package com.leetcode.zeroToTwoHundred;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiuLiHao on 2020/4/9 0009 上午 09:50
 * @author : LiuLiHao
 * 描述：
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 *
 * 示例：
 *
 * 输入：n = 3
 * 输出：[
 *        "((()))",
 *        "(()())",
 *        "(())()",
 *        "()(())",
 *        "()()()"
 *      ]
 *
 */
public class GenerateParentheses22 {

    public static void main(String[] args) {
        System.out.println(new GenerateParentheses22().generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans,0, 0,"",n);
        return ans;
    }

    /**
     * @param open 左括号个数
     * @param close 右括号个数
     * @param cur 当前字符串
     * @param max 括号对数
     */
    private void helper(List<String> ans, int open, int close, String cur, int max) {
        if (cur.length() >= max * 2) {
            ans.add(cur);
            return;
        }
        if (open < max) {
            helper(ans, open + 1, close, cur + "(", max);
        }
        if (close < open) {
            helper(ans, open, close + 1, cur + ")", max);
        }
    }


}
