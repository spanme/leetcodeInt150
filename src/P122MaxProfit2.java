public class P122MaxProfit2 {
    public int maxProfit(int[] prices) {
        // prices [i] is the price on the ith day
        // can buy/sell on the same day, and multiple times, but have to sell before new buy.
        // is there any point considering buying and selling on the same day? maybe?
        // i think, you should just buy whenever and sell whenever the price goes down?

        if (prices.length <= 1) {
            return 0;
        }

        int curPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
           if (price > curPrice) {
                maxProfit += price - curPrice;

            }
            curPrice = price;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        P122MaxProfit2 p = new P122MaxProfit2();
        System.out.println(p.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
