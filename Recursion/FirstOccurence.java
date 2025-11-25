// package Recursion;

public class FirstOccurence {
    public int result(int[] arr,int target,int i){
        if (i < arr.length && arr[i] == target){
            return i;
        }
        return result(arr, target, i + 1);
    }
    public static void main(String[] args) {
        FirstOccurence obj = new FirstOccurence();
        int [] arr = {1,2,3,4,45,4,6,6,7};
        System.out.println(obj.result(arr, 6, 0));
    }
}
