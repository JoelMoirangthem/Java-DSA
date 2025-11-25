// package Recursion;

public class TilesFilling {
    public int result(int n){
        if (n == 1 || n== 0){
            return 1;
        }
        
        
        return result( n - 1) + result(n - 2);
    }
    public static void main(String[] args) {
        TilesFilling obj = new TilesFilling();
        System.out.println(obj.result(3));
    }
}
