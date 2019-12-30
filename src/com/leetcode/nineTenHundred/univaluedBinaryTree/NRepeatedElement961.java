package com.leetcode.nineTenHundred.univaluedBinaryTree;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LiuLiHao on 2019/12/30 0030 下午 02:52
 * @author : LiuLiHao
 * 描述：
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 *
 * 返回重复了 N 次的那个元素。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[1,2,3,3]
 * 输出：3
 * 示例 2：
 *
 * 输入：[2,1,2,5,3,2]
 * 输出：2
 * 示例 3：
 *
 * 输入：[5,1,5,2,5,3,5,4]
 * 输出：5
 *
 * 提示：
 *
 * 4 <= A.length <= 10000
 * 0 <= A[i] < 10000
 * A.length 为偶数
 */
public class NRepeatedElement961 {

    public static void main(String[] args) {
        int[] nums = {2,1,2,5,3,2};

        System.out.println(repeatedNTimes(nums));
    }
    public static int repeatedNTimes(int[] A) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int k = A[i];
            Integer orDefault = map.getOrDefault(k, 0);
            map.put(k,++orDefault);
            if (orDefault==A.length/2){
                return k;
            }
        }
        return 0;
    }
}
