public class clearLastIthBith {
    public int clear(int num , int place){
        num = (num &((~0) << place));
        return num;
    }
    public static void main(String[] args) {
        clearLastIthBith obj = new clearLastIthBith();
        System.out.println(obj.clear(10, 2));
    }
}
