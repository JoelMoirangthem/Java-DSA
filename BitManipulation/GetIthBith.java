// package BitManipulation;

public class GetIthBith {
    public int ans(int num , int i){
        if ((num &(1 << i))== 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        GetIthBith obj = new GetIthBith();
        System.out.println(obj.ans(4,2));
    }
}
