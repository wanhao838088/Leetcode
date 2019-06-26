package com.leetcode.twoThreeHundred.uglyNumber;

/**
 * Created by LiuLiHao on 2019/6/26 0026 下午 04:32
 * @author : LiuLiHao
 * 描述：
 * 编写一个程序判断给定的数是否为丑数。
 *
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 *
 * 示例 1:
 *
 * 输入: 6
 * 输出: true
 * 解释: 6 = 2 × 3
 * 示例 2:
 *
 * 输入: 8
 * 输出: true
 * 解释: 8 = 2 × 2 × 2
 * 示例 3:
 *
 * 输入: 14
 * 输出: false
 * 解释: 14 不是丑数，因为它包含了另外一个质因数 7。
 *
 */
public class TestUglyNumber {

    public static void main(String[] args) {
        System.out.println(isUgly(8));
    }

    public static boolean isUgly(int num) {
        if (num==1){
            return true;
        }else if (num==0){
            return false;
        }
        //递归调
        if (num%2==0){
            return isUgly(num/2);
        }else if(num%3==0 ){
            return isUgly(num/3);
        }else if(num%5==0){
            return isUgly(num/5);
        }else {
            return false;
        }
    }
}
