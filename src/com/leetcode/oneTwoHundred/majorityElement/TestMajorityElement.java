package com.leetcode.oneTwoHundred.majorityElement;

/**
 * Created by LiuLiHao on 2019/6/4 0004 上午 11:53
 * @author : LiuLiHao
 * 描述：
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 */
public class TestMajorityElement {

    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,2,2};
        int i = majorityElement(arr);
        System.out.println(i);
    }


    /**
     * 使用参照元素 不开空间
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }

        //参照元素
        int element = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == element){
                count++;
            }else {
                if (count==0){
                    element = nums[i];
                }else {
                    count--;
                }
            }
        }
        return element;
    }

    /**
     * 需要开辟新内存空间
     * @param nums
     * @return
     */
//    public static int majorityElement(int[] nums) {
//        if (nums.length==1){
//            return nums[0];
//        }
//        HashMap<Integer,Integer> map = new HashMap<>(16);
//
//        for (int i = 0; i < nums.length; i++) {
//            Integer element = map.get(nums[i]);
//            if (element!=null && element>=nums.length/2){
//                return nums[i];
//            }else if(element==null) {
//                map.put(nums[i],1);
//            }else {
//                map.put(nums[i],++element);
//            }
//        }
//        return 0;
//    }
}
