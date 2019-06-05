package com.leetcode.oneTwoHundred.sqrtx;

/**
 * Created by LiuLiHao on 2019/5/28 0028 下午 08:33
 *
 * @author : LiuLiHao
 * 描述：
 * 实现 int sqrt(int x) 函数。
 * <p>
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * <p>
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 4
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 * 由于返回类型是整数，小数部分将被舍去。
 */
public class TestSqrtx {

    public static void main(String[] args) {

        int i = mySqrt(9);
        System.out.println(i);
    }

    public static int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        long l = 1L, r = x/2+1;
        //类似二分查找
        while (l <= r) {
            long mid = (r+l)/2;
            long sq = mid * mid;
            if(sq == x) {
                return (int)mid;
            }else if(sq < x) {
                l = mid+1;
            }else {
                r = mid-1;
            }
        }
        return (int)r;
    }
}
