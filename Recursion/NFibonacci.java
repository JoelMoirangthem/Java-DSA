// package Recursion;

public class NFibonacci {
    public int result(int num){
        if (num == 0 || num == 1){
            return num;
        }
        return result( num - 1) + result(num - 2);
    }
    public static void main(String[] args) {
        NFibonacci obj = new NFibonacci();
        System.out.println(obj.result(5));
        System.out.println(obj.result(6));
    }
}
