package com.leetcode.fourFiveHundred;

/**
 * Created by LiuLiHao on 2019/12/16 0016 下午 03:51
 * @author : LiuLiHao
 * 描述：
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 *
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 *
 * 注意：
 * 0 ≤ x, y < 231.
 *
 * 示例:
 *
 * 输入: x = 1, y = 4
 *
 * 输出: 2
 *
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 *
 * 上面的箭头指出了对应二进制位不同的位置。
 *
 */
public class HammingDistance461 {
    public static void main(String[] args) {
        System.out.println(hammingDistance(93, 73));
    }
    public static int hammingDistance(int x, int y) {
        int sum = 0;
        int temp = x ^ y;
        while (temp!=0){
            sum += temp & 1;

            temp >>=1 ;
        }
        return sum;
    }
}
