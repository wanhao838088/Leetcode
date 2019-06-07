package com.leetcode.twoThreeHundred.containsDuplicateii;

/**
 * Created by LiuLiHao on 2019/6/7 0007 下午 09:18
 *
 * @author : LiuLiHao
 * 描述：
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,3,1], k = 3
 * 输出: true
 * 示例 2:
 *
 * 输入: nums = [1,0,1,1], k = 1
 * 输出: true
 * 示例 3:
 *
 * 输入: nums = [1,2,3,1,2,3], k = 2
 * 输出: false
 *
 */
public class TestContainsDuplicateTwo {

    public static void main(String[] args) {
        int[] arr = {1,0,1,1};

        boolean duplicate = containsNearbyDuplicate(arr, 1);
        System.out.println(duplicate);

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        if (nums.length<=1){
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];

            //不越界 并且 在k之内重复了
            for (int j = i+1; j < nums.length && j<=i+k; j++) {
                if (nums[j]==val){
                    return true;
                }
            }
        }
        return false;
    }
}
