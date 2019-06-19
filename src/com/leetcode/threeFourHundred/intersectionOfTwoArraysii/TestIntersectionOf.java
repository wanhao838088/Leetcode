package com.leetcode.threeFourHundred.intersectionOfTwoArraysii;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by LiuLiHao on 2019/6/19 0019 下午 05:19
 * @author : LiuLiHao
 * 描述：
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 *
 */
public class TestIntersectionOf {
    public static void main(String[] args) {

        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        int[] intersect = intersect(arr1, arr2);
        System.out.println(Arrays.toString(intersect));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length==0 || nums2.length==0){
            return new int[0];
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            list.add(i);
        }
        ArrayList<Integer> result = new ArrayList<>();

        for (int i : nums2) {
            if (list.contains(i)){
                result.add(i);
                //从list删除
                list.remove(Integer.valueOf(i));
            }
        }
        int[] dist = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            dist[i] = result.get(i);
        }

        return dist;
    }
}
