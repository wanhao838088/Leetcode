package com.leetcode.pascalsTriangleII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LiuLiHao on 2019/6/1 0001 下午 08:02
 * @author : LiuLiHao
 * 描述：
 *在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 3
 * 输出: [1,3,3,1]
 */
public class TestPascalsTriangleTwo {

    public static void main(String[] args) {

        List<Integer> generate = generate(0);
        System.out.println(Arrays.toString(generate.toArray()));

    }

    public static List<Integer> generate(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> dist = new ArrayList<>();

        //为 0 返回1
        if (rowIndex==0){
            dist.add(1);
            return dist;
        }

        for (int i = 0; i <= rowIndex; i++) {
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
        return result.get(rowIndex);
    }
}
