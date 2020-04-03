package com.leetcode.thirtennToFourteen;

import java.util.Arrays;

/**
 * Created by LiuLiHao on 2020/4/3 0003 下午 02:10
 * @author : LiuLiHao
 * 描述：
 * 给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 5
 * 输出：[-7,-1,1,3,4]
 * 解释：这些数组也是正确的 [-5,-1,1,2,3]，[-3,-1,2,-2,4]。
 * 示例 2：
 *
 * 输入：n = 3
 * 输出：[-1,0,1]
 * 示例 3：
 *
 * 输入：n = 1
 * 输出：[0]
 *  
 *
 * 提示：
 *
 * 1 <= n <= 1000
 *
 */
public class FindUniqueIntegers1304 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(99)));
    }

    public static int[] sumZero(int n) {
        int[] result = new int[n];
        if (n%2==0){
            //偶数个
            int offset = 1;
            for (int i = 0; i < n ; i+=2) {
                result[i] = offset;
                result[i+1] = -offset;
                offset++;
            }
        }else {
            //奇数个
            int offset = 0;
            for (int i = n/2; i >=0 ; i--) {
                result[n/2+offset] = offset;
                result[n/2-offset] = -offset;
                offset++;
            }
        }
        return result;
    }
}
