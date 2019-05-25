package com.leetcode.removeDuplicatesFromSortedArray;

/**
 * Created by LiuLiHao on 2019/5/25 0025 下午 04:02
 * @author : LiuLiHao
 * 描述：
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 示例 1:
 *
 * 给定数组 nums = [1,1,2],
 *
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 *
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class TestRemove {


    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(nums);
        for (int j = 0; j < i; j++) {
            System.out.print(nums[j]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums==null || nums.length==0){
            return 0;
        }else if(nums.length==1){
            return 1;
        }
        int len = 0;
        //只需要改变数组内容，返回下标
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>nums[len]){
                len++;
                nums[len] = nums[i];
            }
        }
        return len+1;
    }
}
