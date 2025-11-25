// package Recursion;

public class LastOccurence {
    public int result(int[] arr,int target,int i){
        if (i >= 0 && arr[i] == target){
            return i;
        }else if (i == 0 && arr[i] != target){
            return - 1;
        }
        return result(arr, target, i - 1);
    }
    public static void main(String[] args) {
        LastOccurence obj = new LastOccurence();
        int [] arr = {1,2,3,4,45,4,6,6,7};
        System.out.println(obj.result(arr, 16, arr.length - 1));
    }
}
