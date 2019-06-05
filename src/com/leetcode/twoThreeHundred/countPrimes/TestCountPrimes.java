package com.leetcode.twoThreeHundred.countPrimes;

/**
 * Created by LiuLiHao on 2019/6/5 0005 下午 02:46
 * @author : LiuLiHao
 * 描述：
 * 统计所有小于非负整数 n 的质数的数量。
 *
 * 示例:
 *
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
public class TestCountPrimes {

    public static void main(String[] args) {
        int i = countPrimes(10);
        System.out.println(i);
    }

    /**
     * 厄拉多塞筛选
     * @param n
     * @return
     */
    public static int countPrimes(int n) {
        int sum = 0;

        //标记数组
        boolean[] temp = new boolean[n];

        //全标记为true
        for (int i = 2; i < temp.length; i++) {
            temp[i] = true;
        }

        //开平方小于 数组长度
        for (int i = 2; i*i < temp.length; i++) {
            if (temp[i]){
                //为倍数的数字 不是素数
                for (int j = i*i; j < temp.length; j+=i) {
                    temp[j] = false;
                }
            }
        }
        for (boolean b : temp) {
            sum+=b?1:0;
        }

        return sum;
    }



    /**
     * 普通方法筛选
     * @param n
     * @return
     */
//    private static boolean isPrime(int n){
//        if (n<=5 && n!=4){
//            return true;
//        }else if (n%2==0){
//            return false;
//        }
//
//        for (int i = 3; i <= Math.sqrt(n)+1; i+=2) {
//            if (n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
}
