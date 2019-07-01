package com.leetcode.fourFiveHundred.thirdMaximumNumber;

/**
 * Created by LiuLiHao on 2019/7/1 0001 下午 02:51
 * @author : LiuLiHao
 * 描述：
 *给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 *
 * 示例 1:
 *
 * 输入: [3, 2, 1]
 *
 * 输出: 1
 *
 * 解释: 第三大的数是 1.
 * 示例 2:
 *
 * 输入: [1, 2]
 *
 * 输出: 2
 *
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 * 示例 3:
 *
 * 输入: [2, 2, 3, 1]
 *
 * 输出: 1
 *
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 */
public class TestThirdMaximumNumber {
    public static void main(String[] args) {

        //[1,2,-2147483648]
        int[] arr = {11, -2147483648, -2147483648,22};
        int i = thirdMax(arr);
        System.out.println(i);
    }

    public static int thirdMax(int[] nums) {
        //准备3个数 用循环
        //第1大
        int num1 = Integer.MIN_VALUE;
        //第2大
        int num2 = Integer.MIN_VALUE;
        //第3大
        int num3 = Integer.MIN_VALUE;
        int count = 0;
        boolean flag = true;

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            //最小的数不能和最小的数比较 所以用这个
            if (temp==Integer.MIN_VALUE && flag){
                flag=false;
                count++;
            }

            if (temp>num1){
                count++;
                num3 = num2;
                num2 = num1;
                //第一大
                num1 = temp;
            }else if(temp>num2 && temp<num1){
                num3 = num2;
                num2 = temp;
                count++;
            }else if (temp>num3 && temp<num2){
                num3=temp;
                count++;
            }
        }
        return count>=3?num3:num1;
    }
}
