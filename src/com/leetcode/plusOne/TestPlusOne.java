package com.leetcode.plusOne;

import java.util.Arrays;

/**
 * Created by LiuLiHao on 2019/5/25 0025 下午 07:32
 * @author : LiuLiHao
 * 描述：
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 *
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
public class TestPlusOne {

    public static void main(String[] args) {

        int[] arr = {3,9,9};

        int[] ints = plusOne(arr);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] plusOne(int[] digits) {
        String  num;
        if (digits.length==1){
            num = digits[0]+"";
        }else {
            String org = "";
            for (int i = 0; i < digits.length; i++) {
                org+=digits[i];
            }
            num = org;
        }
        //最后一个数
        int j = num.length();

        //末尾的一串0
        String end = "";
        int temp = Integer.parseInt(num.substring(j-1,j)) +1;
        while (temp==10 && j>0){
            end+="0";
            j--;
            if (j>0){
                temp = Integer.parseInt(num.substring(j-1,j)) +1;
            }
        }

        boolean flagStart = false;
        String start = "";
        if (!end.equals("")){
            flagStart = true;
            //末尾是0
            start = num.substring(0,j);
            if (j>0){
                int fix = Integer.parseInt(num.substring(start.length()-1,start.length())) + 1;
                start = start.substring(0,start.length()-1) + fix;
            }else {
                start = "1";
            }
        }
        String result = null;

        if (flagStart){
            result = start + end;
        }else {
            result = num.substring(0,num.length()-1) + temp;
        }

        int[] arr = new int[result.length()];
        for (int i = 0; i < result.length(); i++) {
            arr[i] = Integer.parseInt(result.substring(i,i+1));
        }
        return arr;
    }
}
