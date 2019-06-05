package com.leetcode.oneTwoHundred.bestTimeToBuy;

/**
 * Created by LiuLiHao on 2019/6/1 0001 下午 08:21
 * @author : LiuLiHao
 * 描述：
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 *
 * 注意你不能在买入股票前卖出股票。
 *
 * 示例 1:
 *
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * 示例 2:
 *
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 */
public class TestBestTimeBuy {

    public static void main(String[] args) {

        int[] arr = {7,1,5,3,6,4};
        int i = maxProfit(arr);
        System.out.println(i);
    }

    // On2
//    public static int maxProfit(int[] prices) {
//        int result = 0;
//        if (prices==null || prices.length==0){
//            return result;
//        }
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i+1; j < prices.length; j++) {
//                //计算盈利情况
//                int buy = prices[i];
//                int sale = prices[j];
//                if (sale-buy>result){
//                    result = sale-buy;
//                }
//            }
//        }
//        return result;
//    }


    /**
     * 时间复杂度 On
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int result = 0;
        if (prices==null || prices.length==0){
            return result;
        }
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            //从开始到现在的最小值
            minPrice = Math.min(prices[i],minPrice);
            //最大盈利
            result = Math.max(prices[i]-minPrice,result);
        }
        return result;
    }
}
