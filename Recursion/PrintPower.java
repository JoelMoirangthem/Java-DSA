// package Recursion;

public class PrintPower {
    public int result(int num , int p){
        if (p == 1){
            return num;
        }
        return num * result(num, p-1);
    }
    public static void main(String[] args) {
        PrintPower obj = new PrintPower();
        System.out.println(obj.result(5, 2));

    }
}
