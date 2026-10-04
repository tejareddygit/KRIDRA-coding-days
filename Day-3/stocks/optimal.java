class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int curr_min = Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            profit = Math.max(profit,prices[i]-curr_min);
            if(curr_min>prices[i]) curr_min = prices[i];
        }
        return profit;
    }
}

