
public class TrappingRain {
    public int rain(int[]arr){
        if (arr.length <2){
            return 0;
        }
        int [] leftMax = new int[arr.length];
        int [] rightMax = new int[arr.length];
        int left = arr[0];
        leftMax[0] = left;
        int right = arr[arr.length - 1];
        rightMax[arr.length - 1] = right;
        // assigning the leftmax
        for (int i = 1 ; i < arr.length ; i ++){
            int val = arr[i];
            if (val > left){
                leftMax[i] = val;
                left =val;
            }
            else{
                leftMax[i] = left;
            }
        }
        // assigning the right max
        for (int j = arr.length - 2 ; j >=0 ; j --){
            int val = arr[j];
            if (val > right){
                rightMax[j] = val;
                right = val;
            }else{
                rightMax[j] = right;
            }
        }
        int water = 0;
        for (int i = 0 ; i < arr.length ; i++){
            int level = Math.min(leftMax[i],rightMax[i]);
            water += level - arr[i];
        }
        return water;
    }
    public static void main(String[] args) {
        TrappingRain obj = new TrappingRain();
        int[] arr = {4,2,0,6,3,2,5};
        System.out.println(obj.rain(arr));
    }
}
