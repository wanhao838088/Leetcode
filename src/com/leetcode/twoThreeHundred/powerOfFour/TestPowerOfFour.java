package com.leetcode.twoThreeHundred.powerOfFour;

/**
 * Created by LiuLiHao on 2019/6/10 0010 上午 11:14
 *
 * @author : LiuLiHao
 * 描述：
 * 给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 16
 * 输出: true
 * 示例 2:
 *
 * 输入: 5
 * 输出: false
 *
 */
public class TestPowerOfFour {

    public static void main(String[] args) {

        boolean powerOfFour = isPowerOfFour(1);
        System.out.println(powerOfFour);
    }

    public static boolean isPowerOfFour(int num) {
        if (num==1){
            return true;
        } else if(num%2!=0){
            return false;
        }

        for (int i = 0;; i++) {
            double val = Math.pow(4, i);
            if (val==num){
                return true;
            }else if (val>num){
                return false;
            }
        }
    }
}
