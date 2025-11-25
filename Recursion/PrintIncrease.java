// package Recursion;

public class PrintIncrease {
    public void printInc(int num){
        if (num == 0){
            return;
        }
        printInc(num-1);
        System.out.println(num); 
    }
    public static void main(String[] args) {
        PrintIncrease obj = new PrintIncrease();
        obj.printInc(10);
        // System.out.println(obj.printInc(10));
        
    }
}
