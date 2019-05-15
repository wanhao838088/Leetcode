package com.leetcode.climbingstairs;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 * <p>
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 *
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 */
public class TestClimbingStairs {

    public static void main(String[] args) {

        int i = climbStairs(44);
        System.out.println(i);
    }

    public static int climbStairs(int n) {
        if (n<=2){
            return n;
        }
        int sum = 0;
        int num1 = 1;
        int num2 = 2;
        int k = 3;
        //斐波那契的循环实现
        while (k<=n){
            sum = num1+num2;
            num1 = num2;
            num2 = sum;
            k++;
        }
        return sum;
    }
}
