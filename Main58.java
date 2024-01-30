class Solution {
    public int buyChoco(int[] prices, int money) {

        int first_min = prices[0];
        int first_min_index = 0;
        int second_min = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < first_min) {
                second_min = first_min;
                first_min = prices[i];
            } else if (prices[i] < second_min && i != first_min_index) {
                second_min = prices[i];
            }
        }

        if (first_min + second_min <= money) {
            return money - (first_min + second_min);
        } else {
            return money;
        }

    }
}