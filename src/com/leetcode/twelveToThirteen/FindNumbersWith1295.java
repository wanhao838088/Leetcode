package com.leetcode.twelveToThirteen;

/**
 * Created by LiuLiHao on 2019/12/24 0024 下午 02:53
 * @author : LiuLiHao
 * 描述：
 *
 */
public class FindNumbersWith1295 {
    public static void main(String[] args) {

    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if((nums[i]>=10&&nums[i]<100)||(nums[i]>=1000&&nums[i]<10000)){
                count++;
            }
        }
        return count;
    }
}
