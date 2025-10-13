public class Pairs {
    public void pairElement(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            for (int j = i + 1; j < arr.length ; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pairs obj = new Pairs();
        int[] arr = {2,3,4,5,7,8,21,45,27,43,15,27};
        System.out.println("The possible pairs for the given array is ");
        obj.pairElement(arr);
    }
}
