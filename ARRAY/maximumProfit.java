public class maximumProfit {
    public int profit(int[] arr){
        if (arr == null || arr.length < 2) return 0; // no profit possible

        int max_profit = 0;
        int buy = arr[0];
        for(int i = 1 ; i < arr.length; i++){
            int curr_price = arr[i];
            if (curr_price - buy > 0){
                max_profit = Math.max(max_profit, curr_price - buy);
            }
            if (curr_price < buy){
                buy = curr_price;
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        maximumProfit obj = new maximumProfit();
        int[] arr = {7,1,5,3,6,4};
        System.out.println(obj.profit(arr));  // Output: 5
    }
}
