package com.leetcode.twelveToThirteen;

/**
 * Created by LiuLiHao on 2019/12/11 0011 下午 03:46
 * @author : LiuLiHao
 * 描述：
 * 给你一个 n 行 m 列的矩阵，最开始的时候，每个单元格中的值都是 0。
 *
 * 另有一个索引数组 indices，indices[i] = [ri, ci] 中的 ri 和 ci 分别表示指定的行和列（从 0 开始编号）。
 *
 * 你需要将每对 [ri, ci] 指定的行和列上的所有单元格的值加 1。
 *
 * 请你在执行完所有 indices 指定的增量操作后，返回矩阵中 「奇数值单元格」 的数目。
 *
 *  
 *
 * 示例 1：
 *
 *
 *
 * 输入：n = 2, m = 3, indices = [[0,1],[1,1]]
 * 输出：6
 * 解释：最开始的矩阵是 [[0,0,0],[0,0,0]]。
 * 第一次增量操作后得到 [[1,2,1],[0,1,0]]。
 * 最后的矩阵是 [[1,3,1],[1,3,1]]，里面有 6 个奇数。
 * 示例 2：
 *
 *
 *
 * 输入：n = 2, m = 2, indices = [[1,1],[0,0]]
 * 输出：0
 * 解释：最后的矩阵是 [[2,2],[2,2]]，里面没有奇数。
 *
 */
public class CellsWithOddValuesInAMatrix1252 {

    public static void main(String[] args) {
        int[][] nums = {
                {1,1},
                {0,0}
        };
        System.out.println(oddCells(2, 2, nums));
    }

    public static int oddCells(int n, int m, int[][] indices) {
        //开数组
        int[][] arrays = new int[n][m];
        //遍历 indices
        for (int i = 0; i < indices.length; i++) {
            //取行
            int row = indices[i][0];
            for (int j = 0; j < m; j++) {
                arrays[row][j]++;
            }
            int col = indices[i][1];
            for (int k = 0; k < n; k++) {
                arrays[k][col]++;
            }
        }
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (arrays[i][j]%2!=0){
                    sum++;
                }
            }
        }

        return sum;
    }
}
