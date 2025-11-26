public class SearchRotatedSorted {
    public int findPivot(int []arr,int start,int end){
        int s = start;
        int e = end;
        while (s < e){
            int mid = (s+e) / 2;
            if (arr[s] >= arr[mid]){
                e = mid;
            }else{
                s = mid + 1;
            }
        }
        return s;
    }
    public int binarySearch(int []arr,int  target ,int start,int end){
        int s = start;
        int e  = end;
        while(s <= e){
            int mid = (s + e)/ 2;
            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] < target){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return -1;

    }
    public int findTarget(int[] arr,int target){
        int pivot = findPivot(arr, 0, arr.length);
        if (arr[pivot] <= target && arr[arr.length - 1] >= target){
            return binarySearch(arr, target, pivot, arr.length - 1);
        }else{
            return binarySearch(arr, target, 0, pivot - 1);
        }
    }

    public static void main(String[] args) {
        SearchRotatedSorted obj = new SearchRotatedSorted();
        int arr [] = {7,8,9,0,1,2,3,4,5,6};
        System.out.println(obj.findTarget(arr, 3));
    }
}
