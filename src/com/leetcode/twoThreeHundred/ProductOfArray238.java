package com.leetcode.twoThreeHundred;

import java.util.Arrays;

/**
 * Created by LiuLiHao on 2020/6/4 0004 上午 10:54
 * @author : LiuLiHao
 * 描述：
 * 给你一个长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 *
 *  
 *
 * 示例:
 *
 * 输入: [1,2,3,4]
 * 输出: [24,12,8,6]
 *  
 *
 * 提示：题目数据保证数组之中任意元素的全部前缀元素和后缀（甚至是整个数组）的乘积都在 32 位整数范围内。
 *
 * 说明: 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
 *
 * 进阶：
 * 你可以在常数空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组不被视为额外空间。）
 *
 */
public class ProductOfArray238 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        //求左边
        result[0] = 1;
        for (int i = 1; i < len; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        }

        int R = 1;
        for (int i = len-1; i >=0; i--) {
            result[i] = result[i] * R;

            R *= nums[i];
        }
        return result;
    }

//    public static int[] productExceptSelf(int[] nums) {
//        int len = nums.length;
//        int[] L = new int[len];
//        int[] R = new int[len];
//        int[] result = new int[len];
//        //求左边
//        L[0] = 1;
//        for (int i = 1; i < len; i++) {
//            L[i] = nums[i - 1] * L[i - 1];
//        }
//
//        //求右边
//        R[len - 1] = 1;
//        for (int i = len - 2; i >= 0; i--) {
//            R[i] = nums[i + 1] * R[i + 1];
//        }
//        for (int i = 0; i < len; i++) {
//            result[i] = L[i] * R[i];
//        }
//        return result;
//    }
}
