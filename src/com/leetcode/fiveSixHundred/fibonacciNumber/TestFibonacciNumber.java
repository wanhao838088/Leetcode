package com.leetcode.fiveSixHundred.fibonacciNumber;

/**
 * Created by LiuLiHao on 2019/7/3 0003 上午 09:21
 * @author : LiuLiHao
 * 描述：
 */
public class TestFibonacciNumber {


    public static void main(String[] args) {
        System.out.println(fib(2));
    }

    public static int fib(int N) {
        int[] arr = new int[31];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[N];
    }
}
