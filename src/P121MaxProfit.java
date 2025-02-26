public class P121MaxProfit {
    public int maxProfit(int[] prices) {
        //prices [i] is the price on the ith day
        //want to buy at lowest and sell at highest
        //return profit
        //however, buying has to be before selling.

        if (prices.length <= 1) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; //if you find a smaller price, you shouldnt sell on this day
            } else if (price - minPrice > maxProfit) { //so we can go to an elif
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
