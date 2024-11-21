import java.util.HashMap;

class Scratch {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {  //length -1 because we dont care if the minimum price is at the last position.
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}