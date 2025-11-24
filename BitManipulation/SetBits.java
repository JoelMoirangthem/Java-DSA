public class SetBits {
    public int noSet(int num){
        int count = 0;
        while (num >0){
            if((num & 1 ) == 1){
                count ++;
            }
            num = num >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        SetBits obj = new SetBits();
        System.out.println(obj.noSet(27));
    }
}
