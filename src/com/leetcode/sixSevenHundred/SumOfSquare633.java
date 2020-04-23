package com.leetcode.sixSevenHundred;

/**
 * Created by LiuLiHao on 2020/4/23 0023 上午 09:57
 * @author : LiuLiHao
 * 描述：
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
 *
 * 示例1:
 *
 * 输入: 5
 * 输出: True
 * 解释: 1 * 1 + 2 * 2 = 5
 *  
 *
 * 示例2:
 *
 * 输入: 3
 * 输出: False
 *
 */
public class SumOfSquare633 {
    public static void main(String[] args) {

        System.out.println(judgeSquareSum(3));
    }

    public static boolean judgeSquareSum(int c) {
        long start = 0;
        long end = (int) Math.sqrt(c);
        while (start <= end) {
            long current = start * start + end * end;
            if (current < c) {
                start++;
            } else if (current > c) {
                end--;
            } else {
                return true;
            }
        }

        return false;
    }

}
