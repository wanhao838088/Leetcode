package com.leetcode.twoThreeHundred.missingNumber;

import java.util.Arrays;

/**
 * Created by LiuLiHao on 2019/6/18 0018 下午 03:43
 * 描述：
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 *
 * 示例 1:
 *
 * 输入: [3,0,1]
 * 输出: 2
 * 示例 2:
 *
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 *
 */
public class TestMissingNumber {
    public static void main(String[] args) {

        int[] arr = {0,1,2};

        int number = missingNumber(arr);
        System.out.println(number);
    }

    public static int missingNumber(int[] nums) {

        Arrays.sort(nums);

        int start  = nums[0];
        if (start!=0){
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            if (start+1!=nums[i]){
                return start+1;
            }else {
                start = nums[i];
            }
        }
        return nums[nums.length-1]+1;
    }
}
