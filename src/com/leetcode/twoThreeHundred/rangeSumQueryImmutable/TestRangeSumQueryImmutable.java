package com.leetcode.twoThreeHundred.rangeSumQueryImmutable;

/**
 * Created by LiuLiHao on 2019/6/18 0018 上午 08:39
 * @author : LiuLiHao
 * 描述：
 * 给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
 *
 * 示例：
 *
 * 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
 *
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 * 说明:
 *
 * 你可以假设数组不可变。
 * 会多次调用 sumRange 方法。
 */
public class TestRangeSumQueryImmutable {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);
        int i=0,j=5;

        int param_1 = obj.sumRange(i,j);
        System.out.println(param_1);
    }

}

class NumArray {

    private int[] sums;
    public NumArray(int[] nums) {
        //求和
        if (nums.length<=0){
            return;
        }
        sums = new int[nums.length];
        sums[0]  = nums[0];
        //预先求出所有的和
        for (int i = 1; i < nums.length; i++) {
            sums[i] = sums[i-1] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if (i==0){
            //从头到尾的和
            return sums[j];
        }else {
            //区间求和
            return sums[j] - sums[i-1];
        }
    }
}
