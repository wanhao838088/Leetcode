package com.leetcode.oneTwoHundred.reverse;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 */
public class TestReverse {

    public static void main(String[] args) {
        int reverse = reverse(0);
        System.out.println(reverse);
    }

    public static int reverse(int x) {
        if (x==0){
            //如果是0 直接返回0
            return 0;
        }
        while (x%10==0){
            //如果末尾是0 那么除以10
            x/=10;
        }
        int result = 0;
        try {
            if (x%10!=0 && x>0){
                //结尾不是0
                String str = x+"";
                StringBuilder builder = new StringBuilder().append(str).reverse();
                result = Integer.parseInt(builder.toString());
            }else if(x%10!=0 && x<0){
                //小于0的数
                String str = Math.abs(x)+"";
                StringBuilder builder = new StringBuilder().append(str).append("-").reverse();
                result = Integer.parseInt(builder.toString());
            }
        }catch (Exception e){
            return 0;
        }
        return result;
    }

}
