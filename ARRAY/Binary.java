public class Binary {
    public boolean binarySearch(int[]arr,int target){
        int start = 0;
        int end = arr.length;
        while(start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] == target){
                return true;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Binary obj = new Binary();
        int[]arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(obj.binarySearch(arr, 10));
    }
}
