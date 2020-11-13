package learning.algorithm.test;

import org.junit.Test;
//时间复杂度O(n)
public class No122 {
    @Test
    public void testProfit() {
        int[] params = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(params);
        System.out.println(result);
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int temp = prices[i] - prices[i - 1];
            if (temp > 0) {
                profit += temp;
            }
        }
        return profit;
    }
}
