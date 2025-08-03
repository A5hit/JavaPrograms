package Java14DaysGrind;

public class MaxProfit {

    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        maxFrft(nums);

    }

    public static void maxFrft(int[] nums) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int buyDay = 0;
        int sellDay = 0;
        int tempBuyDay = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minPrice) {
                minPrice = nums[i];
                tempBuyDay = i;
            } else {
                if (nums[i] - minPrice > maxProfit) {
                    maxProfit = nums[i] - minPrice;
                    buyDay = tempBuyDay;
                    sellDay = i;
                }
            }
        }

        System.out.println("Buy on day " + buyDay + " at price " + nums[buyDay]);
        System.out.println("Sell on day " + sellDay + " at price " + nums[sellDay]);
    }
}
