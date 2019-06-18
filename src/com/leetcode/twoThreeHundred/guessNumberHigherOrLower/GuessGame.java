package com.leetcode.twoThreeHundred.guessNumberHigherOrLower;

/**
 * Created by LiuLiHao on 2019/6/18 0018 上午 09:03
 *
 * @author : LiuLiHao
 * 描述：
 */
public class GuessGame{
    int n = (int) (Math.random()*100);

    public int guess(int num){
        if (num<n){
            return -1;
        }else if(num>n){
            return 1;
        }else {
            return 0;
        }
    }
}
