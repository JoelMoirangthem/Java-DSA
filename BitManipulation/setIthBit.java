public class setIthBit {
    public int setBit(int num , int set , int place){
        num = (num | (set << place));
        return num;
    }
    public static void main(String args[]){
        setIthBit obj = new setIthBit();
        System.out.println(obj.setBit(4, 1, 0));
    }
}
