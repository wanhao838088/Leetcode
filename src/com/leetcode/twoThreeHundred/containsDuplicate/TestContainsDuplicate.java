package com.leetcode.twoThreeHundred.containsDuplicate;

import java.util.HashMap;

/**
 * Created by LiuLiHao on 2019/6/7 0007 下午 09:02
 *
 * @author : LiuLiHao
 * 描述：
 *
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 *
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 *
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 *
 */
public class TestContainsDuplicate {

    public static void main(String[] args) {

        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length<=1){
            return false;
        }

        //使用map
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer val = map.get(nums[i]);
            if (val==null){
                map.put(nums[i],1);
            }else {
                return true;
            }
        }
        return false;
    }
}
