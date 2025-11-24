public class FastExponential {
    public int result(int num , int p){
        int ans = 1;
        int a = num;
        while ( p > 0){
            if ((p&1) == 0 ){
                ans = ans * 1;
                
            }else{
                ans = a * ans;
            }
            a = a * a;
            p = p >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        FastExponential obj = new FastExponential();
        System.out.println(obj.result(2, 7));
    }
}
