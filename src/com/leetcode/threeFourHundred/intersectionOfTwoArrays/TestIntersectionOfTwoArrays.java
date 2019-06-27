package com.leetcode.threeFourHundred.intersectionOfTwoArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by LiuLiHao on 2019/6/27 0027 下午 04:04
 * @author : LiuLiHao
 * 描述：
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 *
 */
public class TestIntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        int[] intersect = intersection(arr1, arr2);
        System.out.println(Arrays.toString(intersect));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length==0 || nums2.length==0){
            return new int[0];
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            list.add(i);
        }
        HashSet<Integer> result = new HashSet<>();

        for (int i : nums2) {
            if (list.contains(i)){
                result.add(i);
                //从list删除
                list.remove(Integer.valueOf(i));
            }
        }
        int[] dist = new int[result.size()];
        int i=0;
        for (Integer integer : result) {
            dist[i] = integer;
            i++;
        }

        return dist;
    }
}
