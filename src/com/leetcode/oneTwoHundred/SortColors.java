package com.leetcode.oneTwoHundred;

import java.util.Arrays;

/**
 * Created by LiuLiHao on 2019/10/11 0011 上午 09:23
 *
 * @author : LiuLiHao
 * 描述：
 *
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 *
 * 注意:
 * 不能使用代码库中的排序函数来解决这道题。
 *
 * 示例:
 *
 * 输入: [2,0,2,1,1,0]
 * 输出: [0,0,1,1,2,2]
 * 进阶：
 *
 * 一个直观的解决方案是使用计数排序的两趟扫描算法。
 * 首先，迭代计算出0、1 和 2 元素的个数，然后按照0、1、2的排序，重写当前数组。
 * 你能想出一个仅使用常数空间的一趟扫描算法吗？
 *
 */
public class SortColors {

    public static void main(String[] args) {
        int[] nums = {1,2,0,1,1,2,2,0,0,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 使用快速排序的思想
     * @param nums
     */
    public static void sortColors(int[] nums) {
        //存放0的区域
        int zero = -1;
        //存放2的区域
        int two = nums.length;

        for (int i = 0; i < two; ) {
            if (nums[i]==0){
                //放到0的位置
                zero++;
                swap(nums,i,zero);
                i++;
            }else if (nums[i]==2){
                //放到2的位置
                two--;
                swap(nums,two,i);
            }else{
                //等于1
                i++;
            }
        }
    }

    public static void swap(int[] nums,int i,int j){
        int num = nums[i];
        nums[i] = nums[j];
        nums[j] = num;
    }
}
