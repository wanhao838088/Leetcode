package com.leetcode.oneTwoHundred.pascalsTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LiuLiHao on 2019/6/1 0001 下午 07:41
 * @author : LiuLiHao
 * 描述：
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
public class TestPascalsTriangle {
    public static void main(String[] args) {

        List<List<Integer>> generate = generate(0);
        for (List<Integer> integers : generate) {
            System.out.println(Arrays.toString(integers.toArray()));
        }

    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        //为 0 返回空数组
        if (numRows==0){
            return result;
        }

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> inner = new ArrayList<>();
            for (int j = 0; j <= i ; j++) {
                // 左上方和右上方的数的和
                if (i>=2 && j>0 && j<i){
                    int num1 = result.get(i-1).get(j-1);
                    int num2 = result.get(i-1).get(j);
                    int temp = num1 + num2;
                    inner.add(temp);
                }else {
                    inner.add(1);
                }
            }
            result.add(inner);
        }
        return result;
    }
}
