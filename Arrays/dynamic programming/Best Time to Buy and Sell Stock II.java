class Solution {
    public int maxProfit(int[] prices) {

        int notHolding = 0;
        int holding = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            int newNotHolding = Math.max(notHolding, holding + prices[i]);
            int newHolding = Math.max(holding, notHolding - prices[i]);
            notHolding = newNotHolding;
            holding = newHolding;
        }

        return notHolding;
    }
}