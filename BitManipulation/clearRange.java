public class clearRange {
    public int clear(int num , int start , int end){
        int left = ((~0) << end + 1);
        int right = (1 << start) - 1;
        int compare = left | right;
        return num & compare;
    }
    public static void main(String[] args) {
        clearRange obj = new clearRange();
        System.out.println(obj.clear(683, 2, 7));
    }
}
