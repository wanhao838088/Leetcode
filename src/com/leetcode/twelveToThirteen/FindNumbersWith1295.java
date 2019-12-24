package com.leetcode.twelveToThirteen;

/**
 * Created by LiuLiHao on 2019/12/24 0024 下午 02:53
 * @author : LiuLiHao
 * 描述：
 *给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [12,345,2,6,7896]
 * 输出：2
 * 解释：
 * 12 是 2 位数字（位数为偶数） 
 * 345 是 3 位数字（位数为奇数）  
 * 2 是 1 位数字（位数为奇数） 
 * 6 是 1 位数字 位数为奇数） 
 * 7896 是 4 位数字（位数为偶数）  
 * 因此只有 12 和 7896 是位数为偶数的数字
 * 示例 2：
 *
 * 输入：nums = [555,901,482,1771]
 * 输出：1
 * 解释：
 * 只有 1771 是位数为偶数的数字。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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
