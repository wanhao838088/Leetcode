package com.leetcode.factorialTrailingZeroes;

/**
 * Created by LiuLiHao on 2019/6/4 0004 下午 04:58
 * @author : LiuLiHao
 * 描述：
 *给定一个整数 n，返回 n! 结果尾数中零的数量。
 *
 * 示例 1:
 *
 * 输入: 3
 * 输出: 0
 * 解释: 3! = 6, 尾数中没有零。
 * 示例 2:
 *
 * 输入: 5
 * 输出: 1
 * 解释: 5! = 120, 尾数中有 1 个零.
 */
public class TestFactorialTrailingZeroes {

    public static void main(String[] args) {

        int zeroes = trailingZeroes(5);
        System.out.println(zeroes);
    }


    public static int trailingZeroes(int n) {
        //求5出现的个数
        int count = 0;
        while (n>=5){
            count+= n/5;
            n/=5;
        }
        return count;
    }

    /**
     * 先求阶乘在找0的个数 会超出数值范围
     * @param n
     * @return
     */
//    public static int trailingZeroes(int n) {
//        if (n<=0){
//            return 0;
//        }
//        //阶乘的结果
//        long result = 1;
//        for (int i = 1; i <= n; i++) {
//            result*= i;
//        }
//        String temp = result+"";
//        int count = 0;
//        for (int i = 0; i < temp.length(); i++) {
//            if (temp.charAt((temp.length()-i-1))=='0'){
//                count++;
//            }else {
//                break;
//            }
//        }
//        return count;
//    }
}
