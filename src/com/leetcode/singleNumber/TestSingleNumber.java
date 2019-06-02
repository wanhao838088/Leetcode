package com.leetcode.singleNumber;

/**
 * Created by LiuLiHao on 2019/6/2 0002 下午 04:22
 * @author : LiuLiHao
 * 描述：
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class TestSingleNumber {
    public static void main(String[] args) {

        int[] arr = {1,2,1,2,8};
        int number = singleNumber(arr);
        System.out.println(number);

        System.out.println(1^1);
    }


    public static int singleNumber(int[] nums) {
        int result = 0;
        //相同的数 亦或为0  总是得到出现一次的数
        for (int i = 0; i < nums.length; i++) {
            result = result^nums[i];
        }
        return result;
    }

    /**
     * 这个方式不行 效率太低
     * @param nums
     * @return
     */
//    public static int singleNumber(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            //出现的次数
//            int k = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i]==nums[j]){
//                    k++;
//                }
//            }
//            if (k==1){
//                return nums[i];
//            }
//        }
//        return 0;
//    }
}
