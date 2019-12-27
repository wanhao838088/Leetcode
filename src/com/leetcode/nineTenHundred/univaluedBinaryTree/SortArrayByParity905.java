package com.leetcode.nineTenHundred.univaluedBinaryTree;

import java.util.Arrays;

/**
 * Created by LiuLiHao on 2019/12/27 0027 上午 09:45
 * @author : LiuLiHao
 * 描述：
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 *
 * 你可以返回满足此条件的任何数组作为答案。
 *
 *  
 *
 * 示例：
 *
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 *  
 *
 * 提示：
 *
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 *
 */
public class SortArrayByParity905 {

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int[] array = sortArrayByParity(nums);

        System.out.println(Arrays.toString(array));
    }

    public static int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];

        int endIndex = A.length-1;
        int startIndex = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i]%2!=0){
                //放后面
                result[endIndex--] = A[i];
            }else {
                result[startIndex++] = A[i];
            }
        }
        return result;
    }

}
