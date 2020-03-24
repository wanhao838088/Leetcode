package com.leetcode.twelveToThirteen;

import java.util.Arrays;

/**
 * Created by LiuLiHao on 2020/3/24 0024 上午 10:24
 * @author : LiuLiHao
 * 描述：
 * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 *
 * 完成所有替换操作后，请你返回这个数组。
 *
 *  
 *
 * 示例：
 *
 * 输入：arr = [17,18,5,4,6,1]
 * 输出：[18,6,6,6,1,-1]
 *  
 *
 * 提示：
 *
 * 1 <= arr.length <= 10^4
 * 1 <= arr[i] <= 10^5
 *
 */
public class ReplaceElements1299 {
    public static void main(String[] args) {

        int[] arr = {17,18,5,4,6,1};
        int[] elements = replaceElements(arr);
        System.out.println(Arrays.toString(elements));
    }

    public static int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length-1; i >=0 ; i--) {
            int current = arr[i];
            arr[i] = max;
            max = Math.max(current,max);
        }
        return arr;
    }

}
