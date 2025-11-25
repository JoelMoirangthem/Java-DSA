// package Recursion;

public class OptimalPower {
    public int result(int num , int p){
        if (p == 0){
            return 1;
        }
        int halfPower = result(num,p/ 2);
        int ans = halfPower * halfPower;
        if (p % 2 != 0){
            ans = num * ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        OptimalPower obj = new OptimalPower();
        System.out.println(obj.result(2, 5));
    }
}
