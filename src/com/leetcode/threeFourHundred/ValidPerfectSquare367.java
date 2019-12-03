package com.leetcode.threeFourHundred;

/**
 * Created by LiuLiHao on 2019/12/3 0003 下午 02:21
 * @author : LiuLiHao
 * 描述：
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 *
 * 说明：不要使用任何内置的库函数，如  sqrt。
 *
 * 示例 1：
 *
 * 输入：16
 * 输出：True
 * 示例 2：
 *
 * 输入：14
 * 输出：False
 *
 */
public class ValidPerfectSquare367 {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(14));

    }
    public static boolean isPerfectSquare(int num) {
        if (num<1){
            return false;
        }else if (num==1){
            return true;
        }

        int start = 1;
        int end = 46340;
        while (start<=end){
            int mid = start + (end-start)/2;
            int res = mid * mid;
            if (res==num){
                return true;
            }else if(res<num){
                //往后找
                start = mid+1;
            }else if(res>num){
                //往前找
                end = mid-1;
            }
        }
        return false;
    }
}
