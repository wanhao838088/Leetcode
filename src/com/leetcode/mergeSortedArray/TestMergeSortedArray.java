package com.leetcode.mergeSortedArray;

import java.util.Arrays;

/**
 * Created by LiuLiHao on 2019/5/29 0029 下午 04:12
 * @author : LiuLiHao
 * 描述：
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 *
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 */
public class TestMergeSortedArray {

    public static void main(String[] args) {

        int[] arr1 = {2,0};
        int[] arr2 = {1};

        merge(arr1,1,arr2,1);

        System.out.println(Arrays.toString(arr1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //如果一半的数组为空 不用合并
        if (nums1==null || nums1.length==0){
            return;
        }else if(nums2==null||nums2.length==0){
            return;
        }
        //临时数组
        int[] copy = new int[nums1.length];
        int j = 0,k=0;
        //使用归并的方法进行合并
        for (int i = 0; i < copy.length; i++) {
            if (j>=m){
                copy[i] = nums2[k];
                k++;
            }else if(k>=n){
                copy[i] = nums1[j];
                j++;
            }else if (nums1[j]<nums2[k]){
                copy[i] = nums1[j];
                j++;
            }else if(nums1[j]>=nums2[k]){
                copy[i] = nums2[k];
                k++;
            }
        }
        for (int i = 0; i < copy.length; i++) {
            nums1[i] = copy[i];
        }
    }
}
