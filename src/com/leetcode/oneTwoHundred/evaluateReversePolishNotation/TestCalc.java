package com.leetcode.oneTwoHundred.evaluateReversePolishNotation;

import java.util.Stack;

/**
 * Created by LiuLiHao on 2019/6/20 0020 上午 08:37
 * @author : LiuLiHao
 * 描述：
 * 根据逆波兰表示法，求表达式的值。
 *
 * 有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
 *
 * 说明：
 *
 * 整数除法只保留整数部分。
 * 给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
 * 示例 1：
 *
 * 输入: ["2", "1", "+", "3", "*"]
 * 输出: 9
 * 解释: ((2 + 1) * 3) = 9
 *
 */
public class TestCalc {

    public static void main(String[] args) {

        String[] exp = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int i = evalRPN(exp);
        System.out.println(i);
    }

    public static int evalRPN(String[] tokens) {
        if (tokens.length==0){
            return 0;
        }else if (tokens.length==1){
            return Integer.parseInt(tokens[0]);
        }
        Stack<String> stack = new Stack<>();

        int result = 0,num1=0,num2=0;

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            try {
                int parseInt = Integer.parseInt(token);
                stack.push(token);
            } catch (NumberFormatException e) {
                //是运算符
                num2 = Integer.parseInt(stack.pop());
                num1 = Integer.parseInt(stack.pop());

                switch (token){
                    case "+":
                        result = num1+num2;
                        break;
                    case "-":
                        result = num1-num2;
                        break;
                    case "*":
                        result = num1*num2;
                        break;
                    case "/":
                        result = (int) (1.0*num1/num2);
                        break;
                    default:break;
                }
                stack.push(result+"");
            }
        }
        return result;
    }
}
