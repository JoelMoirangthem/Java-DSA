// package Sorting;
import java.util.Arrays;

public class BubbleSort {
    public int[] sort(int[]arr){
        for (int i = 0 ; i < arr.length - 1 ; i ++){
            boolean flag = false;
            for (int j = 1 ; j < arr.length -  i ; j ++){
                int prev = arr[j-1];
                int curr = arr[j];
                if(prev > curr){
                    flag = true;
                    arr[j-1] = curr;
                    arr[j] = prev;
                }
            }
            if (!flag){
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        int[] arr = {3,6,1,3,2,8,4};
        int [] result = obj.sort(arr);
        System.out.println(Arrays.toString(result));
    }
}

