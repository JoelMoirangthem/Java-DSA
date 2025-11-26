// package Divide&Conquer;

import java.util.Arrays;

public class QuickSort {
    public void sorting(int arr[], int start ,int end){
        if (start < end){
            int pivot = placePosition(arr , start , end);
            sorting(arr, start, pivot - 1);
            sorting(arr, pivot  + 1, end);
        }
    }
    public int placePosition(int arr[], int start , int end){
        int i = start - 1;
        int j = start;
        int pvot = arr[end];
        while(j < end){
            if (arr[j] < pvot){
                i++;
                int curr = arr[i];
                arr[i] = arr[j];
                arr[j] = curr;
            }
            j++;
        }
        i++;
        int curr = arr[i];
        arr[i] = arr[j];
        arr[j] = curr;
        return i;
    }
    public static void main(String[] args) {
        QuickSort obj = new QuickSort();
        int [] arr = {6,3,9,8,2,5};
        obj.sorting(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
