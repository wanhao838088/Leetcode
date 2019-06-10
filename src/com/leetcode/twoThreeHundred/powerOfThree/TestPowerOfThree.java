package com.leetcode.twoThreeHundred.powerOfThree;

/**
 * Created by LiuLiHao on 2019/6/10 0010 上午 10:42
 *
 * @author : LiuLiHao
 * 描述：
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 27
 * 输出: true
 * 示例 2:
 *
 * 输入: 0
 * 输出: false
 * 示例 3:
 *
 * 输入: 9
 * 输出: true
 * 示例 4:
 *
 * 输入: 45
 * 输出: false
 *
 */
public class TestPowerOfThree {

    public static void main(String[] args) {
        boolean powerOfThree = isPowerOfThree(2);
        System.out.println(powerOfThree);
    }

    public static boolean isPowerOfThree(int n) {
        int[] arr = {1,3,9,27,81,243,729,2187,6561,19683,59049,177147,531441,1594323,4782969,14348907,43046721,129140163,387420489,1162261467};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==n){
                return true;
            }
        }
        return false;
        //        if (n==1){
//            return true;
//        }else if(n%3!=0){
//            return false;
//        }
//
//        for (int i = 0;; i++) {
//            double val = Math.pow(3, i);
//            if (val==n){
//                return true;
//            }else if (val>n){
//                return false;
//            }
//        }
    }
}
