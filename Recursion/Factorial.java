// package Recursion;

public class Factorial {
    public int result(int num){
        if (num == 1){
            return 1;
        }
        return num * result(num-1);
    }
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.println(obj.result(5));
    }
}
