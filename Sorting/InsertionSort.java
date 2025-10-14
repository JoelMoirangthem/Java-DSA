// package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public int[] sort(int[]arr){
        for(int i = 1;i < arr.length ; i ++){
            int j = i - 1;
            int pivot = arr[i];
            while (j >= 0 && arr[j] > pivot){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = pivot;
            
        }
        return arr;
    }
    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        int[] arr = {6,2,1,7,8,4};
        int[] result = obj.sort(arr);
        System.out.println(Arrays.toString(result));
    }
}
