// package Recursion;

public class CheackSorted {
    public boolean result(int []arr , int i){
        if ( i == arr.length - 1){
            return true;
        }
        if ( i < arr.length - 1 && arr[i] > arr[i+1]){
            return false;
        }
        return result(arr, i+1);
    }
    public static void main(String[] args) {
        CheackSorted obj = new CheackSorted();
        int arr [ ] = {1,2,3,4,5,6};
        System.out.println(obj.result(arr, 0));
    }
}

