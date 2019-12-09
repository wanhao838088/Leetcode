package com.leetcode.twelveToThirteen;

/**
 * Created by LiuLiHao on 2019/12/9 0009 下午 03:20
 * @author : LiuLiHao
 * 描述：
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 234
 * 输出：15
 * 解释：
 * 各位数之积 = 2 * 3 * 4 = 24
 * 各位数之和 = 2 + 3 + 4 = 9
 * 结果 = 24 - 9 = 15
 * 示例 2：
 *
 * 输入：n = 4421
 * 输出：21
 * 解释：
 * 各位数之积 = 4 * 4 * 2 * 1 = 32
 * 各位数之和 = 4 + 4 + 2 + 1 = 11
 * 结果 = 32 - 11 = 21
 *
 */
public class SubtractTheProductAndSum1281 {

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }

    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1;

        while (n!=0){
            int now = n % 10;
            sum += now;
            mul *= now;
            n /= 10;
        }
        return mul-sum;
    }
}
