import java.util.Arrays;

public class CountingSort {

    public int[] sort(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int[] count = new int[max + 1];
        for(int val : arr){
            count[val] += 1;
        }
        int index = 0;
        for(int j = 0 ; j < count.length ; j++){
            int val = count[j];
            while(val > 0){
                arr[index] = j;
                index++;
                val--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        CountingSort obj = new CountingSort();
        int[] arr = {3, 7, 5, 3, 2, 1, 9, 24, 20};
        int[] result = obj.sort(arr);
        System.out.println(Arrays.toString(result));
    }
}
