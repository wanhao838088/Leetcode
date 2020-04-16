package com.leetcode.zeroToTwoHundred;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LiuLiHao on 2020/4/16 0016 下午 05:52
 * @author : LiuLiHao
 * 描述：
 * 给出一个区间的集合，请合并所有重叠的区间。
 *
 * 示例 1:
 *
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 示例 2:
 *
 * 输入: [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 *
 */
public class MergeIntervals56 {
    public static void main(String[] args) {

    }

    public int[][] merge(int[][] arr) {
        List<int[]> ans = new ArrayList<>();
        //排序
        Arrays.sort(arr, (v1, v2) -> v1[0] - v2[0]);

        int i = 0, len = arr.length;
        while (i < len) {
            int left = arr[i][0];
            int right = arr[i][1];

            while (i < len - 1 && right >= arr[i + 1][0]) {
                right = Math.max(right, arr[i + 1][1]);
                i++;
            }
            ans.add(new int[]{left, right});
            i++;
        }
        return ans.toArray(new int[ans.size()][2]);

    }
}
