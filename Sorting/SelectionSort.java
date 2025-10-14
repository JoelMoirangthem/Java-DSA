// package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public int[] sort(int[]arr){
        for (int i = 0  ; i < arr.length -1 ; i++){
            int currMin = arr[i];
            int index = i;
            for(int j = i +1 ; j < arr.length ; j ++){
                if(arr[j] < currMin){
                    currMin = arr[j];
                    index = j;
                }
            }
            
            arr[index] = arr[i];
            arr[i] = currMin;
        }
        return arr;
    }
    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int[]arr = {3,6,1,8,9,2,5};
        int [ ] result = obj.sort(arr);
        System.out.println(Arrays.toString(result));
    }
}
