package com.leetcode.interview;

/**
 * Created by LiuLiHao on 2020/3/30 0030 上午 09:42
 * @author : LiuLiHao
 * 描述：
 * 整数转换。编写一个函数，确定需要改变几个位才能将整数A转成整数B。
 *
 * 示例1:
 *
 *  输入：A = 29 （或者0b11101）, B = 15（或者0b01111）
 *  输出：2
 * 示例2:
 *
 *  输入：A = 1，B = 2
 *  输出：2
 * 提示:
 *
 * A，B范围在[-2147483648, 2147483647]之间
 *
 */
public class ConvertIntegerLcci0506 {
    public static void main(String[] args) {
        System.out.println(convertInteger(1, 2));

    }

    public static int convertInteger(int A, int B) {
        int temp = A^B;
        int count = 0;
        //统计1的次数
        for (int i = 0; i < 32; i++) {
            if ((temp & 1) == 1 ){
                count++;
            }
            temp >>= 1;
        }
        return count;
    }

//    public static int convertInteger(int A, int B) {
//        int temp = A^B;
//        String str = Integer.toBinaryString(temp);
//        int count = 0;
//        //统计1的次数
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch=='1'){
//                count++;
//            }
//        }
//        return count;
//    }
}
