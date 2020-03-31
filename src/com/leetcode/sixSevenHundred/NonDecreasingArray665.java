package com.leetcode.sixSevenHundred;

/**
 * Created by LiuLiHao on 2019/12/18 0018 下午 03:13
 * @author : LiuLiHao
 * 描述：
 * 给定一个长度为 n 的整数数组，你的任务是判断在最多改变 1 个元素的情况下，该数组能否变成一个非递减数列。
 *
 * 我们是这样定义一个非递减数列的： 对于数组中所有的 i (1 <= i < n)，满足 array[i] <= array[i + 1]。
 *
 * 示例 1:
 *
 * 输入: [4,2,3]
 * 输出: True
 * 解释: 你可以通过把第一个4变成1来使得它成为一个非递减数列。
 * 示例 2:
 *
 * 输入: [4,2,1]
 * 输出: False
 * 解释: 你不能在只改变一个元素的情况下将其变为非递减数列。
 * 说明:  n 的范围为 [1, 10,000]。
 *
 */
public class NonDecreasingArray665 {
    public static void main(String[] args) {
        int[] nums = {3,4,2,3};

        System.out.println(checkPossibility(nums));
    }

    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                int temp = nums[i];

                if (i == 0) {
                    //开头的数比后面的数大
                    nums[i] = nums[i + 1];
                } else {
                    nums[i] = nums[i - 1];
                }

                if (nums[i] > nums[i + 1]) {
                    nums[i] = temp;
                    nums[i + 1] = nums[i];
                }
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
