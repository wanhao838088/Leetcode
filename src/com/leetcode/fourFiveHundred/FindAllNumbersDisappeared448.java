package com.leetcode.fourFiveHundred;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by LiuLiHao on 2019/12/4 0004 下午 02:39
 * @author : LiuLiHao
 * 描述：
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 *
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 *
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 *
 * 示例:
 *
 * 输入:
 * [4,3,2,7,8,2,3,1]
 *
 * 输出:
 * [5,6]
 *
 */
public class FindAllNumbersDisappeared448 {

    public static void main(String[] args) {

        int nums[] = {4,3,2,7,8,2,3,1};
        List<Integer> list = findDisappearedNumbers(nums);
        System.out.println(list);
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        //标记为负数
        for (int i = 0; i < nums.length; i++) {
            nums[ Math.abs(nums[i]) -1] = - Math.abs(nums[ Math.abs(nums[i]) -1]);
        }
        List<Integer> res = new LinkedList<>();
        //找出不是负数的
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                res.add(i+1);
            }
        }
        return res;
    }
}
