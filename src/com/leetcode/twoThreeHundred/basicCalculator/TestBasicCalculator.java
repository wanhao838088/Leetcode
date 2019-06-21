package com.leetcode.twoThreeHundred.basicCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by LiuLiHao on 2019/6/21 0021 下午 04:46
 * @author : LiuLiHao
 * 描述：
 * 实现一个基本的计算器来计算一个简单的字符串表达式的值。
 *
 * 字符串表达式可以包含左括号 ( ，右括号 )，加号 + ，减号 -，非负整数和空格  。
 *
 * 示例 1:
 *
 * 输入: "1 + 1"
 * 输出: 2
 * 示例 2:
 *
 * 输入: " 2-1 + 2 "
 * 输出: 3
 * 示例 3:
 *
 * 输入: "(1+(4+5+2)-3)+(6+8)"
 * 输出: 23
 *
 */
public class TestBasicCalculator {

    public static void main(String[] args) {
        String exp = "1";
        int calculate = calculate(exp);
        System.out.println(calculate);

    }

    public static int calculate(String s) {
        //去空格
        s = s.replaceAll(" ","");
        //先转list
        List<String> list = getList(s);
        //再转后缀
        List<String> suffix = getSuffix(list);
        //求值
        int calc = calc(suffix);
        return calc;
    }

    private static int calc(List<String> exps){
        if (exps.size()==0){
            return 0;
        }else if (exps.size()==1){
            return Integer.parseInt(exps.get(0));
        }
        Stack<String> stack = new Stack<>();

        int result = 0,num1=0,num2=0;

        for (int i = 0; i < exps.size(); i++) {
            String token = exps.get(i);

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
    /**
     * 中缀转后缀表达式
     * @param org
     * @return
     */
    private static List<String> getSuffix(List<String> org){
        Stack<String> s1 = new Stack<>();
        List<String> s2 = new ArrayList<>();
        for (int i = 0; i < org.size(); i++) {
            String s = org.get(i);
            if (s.matches("\\d+")){
                //数字直接入
                s2.add(s);
            }else {
                if (s.equals("(")){
                    //左括号直接入
                    s1.push(s);
                }else if(s.equals(")")){
                    //消除括号
                    while (!s1.peek().equals("(")){
                        s2.add(s1.pop());
                    }
                    //消除
                    s1.pop();
                }else {
                    //当前运算符小于等于栈顶的 入栈
                    while (s1.size()!=0 && opertatorPrior(s)<= opertatorPrior(s1.peek())){
                        s2.add(s1.pop());
                    }
                    s1.push(s);
                }
            }
        }
        while (!s1.isEmpty()){
            s2.add(s1.pop());
        }
        return s2;
    }

    private static int opertatorPrior(String s){
        //优先级判断
        switch (s){
            case "+":
                return 1;
            case "-":
                return 1;
            case "*":
                return 2;
            case "/":
                return 2;
            default:return 0;
        }
    }
    private static List<String> getList(String s){
        List<String> result = new ArrayList<>();

        int index = 0;
        String temp = "";
        while (index<s.length()){
            char c = s.charAt(index);

            if (c>47 && c<58){
                temp = "";
                while (c>47 && c<58){
                    temp+=c;
                    index++;
                    if (index<s.length()){
                        c = s.charAt(index);
                        if (c<47 || c>58){
                            index--;
                            break;
                        }
                    }else {
                        break;
                    }
                }
                result.add(temp);
            }else {
                //是操作符
                result.add(s.charAt(index)+"");
            }
            index++;
        }
        return result;
    }


}
