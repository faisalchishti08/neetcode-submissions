class Solution {
    public int maxProfit(int[] prices) {

        if (prices.length < 2) {
            return 0;
        }

        int min = prices[0];
        int profit = 0;

        int i = 0;
        for (int price : prices) {
            if(min > prices[i]) {
                min = prices[i];
            }
            profit = Math.max(profit, prices[i] - min);
            i++;
        }
        return profit;
    }
}
