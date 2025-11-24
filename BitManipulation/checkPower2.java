public class checkPower2 {
    public boolean check(int num){
        if (num == 1 || (num & num-1) == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        
    }
}
