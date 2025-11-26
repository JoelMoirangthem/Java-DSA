// package Divide&Conquer;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public  void  sortArr(int[] arr , int start , int end){
        if(start < end){
            int mid = (start + end) / 2;
            sortArr(arr,start,mid);
            sortArr(arr, mid+1, end);
            conquer(arr, start , mid, end);
            
        }
    }
    public void conquer(int[] arr , int start , int mid , int end){
        ArrayList<Integer> lst = new ArrayList<>();
        
        int i = start;
        int j = mid + 1;
        while(i <= mid && j <=end){
            if(arr[i] > arr[j]){
                lst.add(arr[j]);
                j++;
            }else{
                lst.add(arr[i]);
                i++;
            }
        }
        while (i <= mid){
            lst.add(arr[i]);
            i++;
        }
        while (j <= end){
            lst.add(arr[j]);
            j++;
        }
        for(int k = start ; k <= end ; k++){
            arr[k] = lst.get(k-start);
        }
    }
    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        int arr[] = {3,2,1,6,9,5,4};
        obj.sortArr(arr, 0,arr.length - 1 );
        System.out.println(Arrays.toString(arr));
    }
}