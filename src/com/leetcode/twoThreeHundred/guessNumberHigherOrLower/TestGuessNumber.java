package com.leetcode.twoThreeHundred.guessNumberHigherOrLower;

/**
 * Created by LiuLiHao on 2019/6/18 0018 上午 08:58
 * @author : LiuLiHao
 * 描述：
 * 我们正在玩一个猜数字游戏。 游戏规则如下：
 * 我从 1 到 n 选择一个数字。 你需要猜我选择了哪个数字。
 * 每次你猜错了，我会告诉你这个数字是大了还是小了。
 * 你调用一个预先定义好的接口 guess(int num)，它会返回 3 个可能的结果（-1，1 或 0）：
 *
 * -1 : 我的数字比较小
 *  1 : 我的数字比较大
 *  0 : 恭喜！你猜对了！
 * 示例 :
 *
 * 输入: n = 10, pick = 6
 * 输出: 6
 *
 */
public class TestGuessNumber extends GuessGame{

    public static void main(String[] args) {
        TestGuessNumber number = new TestGuessNumber();
        int i = number.guessNumber(-5);
        System.out.println(i);
    }


    public int guessNumber(int n) {
        int low=1,high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            int res=guess(mid);
            if(res!=0){
                if(res==-1){
                    high=mid-1;
                }else {
                    low=mid+1;
                }
            }else{
                return mid;
            }
        }
        return 0;
    }
}
