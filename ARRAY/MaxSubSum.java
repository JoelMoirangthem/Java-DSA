public class MaxSubSum {
    public int maxSubSum(int[] arr) {
        int maxVal = Integer.MIN_VALUE;
        int currSum = 0;
        for (int val : arr) {
            currSum += val;
            maxVal = Math.max(maxVal, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 1, 8, -5, 7, 0, -1};
        MaxSubSum obj = new MaxSubSum();
        System.out.println(obj.maxSubSum(arr));  // Output: 11
    }
}
