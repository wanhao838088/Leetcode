package com.leetcode.twoThreeHundred.powerOfTwo;

/**
 * Created by LiuLiHao on 2019/6/8 0008 下午 03:09
 *
 * @author : LiuLiHao
 * 描述：
 *给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 1
 * 输出: true
 * 解释: 20 = 1
 * 示例 2:
 *
 * 输入: 16
 * 输出: true
 * 解释: 24 = 16
 * 示例 3:
 *
 * 输入: 218
 * 输出: false
 *
 */
public class TestPowerOfTwo {


    public static void main(String[] args) {
        boolean power = isPowerOfTwo(2147483646);
        System.out.println(power);
    }

    public static  boolean isPowerOfTwo(int n) {
        if (n==1 || n==2){
            return true;
        }else if (n<0 || n%2!=0){
            return false;
        }
        for (int i = 1;; i++) {
            double pow = Math.pow(2, i);
            if (pow==n){
                return true;
            }
            if (pow>n){
                break;
            }
        }
        return false;
    }
}
