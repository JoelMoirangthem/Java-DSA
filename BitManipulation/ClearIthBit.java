public class ClearIthBit {
    public int clear(int num , int place){
        num = (num&(~(1<<place)));
        return num;
    }
    public static void main(String[] args) {
        ClearIthBit obj = new ClearIthBit();
        System.out.println(obj.clear(10, 1));
    }
}
