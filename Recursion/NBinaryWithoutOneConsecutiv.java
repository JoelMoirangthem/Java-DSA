public class NBinaryWithoutOneConsecutiv {
    public void result(int n , String ans,int lastFlag){
        if(n == 0){
            System.out.println(ans);
            return;
        }
        if(lastFlag ==0){
            result(n - 1, ans + 0, 0);
            result(n - 1, ans + 1, 1);
        }else{
            result(n-1, ans + 0, 0);
        }
    }
    public static void main(String[] args) {
        NBinaryWithoutOneConsecutiv obj = new NBinaryWithoutOneConsecutiv();
        obj.result(3, "", 0);
    }
}
