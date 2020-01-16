package com.leetcode.thirtennToFourteen;

import java.util.Arrays;

/**
 * Created by LiuLiHao on 2020/1/15 0015 下午 05:57
 * @author : LiuLiHao
 * 描述：
 *
 * 「无零整数」是十进制表示中 不含任何 0 的正整数。
 *
 * 给你一个整数 n，请你返回一个 由两个整数组成的列表 [A, B]，满足：
 *
 * A 和 B 都是无零整数
 * A + B = n
 * 题目数据保证至少有一个有效的解决方案。
 *
 * 如果存在多个有效解决方案，你可以返回其中任意一个。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 2
 * 输出：[1,1]
 * 解释：A = 1, B = 1. A + B = n 并且 A 和 B 的十进制表示形式都不包含任何 0 。
 * 示例 2：
 *
 * 输入：n = 11
 * 输出：[2,9]
 * 示例 3：
 *
 * 输入：n = 10000
 * 输出：[1,9999]
 * 示例 4：
 *
 * 输入：n = 69
 * 输出：[1,68]
 * 示例 5：
 *
 * 输入：n = 1010
 * 输出：[11,999]
 *  
 *
 * 提示：
 *
 * 2 <= n <= 10^4
 *
 */
public class ConvertIntegerToTheSum1317 {

    public static void main(String[] args) {
        int[] noZeroIntegers = getNoZeroIntegers(69);
        System.out.println(Arrays.toString(noZeroIntegers));
    }

    public static int[] getNoZeroIntegers(int n) {
        int[] result = new int[2];
        int left = 1,right = n-1;
        while (left<=right){
            while ( (left+"").contains("0")){
                left++;
            }
            while ( (right+"").contains("0")){
                right--;
            }
            int sum = left + right;
            if (sum==n){
                return new int[]{left,right};
            }else if (sum>n){
                right--;
            }else {
                left++;
            }
        }
        return result;
    }
}
