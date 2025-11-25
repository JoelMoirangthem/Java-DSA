// package Recursion;

public class PrintNumberDecreasing {
    public void prints(int num){
        if (num > 0) prints(num-1);
        System.out.println(num);

    }
    public static void main(String[] args) {
        PrintNumberDecreasing obj = new PrintNumberDecreasing();
        obj.prints(10);
    }
}
