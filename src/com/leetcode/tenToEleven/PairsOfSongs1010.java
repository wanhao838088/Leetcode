package com.leetcode.tenToEleven;

/**
 * Created by LiuLiHao on 2020/4/26 0026 下午 01:33
 * @author : LiuLiHao
 * 描述：
 * 在歌曲列表中，第 i 首歌曲的持续时间为 time[i] 秒。
 *
 * 返回其总持续时间（以秒为单位）可被 60 整除的歌曲对的数量。形式上，我们希望索引的数字 i 和 j 满足  i < j 且有 (time[i] + time[j]) % 60 == 0。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[30,20,150,100,40]
 * 输出：3
 * 解释：这三对的总持续时间可被 60 整数：
 * (time[0] = 30, time[2] = 150): 总持续时间 180
 * (time[1] = 20, time[3] = 100): 总持续时间 120
 * (time[1] = 20, time[4] = 40): 总持续时间 60
 * 示例 2：
 *
 * 输入：[60,60,60]
 * 输出：3
 * 解释：所有三对的总持续时间都是 120，可以被 60 整数。
 *  
 *
 * 提示：
 *
 * 1 <= time.length <= 60000
 * 1 <= time[i] <= 500
 *
 */
public class PairsOfSongs1010 {

    public static void main(String[] args) {

        int[] time = {60,60,60};

        System.out.println(numPairsDivisibleBy60(time));
    }

    public static int numPairsDivisibleBy60(int[] time) {
        int sum = 0;

        int[] record = new int[60];

        for (int i : time) {
            int temp = i % 60;
            if (temp != 0) {
                //不为0 加上60可以与他为0的数
                sum += record[60 - temp];
            } else {
                //余数为0
                sum += record[0];
            }
            record[temp]++;
        }

        return sum;
    }
}
