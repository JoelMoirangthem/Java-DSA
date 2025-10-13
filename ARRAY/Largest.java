public class Largest{
    public int greatestNumbber(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int val : arr ){
            if (val > largest){
                largest =val;
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int[] arr = {2,3,4,5,18};
        Largest obj = new Largest();
        int no = obj.greatestNumbber(arr);
        System.out.println(no);
    }
}