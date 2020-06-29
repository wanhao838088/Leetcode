package com.leetcode.twoThreeHundred;

/**
 * Created by LiuLiHao on 2020/6/29 0029 上午 09:56
 * @author : LiuLiHao
 * 描述：
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，
 * 而不是第 k 个不同的元素。
 *
 * 示例 1:
 *
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 * 示例 2:
 *
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 * 说明:
 *
 * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 *
 */
public class KthLargestElement215 {

    public static void main(String[] args) {

        int[] nums = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums, 4));
    }

    public static int findKthLargest(int[] nums, int k) {
        return quickSort(nums,0,nums.length-1,k);
    }

    private static int quickSort(int[] nums, int left, int right,int k) {
        int p = part(nums,left,right);
        if (p + 1 < k) {
            //向右找
            return quickSort(nums, p + 1, right, k);
        } else if (p + 1 > k) {
            //向左找
            return quickSort(nums, left, p - 1, k);
        } else {
            //找到了
            return nums[p];
        }
    }


    private static int part(int[] nums, int left, int right) {
        swap(nums, left, (int) (Math.random() * (right-left+1)) +left );
        //参照元素
        int val = nums[left];
        int j = left;
        for (int i = left + 1; i <= right; i++) {
            int cur = nums[i];
            if (cur >= val) {
                swap(nums, ++j, i);
            }
        }
        swap(nums, left, j);
        return j;
    }

    public static void swap(int[] nums,int i,int j){
        int num = nums[i];
        nums[i] = nums[j];
        nums[j] = num;
    }


}
