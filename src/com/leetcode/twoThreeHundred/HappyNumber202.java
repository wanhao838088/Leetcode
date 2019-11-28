package com.leetcode.twoThreeHundred;

/**
 * Created by LiuLiHao on 2019/11/28 0028 下午 04:25
 * @author : LiuLiHao
 * 描述：
 * 编写一个算法来判断一个数是不是“快乐数”。
 *
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 *
 * 示例: 
 *
 * 输入: 19
 * 输出: true
 * 解释:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 *
 */
public class HappyNumber202 {

    public static void main(String[] args) {
        System.out.println(isHappy(3));
    }

    public static boolean isHappy(int n) {
        //快慢指针
        int fast= n;
        int slow = n;
        do {
            slow = squreSum(slow);
            fast = squreSum(fast);
            fast = squreSum(fast);

        }while (fast!=slow);

        if (fast==1){
            return true;
        }else {
            return false;
        }
    }

    public static int squreSum(int n){
        int sum = 0;
        while (n!=0){
            sum += (n%10) * (n%10);
            n /= 10;
        }
        return sum;
    }
}
