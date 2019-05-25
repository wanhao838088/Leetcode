package com.leetcode.searchInsertPosition;

/**
 * Created by LiuLiHao on 2019/5/25 0025 下午 05:44
 * @author : LiuLiHao
 * 描述：
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 *
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 *
 * 输入: [1,3,5,6], 0
 * 输出: 0
 */
public class TestSearchInsertPosition {

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int i = searchInsert(arr, 2);
        System.out.println(i);
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums==null || nums.length==0){
            return -1;
        }
        //使用二分查找
        int start=0, end = nums.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if (nums[mid]==target){
                return mid;
            }else if (target<nums[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return start + (end-start)/2;
    }
}
