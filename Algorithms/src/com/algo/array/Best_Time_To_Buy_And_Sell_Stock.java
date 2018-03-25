package com.algo.array;

public class Best_Time_To_Buy_And_Sell_Stock {
	public static void main(String[] args) {
		Best_Time_To_Buy_And_Sell_Stock bestTimeToBuyAndSellStock = new Best_Time_To_Buy_And_Sell_Stock();
		// System.out.println(bestTimeToBuyAndSellStock.maxProfit(new int[] {
		// 10, 7, 5, 8, 11, 9 }));
		// System.out.println(bestTimeToBuyAndSellStock.maxProfit(new int[] { 9,
		System.out.println(bestTimeToBuyAndSellStock.maxProfit(new int[] { 2, 1, 2, 0, 1 }));
		// 7, 4, 1 }));
	}

	public int maxProfit(int[] stockPricesYesterday) {				
		int totalProfit = 0;
		for (int i = 1; i < stockPricesYesterday.length; i++) {
			int todayPrice = stockPricesYesterday[i];
			int yesterdayPrice = stockPricesYesterday[i - 1];
			int todayProfit =  todayPrice - yesterdayPrice;
			if(todayProfit>0) {
				totalProfit = totalProfit + todayProfit;	
			}
		}
		return totalProfit;
	}
	// one time buy and sell
	// public int maxProfit(int[] stockPricesYesterday) {
	// int maxProfit = 0;
	// int minPrice = stockPricesYesterday[0];
	// for (int i = 1; i < stockPricesYesterday.length; i++) {
	// minPrice = Math.min(minPrice, stockPricesYesterday[i - 1]);
	// int currentPrice = stockPricesYesterday[i];
	// int potentialProfit = currentPrice - minPrice;
	// maxProfit = Math.max(maxProfit, potentialProfit);
	// }
	// return maxProfit;
	// }
}
