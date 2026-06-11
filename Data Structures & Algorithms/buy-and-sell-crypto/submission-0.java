class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, idx = 1, buy = prices[0];

        while(idx < prices.length) {
            if(prices[idx] > buy) {
                profit = Math.max(profit, prices[idx] - buy);
                idx++;
            } else {
                buy = prices[idx++];
            }
        }

        return profit;
    }
}
