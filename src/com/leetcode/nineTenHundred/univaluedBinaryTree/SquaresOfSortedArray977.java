package com.leetcode.nineTenHundred.univaluedBinaryTree;

import java.util.Arrays;

/**
 * Created by LiuLiHao on 2019/12/17 0017 下午 03:38
 * @author : LiuLiHao
 * 描述：
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 示例 2：
 *
 * 输入：[-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 *
 */
public class SquaresOfSortedArray977 {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ints = sortedSquares(nums);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
             A[i] *= A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
