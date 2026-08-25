package task_gem;

public class Pricing {

    public int calculatePriceSpread(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        int max = prices[0];

        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            if (price > max) {
                max = price;
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        Pricing pricing = new Pricing();

        // Test case 1: Normal case
        int[] prices1 = {100, 200, 300, 400, 500};
        System.out.println(pricing.calculatePriceSpread(prices1)); // Expected output: 400

        // Test case 2: Single element
        int[] prices2 = {100};
        System.out.println(pricing.calculatePriceSpread(prices2)); // Expected output: 0

        // Test case 3: Empty array
        int[] prices3 = {};
        System.out.println(pricing.calculatePriceSpread(prices3)); // Expected output: 0

        // Test case 4: Null array
        int[] prices4 = null;
        System.out.println(pricing.calculatePriceSpread(prices4)); // Expected output: 0

        // Test case 5: All elements are the same
        int[] prices5 = {100, 100, 100};
        System.out.println(pricing.calculatePriceSpread(prices5)); // Expected output: 0
    }
}
