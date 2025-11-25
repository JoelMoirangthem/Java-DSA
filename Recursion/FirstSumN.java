// package Recursion;

public class FirstSumN {
    public int result(int num){
        if (num == 1){
            return 1;
        }
        return num + result(num - 1);
    }
    public static void main(String[] args) {
        FirstSumN obj = new FirstSumN();
        System.out.println(obj.result(5));
    }
}
