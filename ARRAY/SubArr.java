import java.util.Arrays;
public class SubArr {
    public void printSub(int[]arr){
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]);
            for (int j = i + 1;j < arr.length ; j ++){
                int [] slice = Arrays.copyOfRange(arr, i, j);
                System.out.print(Arrays.toString(slice));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        SubArr obj = new SubArr();
        int []arr = {1,3,4,5,6,7,2,8,9,10,23};
        obj.printSub(arr);
    }
}
