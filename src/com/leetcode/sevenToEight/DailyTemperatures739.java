package com.leetcode.sevenToEight;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by LiuLiHao on 2020/6/11 0011 上午 10:52
 * @author : LiuLiHao
 * 描述：
 * 根据每日 气温 列表，请重新生成一个列表，对应位置的输出是需要再等待多久温度才会升高超过该日的天数。如果之后都不会升高，请在该位置用 0 来代替。
 *
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，
 * 你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 *
 * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
 *
 */
public class DailyTemperatures739 {

    public static void main(String[] args) {

        int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(nums)));
    }

    /**
     * 单调递减栈
     * @param T
     * @return
     */
    public static int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                Integer cur = stack.pop();
                ans[cur] = i - cur;
            }
            stack.push(i);
        }
        return ans;
    }
}
