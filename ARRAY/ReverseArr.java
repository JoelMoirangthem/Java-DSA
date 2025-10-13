import java.util.Arrays;

public class ReverseArr {
    public int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int curr = arr[start];
            arr[start] = arr[end];
            arr[end] = curr;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        ReverseArr obj = new ReverseArr();
        int[] arr = {1,2,3,4,5,6};
        int [] result = obj.reverse(arr);
        System.out.println(Arrays.toString(result));
    }
}
