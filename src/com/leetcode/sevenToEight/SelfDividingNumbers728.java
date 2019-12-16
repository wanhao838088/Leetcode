package com.leetcode.sevenToEight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LiuLiHao on 2019/12/16 0016 下午 04:22
 * @author : LiuLiHao
 * 描述：
 *自除数 是指可以被它包含的每一位数除尽的数。
 *
 * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 *
 * 还有，自除数不允许包含 0 。
 *
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
 *
 * 示例 1：
 *
 * 输入：
 * 上边界left = 1, 下边界right = 22
 * 输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * 注意：
 *
 * 每个输入参数的边界满足 1 <= left <= right <= 10000。
 *
 */
public class SelfDividingNumbers728 {
    public static void main(String[] args) {

        List<Integer> list = selfDividingNumbers(1, 22);
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));

    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isDiv(i)) {
                list.add(i);
            }
        }

        return list;
    }

    private static boolean isDiv(int i) {
        int org = i;
        while (i != 0) {
            int mul = i % 10;
            if (mul == 0 || org % mul != 0) {
                return false;
            }
            i /= 10;
        }
        return true;
    }

}
