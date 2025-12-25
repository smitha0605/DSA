public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int minPrice = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - minPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 5, 8, 11, 9};
        System.out.println(maxProfit(arr));
    }
}
