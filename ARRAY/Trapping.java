import java.lang.reflect.Array;
import java.util.Arrays;

public class Trapping {
    private int [] rMax;
    private int [] lMax;
    private int []arr;
    private int trappingWater; 
    public Trapping(int [] arr){
        this.rMax = new int[arr.length];
        this.lMax = new int[arr.length];
        this.arr = arr;
    }
    public void findLeftMax(int [] arr){

        int leftMax = arr[0];
        this.lMax[0] = leftMax;
        for(int i = 1 ; i < arr.length ; i ++){
            int val = arr[i];
            if(leftMax >=  val){
                this.lMax[i] = leftMax;
            }else{
                this.lMax[i] = val;
                leftMax = val;
            }
        }
    }
    public void findRightMax(int [] arr){
        int n = arr.length - 1;
        int rightMax = arr[n];
        this.rMax[n] = rightMax;
        for(int i = n - 1 ; i >= 0 ; i--){
            int val = arr[i];
            if(rightMax >=  val){
                this.rMax[i] = rightMax;
            }else{
                this.rMax[i] = val;
                rightMax = val;
            }
        }
    }
    public int findLeftRightMax(){
        this.findLeftMax(this.arr);
        this.findRightMax(this.arr);
        return this.amountWater();
    }
    public int amountWater(){
        for (int i = 0 ; i< arr.length ; i ++){
            int height = Math.min(this.rMax[i],this.lMax[i]);
            trappingWater += (height - arr[i]);
        }
        return this.trappingWater;
    }
    public static void main(String[] args) {
        int [] arr = {4,2,0,6,3,2,5,2,3,6};
        Trapping obj = new Trapping(arr);
        obj.findLeftRightMax();
        System.out.println(obj.findLeftRightMax());
        System.out.println(Arrays.toString(obj.lMax));
        System.out.println(Arrays.toString(obj.rMax));


    }
}
