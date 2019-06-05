package com.leetcode.oneTwoHundred.rotateArray;

import java.util.Arrays;

/**
 * Created by LiuLiHao on 2019/6/5 0005 上午 09:14
 * @author : LiuLiHao
 * 描述：
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 *
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 */
public class TestRotateArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr,2);

        System.out.println(Arrays.toString(arr));
    }

    /**
     * 要求使用原地算法
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        //先把整个数组反转  [5,4,3,2,1]
        reverse(nums, 0, n - 1);
        //然后反转前半部分  [4,5,3,2,1]
        reverse(nums, 0, k - 1);
        //最后反转后半部分  [4,5,1,2,3]
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
    }


}
