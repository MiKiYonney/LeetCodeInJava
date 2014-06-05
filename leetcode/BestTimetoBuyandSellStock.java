package leetcode;
/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 * http://blog.csdn.net/u013027996/article/details/19414967
 * 如果是自己去买股票的话，那么今天买，发现明天比今天股价高了，就卖出，同时再买入，后退发现又比买的时候股价高了，再卖出，同时买入。不断的买入卖出，累加就是最大利润。
 * @author yonney
 *
 */
public class BestTimetoBuyandSellStock {
	 public int maxProfit(int[] prices) {
		 if(prices == null || prices.length == 0){
			 return 0;
		 }
		 int res = 0;
		 for(int i = 1; i <=  prices.length-1 ;i++){
			 if(prices[i-1] < prices[i]){
				 res += prices[i]-prices[i-1];
			 }
		 }
		 return res;
	 }
}
